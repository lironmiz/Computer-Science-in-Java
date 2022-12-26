
/**
 * IntNode.java
 */
public class IntNode
{
    private int _value;
    private IntNode _next;
    
    public IntNode(int val, IntNode n)
    {
        _value = val;
        _next = n;
    }// end of method IntNode
    
    public IntNode getNext()
    {
        return _next;
    }// end of method getNext
    
    public void setNext(IntNode node)
    {
        _next = node;
    }// end of method setNext
    
    public int getValue()
    {
        return _value;
    }// end of method getValue
    
    public void setValue(int v)
    {
        _value = v;
    }// end of method setValue
    
}// end of class IntNode