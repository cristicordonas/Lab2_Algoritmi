public class SimplyLinkedList {
    private Node head;
    static class Node {
        private int data;
        private Node next;
        Node(int d) {
            data = d;
            next = null;
        }
        public Node getNext() {
            return next;
        }
        public int getData() {
            return data;
        }
    }
    public Node getHead() {
        return head;
    }
    public void insertFirst(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    public void insertLast(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
    }
    public void printList() {
        Node node = head;
        System.out.println("\nElements of simple list:");
        while (node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public void deleteFirst(){
        head = head.next;
    }
    public void deleteAfter(Node prevNode){
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = head;
        while(newNode != prevNode.next){
            newNode = newNode.next;
        }
        prevNode.next = newNode.next;
    }
    public void deleteLast(){
        Node last = head;
        Node secondLast = head;
        while(last.next != null){
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
    }
}
