
/**
* Class AvlTree.java
* A class that represents an implementation of AvlTree tree in java
*/
public class AvlTree extends BinarySearchTree
{
    /**
    * height return the height of a subtree stored in node.height or -1 if it empty sub tree
    * @param Node
    * @return int
    */
    private int height(Node node)
    {
        return node != null ? node._height : -1;
    }// end of method height
    /**
    * updateHeight update node.height to the maximum height of the children plus 1
    * @param Node
    * @return None
    */
    private void updateHeight(Node node)
    {
        int leftChilddHeight = height(node._left);
        int rightChildHeight = height(node._right);
        node._height = Math.max(leftChilddHeight, rightChildHeight) + 1;
    }// end of method updateHeight
    /**
    * balanceFactor calculates node balance factor (BF(node) = H(node.right) - H(node.left)
    * @param Node
    * @return int
    */
    private int balanceFactor(Node node)
    {
        return height(node._right) - height(node._left);
    }// end of method balanceFactor
    /**
    * rotateRight rotate the tree to the right according to the algorithm of AVL
    * @param Node
    * @return Node
    */
    private Node rotateRight(Node node) 
    {
        Node leftChild = node._left;

        node._left = leftChild._right;
        leftChild._right = node;

        updateHeight(node);
        updateHeight(leftChild);
        
        return leftChild;
    }// end of method rotateRight
    /**
    * rotateLeft rotate the tree to the left according to the algorithm of AVL
    * @param Node
    * @return Node
    */
    private Node rotateLeft(Node node) 
    {
      Node rightChild = node._right;

      node._right = rightChild._left;
      rightChild._left = node;

      updateHeight(node);
      updateHeight(rightChild);

      return rightChild;
    }// end of method rotateLeft
    /**
    * rebalance balance the AVL tree by 4 cases according to the algorithm of AVL tree
    * @param Node
    * @return Node
    */
    private Node rebalance(Node node) 
    {
      int balanceFactor = balanceFactor(node);

      // Left-heavy?
      if (balanceFactor < -1)
      {
           // Case 1
           if (balanceFactor(node._left) <= 0)
           {    
              // Rotate right
              node = rotateRight(node);
           }
           else // Case 2
           {                                
              // Rotate left-right
              node._left = rotateLeft(node._left);
              node = rotateRight(node);
           }
      }

      // Right-heavy?
      if (balanceFactor > 1)
      {
        // Case 3
        if (balanceFactor(node._right) >= 0)
        {    
          // Rotate left
          node = rotateLeft(node);
        }
        else // Case 4
        {                                 
          // Rotate right-left
          node._right = rotateRight(node._right);
          node = rotateLeft(node);
        }
      }   
      return node;
    }// end of method rebalance
    /**
    * insetNode will insert a node to the AVL tree
    * @param Node, int
    * @return Node
    */
    public Node insertNode(int key, Node node)
    {
      node = super.insert(key);

      updateHeight(node);

      return rebalance(node);
    }// end of method insetNode
    /**
    * deleteNode will delete a node from the AVL tree
    * @param Node, int
    * @return Node
    */
    public Node deleteNode(int key, Node node) 
    {
      node = super.delete(key);

      // Node is null if the tree doesn't contain the key
      if (node == null)
      {
        return null;
      }

      updateHeight(node);

      return rebalance(node);
    }// end of method deletNode
}// end of class AvlTree
