/**
 * Rectangle.java
 * the class reprsents a rectangle
 * Author: liron mizrhai
 */
public class Rectangle
{
    private Point _pointSW;
    private Point _pointNE;
    /**
     * the constractor of the class Rectangle
     * @param: int x, int y
     * @return: None
     */
    public Rectangle(int x, int y)
    {
        _pointNE.setX(x);
        _pointNE.setY(y);
        _pointSW.setX(0);
        _pointSW.setY(0);
    }// end of method Rectangle 
    /**
     * second constractor of the class Rectangle
     * @param: Point SW, Point NE
     * @return: None
     */
    public Rectangle(Point SW, Point NE)
    {
        _pointSW.setX(SW.getX());
        _pointSW.setY(SW.getY());
        _pointNE.setX(NE.getX());
        _pointNE.setY(NE.getY());
    }// end of method Rectangle 
    /**
     * the method return the rectangle area
     * @param: None
     * @return: int
     */
    public int RectangleArea()
    {
        int length = Math.abs(_pointSW.getY() - _pointNE.getY());
        int width = Math.abs(_pointSW.getX() - _pointNE.getX());
        return length * width;
    }// end of method RectangleArea
}// end of class Rectangle
