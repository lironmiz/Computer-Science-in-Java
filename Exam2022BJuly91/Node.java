/**
* Node.java
*/
public class Node
{
   public int _number;
   public Node _leftSon, _rightSon;
   
   public Node(int number)
   {
       _number = number;
       _leftSon = null;
       _rightSon = null;
   }// end of mehtod Node
   
   public int getNumber()
   {
       return _number;
   }// end of method getNumber
   
   public Node getLeftSon()
   {
       return _leftSon;
   }// end of method getLeftSon
   
   public Node getRightSon()
   {
       return _rightSon;
   }// end of method getRightSon
   
   public static boolean f(Node root, int num)
   {
       if(root == null)
       {
           return false;
       }
       if(root.getNumber() == num)
       {
           return true;
       }
       return f(root.getLeftSon(), num) || f(root.getRightSon(), num);
   }// end of method f
   
   public static int what(Node root, int x)
   {
       if(f(root, x))
       {
           return secret(root, x);
       }
       return 0;
   }// end of method what
   
   public static int secret(Node root, int x)
   {
       if(root == null)
       {
           return 0;
       }
       if((root.getLeftSon() != null && (root.getLeftSon()).getNumber() == x) || (root.getRightSon() != null && (root.getRightSon()).getNumber() == x))
       {
           return root.getNumber() + secret(root.getLeftSon(), x) + secret(root.getRightSon(), x);
       }
       return secret(root.getLeftSon(), x) + secret(root.getRightSon(), x);
   }// end of method secret
}// end of class Node
