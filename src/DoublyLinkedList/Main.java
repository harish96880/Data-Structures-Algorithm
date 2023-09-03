package DoublyLinkedList;
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.prepend(6);
        dlist.append(8);
        dlist.append(18);
        dlist.insert(2, 100);
        dlist.remove(0);
        dlist.remove(2);
        dlist.remove(2);
        System.out.println("Item: " + dlist.get(1).value);
        dlist.printList();
    }
}