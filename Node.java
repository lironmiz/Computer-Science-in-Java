import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
* Class Node.java
* A class that represents an implementation of a binary tree in java
*/
public class Node
{
  // Attributes of the class Node
  private int _number;
  private Node _leftSon, _rightSon;
  /**
  * Constructor of the class Node
  * @param int (number)
  * @return None
  */
  public Node (int number)
  {
      _number = number;
      _leftSon = null;
      _rightSon = null;
  }// end of method Node
  /**
  * Method returns the number in node
  * @param None
  * @return int
  */
  public int getNumber()
  {
      return _number;
  }// end of method getNumber
  /**
  * Method returns the left node
  * @param None
  * @return Node
  */
  public Node getLeftSon()
  {
      return _leftSon;
  }// end of method getLeftSon
  /**
  * Method returns the right node
  * @param None
  * @return Node
  */
  public Node getRightSon()
  {
      return _rightSon;
  }// end of method getRightSon
  /**
  * main method
  * @param args (array type java.lang)
  * @return None
  */
  public static void main(String[] args) 
  {
       // making node
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       // making tree
       a._leftSon = b;
       a._rightSon = c;
       b._leftSon = d;
       b._rightSon = e;
       c._rightSon = f;
       // Visualise of the tree
       //           1
       //          / \
       //         2   3
       //        / \   \
       //       4  5    6
       // call the methods
       //depthFirstValueRecursion(a); // output 1, 2, 4, 5, 3, 6
       //breadFirstValuesQueue(a); // output 1, 2, 3, 4, 5, 6
       //System.out.println(treeIncludesBreadFirst(a, 5)); // output true
       //System.out.println(treeIncludesBreadFirst(a, 22)); // output false
       //System.out.println(treeIncludesRecursion(a,3)); //output true
       //System.out.println(treeIncludesRecursion(a,100)); //output false
       //System.out.println(treeSumRecursion(a));//output 21
       //System.out.println(treeSumBreadFirst(a)); // output 21
       //System.out.println(treeMinDepthFirst(a)); // output 1
       //System.out.println(treeMinRecursion(a)); // output 1
       System.out.println(maxPathSum(a)); // output 10
  }// end of method main
  /**
  * depth first value (DFS) is algorithm for traversing or searching tree
  * or graph data structures. The algorithm starts at the root node
  * and explores as far as possible along each branch before backtracking
  * For example according to the tree above
  * depth first value Stack return 1, 2, 4, 5, 3, 6 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the stack or which depends on the size of the input)
  * @param Node
  * @return None
  */
  // Stack approach
  public static void depthFirstValueStack(Node root)
  {
    // making stack of node object
    Stack<Node> stack = new Stack<>(); 
    stack.push(root);
    // looping untlii stack empty
    while(!stack.empty())
    {
        Node curr = stack.pop();
        // print the value
        System.out.println(curr._number);
        // checking if right and left son are not Null
        if(curr._rightSon != null)
        {
            stack.push(curr._rightSon);
        }
        if(curr._leftSon != null)
        {
            stack.push(curr._leftSon);
        }
    }  
  }// end of method depthFirstValueStack
  // Recursion approach
  /**
  * depth first value recursion return 1, 2, 4, 5, 3, 6 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the call stack or which depends on the size of the input)
  * @param Node
  * @return None
  */
  public static void depthFirstValueRecursion(Node root)
  {
      if(root != null)
      {
          // print the value 
          System.out.println(root._number);
          // recursion calls
          depthFirstValueRecursion(root._leftSon);
          depthFirstValueRecursion(root._rightSon);
      }
  }// end of method depthFirstValueRecursion
  /**
  * breadth first values (BFS) is an algorithm that is used to graph data or searching tree or traversing structures. 
  * breadth first values queue return 1, 2, 3, 4, 5, 6 with binary tree example in main methodthe 
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the stack or which depends on the size of the input)
  * @param Node
  * @return None
  */
  public static void breadFirstValuesQueue(Node root)
  {
    // making queue of type node 
    Queue<Node> queue = new LinkedList<>();
    // adding the root node
    queue.add(root); 
    // checking if the root is no null
    if(root != null)
    {
        // looping until size of queue is 0 
        while (queue.size() > 0)
        {
            Node curr = queue.remove();
            // print the value
            System.out.println(curr._number);
            // adding the left and right son to queue and checking there no null
            if (curr._leftSon != null)
            {
                queue.add(curr._leftSon);
            }
            if(curr._rightSon != null)
            {
                queue.add(curr._rightSon);
            }
        }
    }
  }// end of method breadFirstValueQueue
  /**
  * treeIncludes bread first approach The method checks if there is any object in flight, if so it will return true otherwise false
  * treeIncludes wil return true with input 3 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the stack or which depends on the size of the input)
  * @param Node, int 
  * @return boolean
  */
  public static boolean treeIncludesBreadFirst(Node root, int target)
  { 
    // making queue of type node 
    Queue<Node> queue = new LinkedList<>();
    // adding the root node
    queue.add(root); 
    // checking if the root is no null
    if(root != null)
    {
        // looping until size of queue is 0 
        while (queue.size() > 0)
        {
            Node curr = queue.remove();
            if(curr._number == target)
            {
                return true;
            }
            // adding the left and right son to queue and checking there no null
            if (curr._leftSon != null)
            {
                queue.add(curr._leftSon);
            }
            if(curr._rightSon != null)
            {
                queue.add(curr._rightSon);
            }
        }
    }
    return false;
  }// end of method treeIncludesBreadFirst
  /**
  * treeIncludes recursion approach The method checks if there is any object in flight, if so it will return true otherwise false
  * treeIncludes wil return true with input 3 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the call stack which depends on the size of the input)
  * @param Node, int 
  * @return boolean
  */
  public static boolean treeIncludesRecursion(Node root, int target)
  {
     // checking if the root is no null
     if(root != null)
     {
         // checking if the curr root is equal target
         if(root._number == target)
         {
             return true;
         }
         // or statment if we fount the target in the left or the right side of the binary tree
         return treeIncludesRecursion(root._leftSon, target) || treeIncludesRecursion(root._rightSon, target);
     }
     return false;
  }// end of method treeIncludesRecursion
  /**
  * treeSum recursion approach The method will return the sum of binary tree
  * treeSum wil return 21 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the call stack which depends on the size of the input)
  * @param Node 
  * @return int
  */
  public static int treeSumRecursion(Node root)
  {
      // checking if the root is no null
      if (root != null)
      {
          // return the curr root number + the left and right sum of the binary tree
          return root._number + treeSumRecursion(root._leftSon) + treeSumRecursion(root._rightSon);
      }
      return 0;
  }// end of method treeSumRecursion
  /**
  * treeSum bread first approach The method will return the sum of binary tree
  * treeSum wil return 21 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the stack which depends on the size of the input)
  * @param Node 
  * @return int
  */
  public static int treeSumBreadFirst(Node root)
  {
      // checking if the root is no null
      if (root != null)
      {
          int sumBinaryTree = 0;
          // making queue of type node 
          Queue<Node> queue = new LinkedList<>();
          queue.add(root);
          // looping until size of queue is 0 
          while(queue.size() > 0)
          {
              if (root != null)
              {
                  Node curr = queue.remove();
                  sumBinaryTree += curr._number;
                  if(curr._leftSon != null)
                  {
                    queue.add(curr._leftSon);
                  }
                  if(curr._rightSon != null)
                  {
                     queue.add(curr._rightSon); 
                  }
              }
              else
              {
                  return sumBinaryTree;
              }
          }
          return sumBinaryTree;
      }
      return 0;
  }// end of method treeSumBreadFirst
  /**
  * treeMin depth first approach the method will return the min number of binary tree
  * treeMin wil return 1 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the stack which depends on the size of the input)
  * @param Node 
  * @return int
  */
  public static int treeMinDepthFirst(Node root)
  {
      int smallest = Integer.MAX_VALUE;
      // the tree in no null
      // making stack of node object
      Stack<Node> stack = new Stack<>(); 
      stack.push(root);
      // looping until stack is empty
      while(stack.size() > 0)
      {
          Node curr = stack.pop();
          if (curr._number < smallest)
          {
              smallest = curr._number;
          }
          if (curr._leftSon != null)
          {
              stack.add(curr._leftSon);
          }
          if (curr._rightSon != null)
          {
              stack.add(curr._rightSon);
          }
      }
      return smallest;
  }// end of method treeMinDepthFirst
  /**
  * treeMin recursion approach the method will return the min number of binary tree
  * treeMin wil return 1 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the call stack which depends on the size of the input)
  * @param Node 
  * @return int
  */
  public static int treeMinRecursion(Node root)
  {
      // checking if the tree is null
      if (root == null)
      {
          return Integer.MAX_VALUE;
      }
      // recursion call to the left and right nodes
      int leftMin = treeMinRecursion(root._leftSon);
      int rightMin = treeMinRecursion(root._rightSon);
      // check whe is the smallest and return him
      return Math.min(root._number,Math.min(leftMin, rightMin));
  }// end of method treeMinRecursion
  /**
  * maxPathSum recursion approach the method will return the path from root to leaf with the biggest sum in binary tree
  * treeMin wil return 1, 3, 6 with binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the call stack which depends on the size of the input)
  * @param Node 
  * @return int
  */
  public static int maxPathSum(Node root)
  {
      if(root == null)
      {
          return Integer.MIN_VALUE;    
      }
      // if the root is leaf return the root number
      if (root._leftSon == null && root._rightSon == null)
      {
          return root._number;
      }
      // checking whe the bigger sum and return him
      int maxChildPathSum = Math.max(maxPathSum(root._leftSon), maxPathSum(root._rightSon)); 
      return root._number + maxChildPathSum;
  }// end of method maxPathSum
  /**
  * PathSumToTarget recursion approach the method will return the path from root to leaf with the sum equal the targat num
  * PathSumToTarget wil return true with the input 10 and the root node with the binary tree example in main method
  * Time complexity n = number of nodes -> O(n)
  * Spce complexity = O(n) (Because of the memory of the call stack which depends on the size of the input)
  * @param Node, int
  * @return boolean
  */
  public static boolean pathSumToTarget(Node root, int num)
  {
      // checking if we fount a path
      if( num == 0 && root == null)
      {
          return true;
      }
      // if we dont find a path and the curr root in null we return false
      if (root == null)
      {
          return false;
      }
      // checking the left side of the tree by recursion
      boolean left = something(root.getLeftSon(). num - root._number());
      boolean right = false;
      // if we dont find a path in the left side of the binary tree
      if(!left)
      {
          right = PathSumToTarget(root.getRightSon(), num - root.getNumber());
      }
      // checking if we find a path in the left or the right side
      if(left || right)
      {
          System.out.print(root._number + " ");
      }
      return left || right;
  }// end of method PathSumToTarget 
}// end of class Node
