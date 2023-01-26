/**
 * Wheel.java
 * the class reprsents a Wheel
 * Author: liron mizrhai
 */
public class Wheel
{
    public  int _catNum;
    public boolean _isOk;
    /**
     * Constructor of the class Wheel
     * @param: None
     * @return: None
     */
    public Wheel()
    {
       _catNum = 1234;
       _isOk = true;
    }// end of method Wheel
    /**
    * Constructor of the class Wheel
    * @param: int catNum, boolean isOk
    * @return: None
    */
    public Wheel(int catNum, boolean isOk)
    {
        if(catNum > 0)
        {
            _catNum = catNum;
        }
        else
        {
            _catNum = 1234;
        }
        _isOk = isOk;
    }// end of method Wheel
    /**
    * copy Constructor of the class Wheel
    * @param: Wheel other
    * @return: None
    */
    public Wheel(Wheel other)
    {
        _catNum = other._catNum;
        _isOk = other._isOk;
    }// end of method Wheel
    /**
    * method return true if catNum is valid  otherwise false 
    * @param: int catNum
    * @return: boolean
    */
    public boolean isValidCatNum(int catNum)
    {
        if(catNum > 0 && catNum % 3 == 0 && catNum % 10 == 7)
        {
            return true;
        }
        return false;
    }// end of method isValidCatNum
    /**
    * method return the cat num of the Wheel 
    * @param: None
    * @return: int
    */
    public int getCatNum()
    {
        return _catNum;
    }// end of method getCatNum
    
    /**
    * method return if the wheel is fine 
    * @param: None
    * @return: boolean
    */
    public boolean getIsOk()
    {
        return _isOk;
    }// end of method getIsOk
    /**
    * method set the catNum of the wheel
    * @param: int catNum
    * @return: None
    */
    public void setCatNum(int catNum)
    {
        _catNum = catNum;
    }// end of method setCatNum
    
    /**
    * method set the catNum of the wheel
    * @param: booelan isOk
    * @return: None
    */
    public void setIsOk(boolean isOk)
    {
        _isOk = isOk;
    }// end of method setCatNum
}// end of class Wheel
