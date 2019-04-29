package kapitel12;

public class BinaryTree<T extends Comparable> {

    private Node<T> root = null;
    private int size = 0;

    public void add(T data){
        Node<T> newNode = new Node(data);

        if(root == null){
            root = newNode;
            size++;
            return;
        }

        add(root, newNode);
    }


    private void add(Node<T> currentNode, Node<T> newNode){
        int result = newNode.getData().compareTo(currentNode.getData());

        if(result < 0){
            if(currentNode.getLeftNode() == null){
                currentNode.setLeftNode(newNode);
                size++;
            }else{
                add(currentNode.getLeftNode(), newNode);
            }
        }else if(result > 0){
            if(currentNode.getRightNode() == null){
                currentNode.setRightNode(newNode);
                size++;
            }else{
                add(currentNode.getRightNode(), newNode);
            }
        }

    }


    public void print(){
        if(root != null){
            print(root);
        }else{
            System.out.println("Empty Tree");
        }
    }

    // in-order
    private void print(Node<T> currentNode){
        if(currentNode.getLeftNode() != null){
            print(currentNode.getLeftNode());
        }
        System.out.println(currentNode.getData());
        if(currentNode.getRightNode() != null){
            print(currentNode.getRightNode());
        }
    }


    public int size(){
        return size;
    }

    private class Node<T>{
        private Node<T> leftNode;
        private T data;
        private Node<T> rightNode;


        public Node(T data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        public T getData(){
            return data;
        }

        public Node<T> getLeftNode(){
            return leftNode;
        }

        public void setLeftNode(Node<T> leftNode){
            this.leftNode = leftNode;
        }

        public Node<T> getRightNode(){
            return rightNode;
        }

        public void setRightNode(Node<T> rightNode){
            this.rightNode = rightNode;
        }

    }
}
