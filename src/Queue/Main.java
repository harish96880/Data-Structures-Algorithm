package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.getFirst();
        queue.getLast();
        queue.enque(6);
        queue.deque();
        queue.getLength();
        queue.printQueue();
    }
}
