package kapitel12;

import kapitel9.Student;

public class LinkedListStudent {

    private Node firstNode = null;

    public void add(Student data){
        if(firstNode == null){
            firstNode = new Node(data);
            return;
        }

        Node currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(new Node(data));
    }

    public Student remove(int studentId){
        if(firstNode != null){
            Node currentNode = firstNode;
            while(currentNode.getData().getStudentId() != studentId){
                currentNode = currentNode.getNextNode();
            }
            
        }
        return null;
    }

    private class Node{
        private Student data;
        private Node nextNode;

        public Node(Student data){
            this.data = data;
            this.nextNode = null;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public void setLastNodeInLinkedList(Node nextNode){
            if(this.nextNode != null){
                this.nextNode.setLastNodeInLinkedList(nextNode);
            }else{
                this.nextNode = nextNode;
            }

        }

        public Node getNextNode(){
            return this.nextNode;
        }

        public Student getData() {
            return this.data;
        }

    }
}
