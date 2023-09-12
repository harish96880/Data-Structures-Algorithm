package Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A", "B");
        myGraph.addVertex("C");
        myGraph.addEdge("C", "A");
        myGraph.addEdge("C", "B");
        myGraph.removeVertex("C");
        myGraph.printList();
    }
}
