/**
* D.java
* the class represents a D
* Author: liron mizrhai
*/
public class D extends B
{
    public D(int val)
    {
        _x = val - _x;
    }// end of method D
    
    public void f(A a)
    {
        _x = _x + a._x + 1;
    }// end of method f
    
    public void f(D d)
    {
        _x = d._x -1;
    }// end of method f
}// end of class D
