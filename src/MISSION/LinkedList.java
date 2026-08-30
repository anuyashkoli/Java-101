package MISSION;

public class LinkedList {
    private Node head;

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
}
