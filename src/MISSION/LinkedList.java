package MISSION;

public class LinkedList {
    private Node head;

    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.addNode(10);
        link.addNode(11);
        link.addNode(12);
        link.addNode(13);
        link.displayList();
    }

    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node current = head;
            while (current != null ) {
                System.out.print("[" + current.data + "] -> ");
                current = current.nextNode;
            }
            System.out.println("null");
        }
    }
}
