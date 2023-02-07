/**
 * RGBColor.java
 * the class reprsents a RGBColor
 * Author: liron mizrhai
 */
public class RGBColor
{
    private final int MAX_COLOR  = 255;
    private int _red;
    private int _green;
    private int _blue;
    /**
     * constructor of the class RGBColor
     * @param: None
     * @return: None 
     */
    public RGBColor()
    {
        _red = 0;
        _green = 0;
        _blue = 0;
    }// end of method RGBColor
    /**
     * constructor of the class RGBColor
     * @param: int red, int green, int blue 
     * @return: None 
     */
    public RGBColor(int red, int green, int blue)
    {
        _red = red;
        _green = green;
        _blue = blue;
    }// end of method RGBColor
    /**
     * copy constructor of the class RGBColor
     * @param: RGBColor other
     * @return: None 
     */
    public RGBColor(RGBColor other)
    {
        _red = other._red;
        _green = other._green;
        _blue = other._blue;
    }// end of method RGBColor
    /**
     * method return the _red 
     * @param: None
     * @return: int  
     */
    public int getRed()
    {
        return _red;
    }// end of method getRed
    /**
     * method return the _blue
     * @param: None
     * @return: int  
     */
    public int getBlue()
    {
        return _blue;
    }// end of method getBlue
    /**
     * method return the _green
     * @param: None
     * @return: int  
     */
    public int getGreen()
    {
        return _green;
    }// end of method getGreen
    /**
     * method set the _red 
     * @param: int num
     * @return: None
     */
    public void setRed(int num)
    {
        if(!(num < 0 || num > 255))
        {
            _red = num;
        }
    }// end of method setRed 
    /**
     * method set the _blue
     * @param: int num
     * @return: None
     */
    public void setBlue(int num)
    {
        if(!(num < 0 || num > 255))
        {
           _blue = num; 
        }
    }// end of method setBlue
    /**
     * method set the _green
     * @param: int num
     * @return: None
     */
    public void setGreen(int num)
    {
        if(!(num < 0 || num > 255))
        {
            _green = num;
        }
    }// end of method setGreen
    /**
     * method invert the rgb values 
     * @param: None
     * @return: None
     */
    public void invert()
    {
        if(_red <= 255 && _red >= 0 && _green <= 255 && _green >= 0 && _blue <= 255 && _blue >= 0)
        {
            _red = 255 - _red;
            _blue = 255 - _blue;
            _green = 255 - _green;
        }
    }// end of method invert 
    /**
     * method mix the rgb values
     * @param: RGBColor other
     * @return: None
     */
    public void mix(RGBColor other)
    {
        _red = (int) ((_red + other._red) / 2);
        _green = (int) ((_green + other._green) / 2);
        _blue = (int) ((_blue + other._blue) / 2);
    }// end of method mix 
    /**
     * method convert the pixel to grayscale 
     * @param: None 
     * @return: double
     */
    public double convertToGrayscale()
    {
        double gray = 0.3 * _red  + 0.59 * _green + 0.11 * _blue;
        return gray;
    }// end of method convertToGreayscale
    /**
     * method return true if the given other is equals to the rgb that the methd is on
     * @param: other
     * @return: boolean 
     */
    public boolean equals(RGBColor other)
    {
        if(_red == other._red && _blue == other._blue && _green == other._green)
        {
           return true; 
        }
        return false;
    }// end of method equals 
    /**
     * method return string represents the data of the rebcolor 
     * @param: None
     * @return: String  
     */
    public String toString()
    {
        return "(" + _red + "," + _green + "," + _blue + ")";
    }// end of method toString 
}// end of class RGBColor 
