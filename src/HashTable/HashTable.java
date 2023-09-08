package HashTable;

class Node{
    private String key;
    private int value;
    private Node next;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class HashTable {
    private int size = 7;
    private Node[] datamap;

    HashTable() {
        datamap = new Node[size];
    }
}
