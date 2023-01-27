//*******************************************************
// BinarySearchTree.java
// A class that represents an implementation of binary search tree in java
// Author: liron mizrahi
//*******************************************************
public class BinarySearchTree
{
   private Node _root;
   /**
   * constructor of the class
   * @param None
   * @return None
   */
   public BinarySearchTree()
   {
       _root = null;
   }// end of method BinarySearchTree
   /**
   * getMinValue return the min value in the BST
   * @param None
   * @return int
   */
   public int getMinValue(Node node)
   {
       Node curr = node;
       while(curr._left != null)
       {
           curr = curr._left;
       }
       return curr._key;
   }// end of method getMinValue
   /**
   * getMaxValue return the max value in the BST
   * @param None
   * @return int
   */
   public int getMaxValue(Node node)
   {
       Node curr = node;
       while(curr._right != null)
       {
           curr = curr._right;
       }
       return curr._key;
   }// end of method getMaxValue
   /**
   * insert method insert a key to the BST 
   * @param int
   * @return None
   */
   public void insert(int key)
   {
       _root = insert(_root, key);
   }// end of method insert
   /**
   * search method will search if the key is exists in the BST 
   * @param int
   * @return Node
   */
   public Node search(int key)
   {
       return search(_root, key);
   }// end of method search
   /**
   * delete method will delete a node if exists in the BST 
   * @param int
   * @return Node
   */
   public Node delete(int key)
   {
       return delete(_root, key);
   }// end of method delete
   /**
   * findCeil method will find the smalest key in the tree thet greater or equal to the tree
   * @param int
   * @return int 
   */
   public int findCeil(int input)
   {
       return findCeil(_root, input);
   }// end of method findCeil
   /**
   * findFloor method will delete a node if exists in the BST 
   * @param int
   * @return int
   */
   public int findFloor(int input)
   {
       return findFloor(_root, input);
   }// end of method findFloor
   // private methods
   /**
   * private insert method insert a key to the BST 
   * @param Node, int
   * @return Node
   */
   private Node insert(Node node, int key)
   {
       if(_root == null)
       {
           _root = new Node(key);
           return _root;
       }
       if (node._key > key)
       {
           node._left = insert(node._left, key);
       }
       else
       {
           node._right = insert(node._right, key);
       }
       return node;
   }// end of method insert
   /**
   * private search method will search if the key is exists in the BST 
   * @param Node, int
   * @return Node
   */   
   private Node search(Node node, int key)
   {
       // if key not in tree
       if (node == null)
       {
           return null;
       }
       // if found key
       if (node._key == key)
       {
           return node;
       }
       else if( node._key > key)
       {
           return search(node._left, key);
       }
       else
       {
           return search(node._right, key);
       }
   }// end of method search
   /**
   * private delete method will delete a node if exists in the BST 
   * @param Node, int
   * @return Node
   */
   private Node delete(Node node, int key)
   {
       if (node == null) // the key not in tree
       {
           return null;
       }
       if (node._key > key)
       {
           node._left = delete(node._left, key);
       }
       else if(node._key < key)
       {
           node._right = delete(node._right, key);
       }
       else // we found target node
       {
           // case 1: node is a leaf
           if( node._right == null && node._left == null)
           {
               return null;
           }
           // case 2: node has 1 subtree
           if (node._right == null)
           {
               return node._left;
           }
           else if(node._right == null)
           {
               return node._left;
           }
           // case 3: node has both subtrees
           int replaceKey = getMinValue(node._right);
           node._key = replaceKey;
           node._right = delete(node._right, key);
       }
       return node;
   }// end of method delete
   /**
   * private findCeil method will find the smalest key in the tree thet greater or equal to the tree
   * @param int
   * @return int 
   */
   private int findCeil(Node node, int input)
   {
       if (node == null)
       {
           return -1;
       }
       if( node._key == input)
       {
           return node._key;
       }
       if(node._key < input)
       {
           return findCeil(node._right, input);
       }
       
       int ceil = findCeil(node._left, input);
       if(ceil >= input)
       {
           return ceil;
       }
       else
       {
           return node._key;
       }
   }// end of method findCeil
   /**
   * private findFloor method will find the biggest key in the tree thet greater or equal to the tree
   * @param int
   * @return int 
   */
   private int findFloor(Node node, int input)
   {
       if (node == null)
       {
           return -1;
       }
       if(node._key == input)
       {
           return node._key;
       }
       if(node._key > input)
       {
           return findFloor(node._left, input);
       }
       int floor = findFloor(node._right, input);
       if (floor >= node._key)
       {
         return floor;  
       }
       return node._key;    
   }// end of method findFloor
   
   // traversal methods for BST
   /**
   * printPostOrder method will print the values in the tree in post order
   * @param None
   * @return None 
   */
   public void printPostOrder()
   {
      printPostOrder(_root); 
   }// end of method printPostOrder
   /**
   * printPreOrder method will print the values in the tree in pre order
   * @param None
   * @return None 
   */
   public void printPreOrder()
   {
       printPreOrder(_root);
   }// end of method printPreOrder
   /**
   * printInOrder method will print the values in the tree in InOrder
   * @param None
   * @return None 
   */
   public void printInOrder()
   {
       printInOrder(_root);
   }// end of method printInOrder
   /**
   * private printPostOrder method will print the values in the tree in post order
   * @param None
   * @return None 
   */
   private void printPostOrder(Node node)
   {
       if(node == null)
       {
           return;
       }
       printPostOrder(node._left);
       printPostOrder(node._right);
       System.out.print(node._key + " ");
   }// end of method printPostOrder
   /**
   * private printInOrder method will print the values in the tree in InOrder
   * @param None
   * @return None 
   */
   private void printInOrder(Node node)
   {
       if(node == null)
       {
           return;
       }
       printInOrder(node._left);
       System.out.print(node._key + " ");
       printInOrder(node._right);
   }// end of method printInOrder
   /**
   * private printPreOrder method will print the values in the tree in pre order
   * @param None
   * @return None 
   */
   private void printPreOrder(Node node)
   {
       if (node == null)
       {
           return;
       }
       printPreOrder(node._right);
       printPreOrder(node._left);
       System.out.print(node._key + " ");
   }// end of method printPreOrder
}// end of class BinarySearchTree
