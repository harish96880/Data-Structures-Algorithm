package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("apple", 5);
        ht.set("banana", 10);
        ht.set("verina", 10);
        System.out.println("--------------------");
        System.out.println(ht.get("verina"));
        System.out.println("--------------------");
        System.out.println(ht.keys());
        ht.printTable();
    }
}
