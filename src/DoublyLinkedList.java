public class DoublyLinkedList {
    private Node head;
    private Node last;
    static class Node {
        private int data;
        private Node prev;
        private Node next;
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
        public int getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        public Node getPrev() {
            return prev;
        }
    }
    public Node getHead() {
        return head;
    }
    public Node getLast() {
        return last;
    }
    public void determineLast(){
        Node node = head;
        while (node.next != null && node.next != head){
            node = node.next;
        }
        last = node;
    }
    public void insertFirst(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.prev = null;
        if (head != null)
            head.prev = newNode;
        head = newNode;
        determineLast();
    }
    public void insertAfter(Node prevNode, int new_data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node newNode = new Node(new_data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null)
            newNode.next.prev = newNode;
        determineLast();
    }
    public void insertLast(int newData) {
        if (head == null) {
            insertFirst(newData);
            return;
        }
        Node newNode = new Node(newData);
        determineLast();
        last.next = newNode;
        newNode.prev = last;
        newNode.next = null;
        determineLast();
    }
    public void printlist(Node node) {
        System.out.println("\nElements of double list:");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public void deleteNode(Node del) {
        determineLast();
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.next;
        }
        if (last == del) {
            last = last.prev;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
    }
    public void circularList(){
        if (last != null && head != null){
            last.next = head;
            head.prev = last;
        }
        Node node = head;
        System.out.println("\nElements of circular list:");
        do {
            System.out.print(node.data + " ");
            node = node.next;
        }while (node != head);
    }
}
