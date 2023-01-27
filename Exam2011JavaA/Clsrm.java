/**
 * Clsrm.java
 * the class reprsents a clsrm
 * Author: liron mizrhai
 */
public class Clsrm
{
    private int _classNum;
    private int _classPlaces;
    private boolean _isAvailable;
    /**
    * constrctor of the class Clsrm
    * @param: int num, int maxPlaces, boolean isAvail
    * @return: None
    */
    public Clsrm(int num, int maxPlaces, boolean isAvail)
    {
        _classNum = num;
        _classPlaces = maxPlaces;
        _isAvailable = isAvail; 
    }// end of method Clsrm
    /**
    * copy constrctor of the class 
    * @param: Clsrm c
    * @return: None
    */
    public Clsrm(Clsrm c)
    {
        _classNum = c._classNum;
        _classPlaces = c._classPlaces;
        _isAvailable = c._isAvailable;
    }// end of method Clsrm
    /**
    * the method return the class number  
    * @param: None
    * @return: int 
    */
    public int getClassNum()
    {
        return _classNum;
    }// end of method getClassNum
    /**
    * the method return the class places
    * @param: None
    * @return: int 
    */
    public int getClassPlaces()
    {
        return _classPlaces;
    }// end of method getClaassPlaces
    /**
    * the method return if the class avilable or not 
    * @param: None
    * @return: boolean 
    */
    public boolean getAvailable()
    {
        return _isAvailable;
    }// end of method getAvilable
    /**
    * the method  set if the class is avilable 
    * @param: boolean avail
    * @return: None 
    */
    public void setAvilable(boolean avail)
    {
        _isAvailable = avail;
    }// end of method setAvilable
    /**
    * the method return if the class handicapped suitable 
    * @param: None
    * @return: boolean  
    */
    public boolean handicappedSuitable()
    {
        if(_classNum < 100)
        {
            return true;
        }
        return false;
    }// end of method hadicappedSutable
    /**
    * the method return if the two clsrm is equals
    * equals classes is when the number of class places is equal
    * @param: Clsrm other
    * @return: boolean 
    */
    public boolean equals(Clsrm other)
    {
        if(_classPlaces == other.getClassPlaces())
        {
            return true;
        }
        return false;
    }// end of method equals 
    /**
    * the method return true if the class places is bigger than the class places in the given paramter
    * @param: Clsrm other
    * @return: boolean 
    */
    public boolean isBigger(Clsrm other)
    {
        if(_classPlaces > other.getClassPlaces())
        {
            return true;
        }
        return false;
    }// end of method isBigger
    /**
    * the method return true if the class is smaller than the class given as paramter
    * @param: Clsrm other
    * @return: boolean 
    */
    public boolean isSmaller(Clsrm other)
    {
        if(other.isBigger(this))
        {
            return true;
        }
        return false;
    }// end of method isSmaller
    /**
    * the method return true if the class is higher then the class given as paramter
    * @param: Clsrm other
    * @return: boolean 
    */
    public boolean isHigher(Clsrm other)
    {
        if(_classNum < 100 && other.getClassNum() < 100)
        {
            return false;
        }
        else if(_classNum > 99 && other.getClassNum() < 100)
        {
            return true;
        }
        else if(_classNum < 100 && other.getClassNum() > 99)
        {
            return false;
        }
        else if(_classNum > 99 && other.getClassNum() > 99)
        {
            int lastDigit = _classNum / 100;
            int secondLastDigit = other.getClassNum() / 100;
            if(lastDigit > secondLastDigit)
            {
                return true;
            }
            return false;
        }
        return false;
    }// end of method isHigher
    /**
    * the method return the floor number of the class
    * @param: None
    * @return: int 
    */
    public int getFloorNumber()
    {
        if(this.getClassNum() < 100)
        {
            return 0;
        }
        else 
        {
            return this.getClassNum() / 100;
        }
    }// end of method getFloorNumber
}// end of class Clsrm 
