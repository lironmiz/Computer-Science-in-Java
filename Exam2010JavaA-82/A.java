public class A
{
    private int _x, _y;
    
    public A()
    {
        _x = 0;
        _y = 0;
    }
    
    public A(int x, int y){
        _x = x;
        _y = y;
    }
    
    public A(A other)
    {
        _x = other._x;
        _y = other._y;
    }
    public int getX()
    {
        return _x;
    }
    public int getY()
    {
        return _y;
    }
    public void increment()
    {
        _x = _x + 1;
        _y = _y + 1;
    }
    public boolean equal(A other)
    {
        return (_x == other._x) && ( _y == other._y);
    }
}