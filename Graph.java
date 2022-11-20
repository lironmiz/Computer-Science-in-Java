import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
* Class Graph.java
* A class that represents an implementation of a undirected Graph using adjacency Matrix in java
*/
public class Graph
{
    private int[][] _adjMatrix;
    private int _V; // number of vertices in graph
    private int _E; // number of edges in graph
    /**
    * constructor of the class
    * @param int
    * @return None
    */
    public Graph(int nodes)
    {
        _V = nodes;
        _E = 0;
        _adjMatrix  = new int[nodes][nodes];    
    }// end of method Graph
    /**
    * addEdge Method add a edge to the graph
    * @param int
    * @return None
    */
    public void addEdge(int u, int v)
    {
        _adjMatrix[u][v] = 1;
        _adjMatrix[v][u] = 1; // because it is an undirected graph
        _E++;
    }// end of method addEdge
    /**
    * toString Method print the graph as a string
    * @param None
    * @return String
    */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_V + " vetices, " + _E + " edges " + "\n");
        for(int v = 0; v< _V; v++)
        {
            sb.append(v + ": ");
            for (int w : _adjMatrix[v])
            {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }// end of method toString
}// end of class Graph
