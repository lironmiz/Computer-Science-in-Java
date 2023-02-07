/**
 * RGBImage.java
 * the class reprsents a RGBImage
 * Author: liron mizrhai
 */
public class RGBImage
{
    private RGBColor[][] _image;
    /**
     * constructor of the class RGBImage
     * @param: int rows, int cols 
     * @return: None 
     */
    public RGBImage(int rows, int cols)
    {
        _image = new RGBColor[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                _image[i][j] = new RGBColor();
            }
        }
    }// end of method RGBImage
    public RGBImage(RGBColor[][] pixels)
    {
        System.out.println("ok");
    }// end of method RGBImage
    public RGBImage(RGBImage other) 
    {
        System.out.println("ok");
    }// end of method RGBImage
    /**
     * method return the pixel at postion row col
     * @param: int row, in col
     * @return: None
     */
    public RGBColor getPixel(int row, int col)
    {
        if(row < _image.length && row > 0 && col < _image[0].length && col > 0)
        {
            return new RGBColor(_image[row][col]);
        }
        return new RGBColor();
    }// end of method getPixel
    public void setPixel(int row, int col, RGBColor pixel)
    {
        System.out.println("ok");
    }// end of method setPixel
    /**
     * method return the height of the image
     * @param: None
     * @return: int
     */
    public int getHeight()
    {
        return _image.length;
    }// end of method getHeight
    /**
     * method return the height of the image
     * @param: None
     * @return: int
     */
    public int getWidth()
    {
        return _image[0].length;
    }// end of method getHeight
    public boolean equals(RGBImage other)
    {
        if (other==null)
        {
            return false;
        }
        if (_image.length!=other._image.length ||_image[0].length!=other._image[0].length)
        {
            return false;
        }
        for(int i=0;i<_image.length;i++)
        {
            for(int j=0;j<_image[0].length;j++)
            {
                if (!(_image[i][j].equals(other._image[i][j])))
                {
                    return false;
                }
            }
        }
        return true;
    }// end of method equals 
    /**
     * method flipHorizontal the two d array 
     * @param: None
     * @return: None
     */
    public void flipHorizontal()
    {
        for(int i=0;i<_image.length/2;i++)
        {
            RGBColor[] temp = _image[i];
            _image[i] =_image[_image.length-i-1];
            _image[_image.length-i-1]=temp;
        }
    }// end of method flipHorizontal
    /**
     * method invert the colors ot the two d array 
     * @param: None
     * @return: None
     */
    public void invertColors()
    {
        for(int i = 0; i < _image.length; i++)
        {
            for(int j = 0; j < _image[0].length; j++)
            {
                _image[i][j].invert();
            }
        }         
    }// end of method invertColors
    /**
     * method return two d array that been converted to gray scale  
     * @param: None
     * @return: None
     */
    public double[][] toGrayScaleArray()
    {
        int numRow = _image.length;
        int numCol = _image[0].length;
        double[][] grayScaleArray = new double[numRow][numCol];
        for(int i = 0; i < numRow; i++)
        {
            for(int j = 0; j < numCol; j++)
            {
                grayScaleArray[i][j] = _image[i][j].convertToGrayscale();
            }
        }
        return grayScaleArray;
    }// end of method toGrayScaleArray
}// end of class RGBImage
