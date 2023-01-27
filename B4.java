//*******************************************************
// B.java
// the class reprsents B
// Author: liron mizrahi
//*******************************************************
public class B extends A
{
    private int _x;
    
    public B(int xA, int xB)
    {
        super(xA);
        _x = xB;
    }// end of method B
    
    public int getX()
    {
        return _x;
    }// end of method getX
    
    public int superX()
    {
        return super.getX();
    }// end of method superX
    
    public int tenTimesX()
    {
        return 10 * _x;
    }// end of method tenTimesX
    
    public int subXhelper()
    {
        return _x * 2;
    }// end of method subXhelper
}// end of class B
