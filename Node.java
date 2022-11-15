/**
* Class Node.java
* A class that represents an implementation of a node for AVL tree in java
*/
 public class Node
{
    int _key;      
    Node _left;
    Node _right;
    int _height;
    
    /**
    * constructor of the class
    * @param int
    * @return None
    */
    public Node(int data)
    {
        _key = data;
    }// end of method Node
}// end of class Node
