package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.printList();
        System.out.println("--------------");
        list.reverse();
        list.printList();
    }
}
