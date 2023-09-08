package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.insert(5));
        System.out.println(bst.insert(6));
        System.out.println(bst.insert(4));
        System.out.println(bst.insert(3));
        System.out.println("value is = " + bst.root.left.left.value);
        System.out.println(bst.contains(119));
    }
}
