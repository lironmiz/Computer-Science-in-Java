import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
* Class GraphLinkedList.java
* A class that represents an implementation of a undirected Graph using linkedList in java
*/
public class GraphLinkedList
{
    private LinkedList<Integer>[] adj;
    private int V; // number of vertices
    private int E; // number of edges
    /**
    * constructor of the class
    * @param int
    * @return None
    */
    public GraphLinkedList(int nodes)
    {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v = 0; v < V; v++)
        {
            adj[v] = new LinkedList<>();
        }
    }// end of method GraphLinkedList
    /**
    * addEdge Method add a edge to the graph
    * @param int
    * @return None
    */
    public void addEdge(int u, int v)
    {
        adj[u].add(v);
        adj[v].add(u);
        this.E++;
    }// end of method addEdge
    /**
    * toString Method print the graph as a string
    * @param None
    * @return String
    */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges "  + "\n");
        for(int v = 0; v < V; v++)
        {
          sb.append(v + ": ");
          for(int w : adj[v])
          {
             sb.append(w + " "); 
          }
          sb.append("\n");
        }
        return sb.toString();
    }// end of method toString
    /**
    * bfs Method print the graph as a string in bfs order
    * @param int 
    * @return None
    */
    public void bfs(int s) 
    {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        
        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.println(u + " ");
            
            for(int v : adj[u])
            {
               if(!visited[v])
               {
                  visited[v] = true;
                  q.offer(v);
               }
            }
        }
    }// end of method bfs
    /**
    * dfs Method print the graph as a string in dfs order
    * @param int 
    * @return None
    */
    public void dfs(int s)
    {
         boolean[] visited = new boolean[V];
         Stack<Integer> stack = new Stack<>();
         stack.push(s);
         
         while(!stack.isEmpty())
         {
             int u = stack.pop();
             if(!visited[u])
             {
                 visited[u] = true;
                 System.out.println(u + " ");
                 
                 for(int v : adj[u])
                 {
                     if(!visited[v])
                     {
                         stack.push(v);
                     }
                 }
             }
         }
    }// end of method dfs
    /**
    * dfsRecursive Method print the graph as a string in dfs order
    * @param None
    * @return None
    */
    public void dfsRecursive()
    {
        boolean[] visited = new boolean[V];
        for(int v=0; v < V; v++)
        {
            if(!visited[v])
            {
                dfs(v, visited);
            }
        }
    }// end of method dfsRecursive
    /**
    * dfs recursive Method print the graph as a string in dfs order
    * @param int boolean[]
    * @return None
    */
    public void dfs(int v, boolean[] visited)
    {
        visited[v] = true;
        System.out.println(v + " ");
        for( int w : adj[v])
        {
            if(!visited[w])
            {
                dfs(w, visited);
            }
        }
    }// end of method dfs
}// end of class GraphLinkedList
