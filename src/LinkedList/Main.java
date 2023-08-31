package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.getHead();
        list.getTail();
        list.getLength();

        list.printList();

        list.append(6);
        list.append(8);
        list.printList();
    }
}
