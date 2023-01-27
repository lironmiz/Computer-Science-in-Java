//*******************************************************
// Node.java
// A class that represents an implementation of a node for binary search tree in java
// Author: liron mizrahi
//*******************************************************
 public class Node
{
    int _key;      
    Node _left;
    Node _right;
    /**
    * constructor of the class
    * @param int data 
    * @return None
    */
    public Node(int data)
    {
        _key = data;
        _left = _right = null;
    }// end of method Node
}// end of class Node
