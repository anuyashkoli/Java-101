package MISSION;

class Node {
    public int data;
    public Node nextNode;

    public Node(int Data) {
        data = Data;
        nextNode = null;
    }

    // Getter
    public int getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
