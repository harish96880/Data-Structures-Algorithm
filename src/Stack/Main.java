package Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(0);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.getTop();
        stack.getHeight();
        stack.printList();
    }
}
