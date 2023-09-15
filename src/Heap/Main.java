package Heap;

public class Main {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.insert(90);
        hp.insert(75);
        hp.insert(75);
        hp.insert(100);
        hp.insert(105);
        hp.insert(10);
        hp.remove();
        hp.remove();
        System.out.println(hp.getHeap());
    }
}
