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
        list.append(8);
        System.out.println("The removed element is: " + list.removeLast().value);
        list.prepend(0);
        list.prepend(99);
        System.out.println("Before");
        list.printList();
        System.out.println("The removed element is :" + list.removeFirst().value);
        list.printList();
        list.getLength();
    }
}
