package kapitel12;

public class LinkedList<T> {

    private Node<T> firstNode = null;
    private int size = 0;

    public void add(T data){
        size++;
        Node<T> newNode = new Node(data);

        if(firstNode == null){
            firstNode = newNode;
            return;
        }

        Node<T> currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }

    public T remove(T data){
        if(firstNode != null){

            if(firstNode.getData().equals(data)){
                firstNode = firstNode.getNextNode();
                size--;
                return data;
            }

            Node<T> currentNode = firstNode;
            while(currentNode.getNextNode() != null){
                if(currentNode.getNextNode().getData().equals(data)){
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    size--;
                    return data;
                }
                currentNode = currentNode.getNextNode();
            }
        }
        return null;
    }

    public int size(){
        return size;
    }


    private class Node<T>{
        private T data;
        private Node<T> nextNode;

        public Node(T data){
            this.data = data;
        }

        public void setNextNode(Node<T> nextNode){
            this.nextNode = nextNode;
        }

        public Node<T> getNextNode(){
            return nextNode;
        }

        public T getData(){
            return data;
        }
    }
}
