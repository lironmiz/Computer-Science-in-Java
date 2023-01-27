import java.util.Stack;
//*******************************************************
// Node.java
// the class reprsents Node
// Author: liron mizrahi
//*******************************************************
public class Node
{
    int _number;
    Node _leftSon, _rightSon;
    
    public Node(int number)
    {
        _number = number;
        _leftSon = null;
        _rightSon = null;
    }// end of method Node 
    
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
    // what method in the exam 
    public static String what(Node t)
    {
        String output = "(";
        if(t.getLeftSon() != null)
        {
            output += what(t.getLeftSon());
        }
        output += t.getNumber();
        if(t.getRightSon() != null)
        {
            output += what(t.getRightSon());
        }
        output += ")";
        return output;
    }// end of method what
    // what method enswer in ex4 section D 
    public static String what1(Node t)
    {
        String output = "(";
          // Base Case
        if (t == null)
        {
            return output;
        }
        output += t.getNumber();
        output += what1(t._leftSon);
        output += ")";
        output += what1(t._rightSon);
        return output;
    } // end of method what1    
}// end of class node
