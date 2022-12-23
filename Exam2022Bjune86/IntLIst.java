
/**
 * IntList.java
 */
public class IntList
{
    private IntNode _head;
    
    public void IntList()
    {
        _head = null;
    }// end of method IntList
    
    public void setHead(IntNode node)
    {
        _head = node;
    }// end of method setHead
    
    public int what(int k)
    {
        int m = 0, f = 0, b = 0, s = 0;
        IntNode fp = _head, bp = _head;
        while( fp != null)
        {
            if(fp.getValue() == 0)
            {
                s++;
                if(s > k)
                {
                    while(bp.getValue() != 0)
                    {
                        b++;
                        bp = bp.getNext();
                    }
                    b++;
                    bp = bp.getNext();
                    s--;
                }
            }
            if(f - b + 1 > m)
            {
                m = f - b + 1;
            }
            f++;
            fp = fp.getNext();
        }
        return m;
    }
}// end of class IntList
