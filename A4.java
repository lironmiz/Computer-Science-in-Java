//*******************************************************
// A.java
// the class reprsents A
// Author: liron mizrahi
//******************************************************
public class A
{
    private int _x;
    public A(int x)
    {
        _x = x;
    }// end of method A
    
    public int getX()
    {
        return _x;
    }// end of method  getX
    
    public int doubleX()
    {
        return 2 * getX();
    }// end of method  doubleX
    
    public int tripleX()
    {
        return 3 * _x;
    }// end of method tripleX
    
    public int subXhelper()
    {
        return _x -1;
    }// end of method subXhelper
    
    public int subX()
    {
        return subXhelper();
    }// end of method subX
}// end of class A
