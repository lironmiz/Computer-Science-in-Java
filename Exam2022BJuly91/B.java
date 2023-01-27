/**
* B.java
* the class represents a B
* Author: liron mizrhai
*/
public class B extends A
{
    public B()
    {
        super();
    }// end of method B
    
    public B(int val)
    {
        _x = f(val);
    }// end of method B
    
    public int f(int x)
    {
        return _x + x;
    }// end of method f
    
    public void f(B b)
    {
        _x = _x * b._x;
    }// end of method f
}// end of class B
