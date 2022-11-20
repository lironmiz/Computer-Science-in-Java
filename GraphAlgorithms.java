import java.util.Scanner;
/**
* Class GraphAlgorithms.java
* A class that have a graph algorithms 
*/
public class GraphAlgorithms
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       // making a undirected graph using adjacency matrix
       Graph g = new Graph(4);
       g.addEdge(0, 1);
       g.addEdge(1, 2);
       g.addEdge(2, 3);
       g.addEdge(3, 0);
       System.out.println(g);
       // making a undirected graph using linked list
       GraphLinkedList g1 = new GraphLinkedList(4);
       g1.addEdge(0, 1);
       g1.addEdge(1, 2);
       g1.addEdge(2, 3);
       g1.addEdge(3, 0);
       System.out.println(g1);
       // print undirected graph using linked list in bfs algorithms
       GraphLinkedList g2 = new GraphLinkedList(5);
       g2.addEdge(0, 1);
       g2.addEdge(1, 2);
       g2.addEdge(2, 3);
       g2.addEdge(3, 0);
       g2.addEdge(2, 4);
       g2.bfs(0);
       System.out.println("now dfs order: ");
       g2.dfs(0);
       System.out.println("now dfs recursive: ");
       g2.dfsRecursive();
   }// end of main method
}// end of class GraphAlgoriths
