package HashTable;

import java.util.ArrayList;

class Node{
    String key;
    int value;
    Node next;

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

    private int hash(String key) {
        int hash = 0;
        char keyArray[] = key.toCharArray();
        for(int i = 0; i < keyArray.length; i++) {
            int asciiValue = keyArray[i];
            hash = (hash + asciiValue * 23) % datamap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        Node newNode = new Node(key, value);
        int index = hash(key);
        if(datamap[index] == null) {
            datamap[index] = newNode;
        } else {
            Node temp = datamap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < datamap.length; i++) {
            Node temp = datamap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = datamap[index];
        while (temp != null) {
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }
    public void printTable() {
        for(int i = 0; i < datamap.length; i++) {
            System.out.println(i + ":");
            Node temp = datamap[i];
            while(temp != null) {
                System.out.println("    {" + temp.key + " ," + temp.value + "}");
                temp = temp.next;
            }
        }
    }
}
