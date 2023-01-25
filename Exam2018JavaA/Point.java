/**
 * Point.java
 * the class reprsents a Point
 * Author: liron mizrhai
 */
public class Point
{
    public int _x;
    public  int _y;
    /**
     * the constractor of the class Point
     * @param: int x, int y
     * @return: None
     */
    public Point(int x, int y)
    {
        _x = x;
        _y = y;
    }// end of method Point
     /**
     * copy constractor of the class Point
     * @param: Point other
     * @return: None
     */
    public Point(Point other)
    {
        _x = other._x;
        _y = other._y;
    }// end of method Point 
    /**
     * method return the x value of the class
     * @param: None
     * @return: int
     */
    public int getX()
    {
        return _x;
    }// end of method getX
    /**
     * method return the y value of the class
     * @param: None
     * @return: int
     */
    public int getY()
    {
        return _y;
    }// end of method getY
    /**
     * method set the x attribute of the class
     * @param: int num
     * @return: None
     */
    public void setX(int num)
    {
        _x = num;
    }// end of method setX
    /**
     * method set the y attribute of the class
     * @param: int num
     * @return: None
     */
    public void setY(int num)
    {
        _y = num;
    }// end of method setY
}// end of class Point 
