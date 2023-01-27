//*******************************************************
// IntList.java
// the class reprsents IntList
// Author: liron mizrahi
//*******************************************************
public class IntList
{
    private IntNode _head;
    
    public void IntList(IntNode node)
    {
        _head = node;
    }// end of method IntList
    
    public void secret()
    {
        IntNode p = null, ptr = _head, temp;
        while (ptr != null)
        {
            temp = ptr.getNext();
            ptr.setNext(p);
            p = ptr;
            ptr = temp;
        }
        _head = p;
    }// end of method secret
    
    public boolean what()
    {
        boolean ans = true;
        IntNode p1 = _head, p2 = _head;
        IntNode m = null;
        if (_head == null)
        {
            return true;
        }
        while(p2 != null)
        {
            p2 = p2.getNext();
            if(p2!= null)
            {
                p2 = p2.getNext();
            }
            if(p2 != null)
            {
                p1 = p1.getNext();
            }
        }
        m = p1;
        //IntList part = new IntList(m.getNext());
        //part.secret();
        //m.setNext(part._head);
        p1 = _head;
        //p2 = m.getNext();
        while(ans == true && p2 != null)
        {
            if(p1.getValue() != p2.getValue())
            {
                ans = false;
            }
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        //part.secret();
        //m.setNext(part._head);
        return ans;
    }// end of method what
}// end of class IntList
