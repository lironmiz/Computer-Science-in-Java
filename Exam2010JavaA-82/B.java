
public class B
{
    
    private double _x, _y;
    
    public B()
    {
        _x = 1.0;
        _y = -1.0;
    }
    public B(double x, double y)
    {
        _x = x;
        _y = y;
    }
    public boolean equals(B other)
    {
        return (_x == other._x) && (_y == other._y);
    }
    public boolean equals( A other)
    {
        return (_x == other.getX()) && (_y == other.getY());
    }
}
