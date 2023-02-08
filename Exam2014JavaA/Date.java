import java.util.Scanner;
/**
 * Date.java
 * the class reprsents a Date
 * Author: liron mizrhai
 */
public class Date
{
    private int _day;
    private int _month;
    private int _year;
    /**
     * constructor of the class Date 
     * @param: int d, int m, int y
     * @return: None
     */
    public Date(int d, int m, int y)
    {
        _day = d;
        _month = m;
        _year = y;
    }// end of method Date 
    /**
     * copy constructor of the class Date 
     * @param: Date d
     * @return: None
     */
    public Date(Date d)
    {
        _day = d._day;
        _month = d._month;
        _year = d._year;
    }// end of method Date 
    /**
     * method return the day of the date
     * @param: None
     * @return: int 
     */
    public int getDay()
    {
        return _day; 
    }// end of method getDay
    /**
     * method return the month of the date
     * @param: None
     * @return: int 
     */
    public int getMonth()
    {
        return _month; 
    }// end of method getMonth
    /**
     * method return the year of the date
     * @param: None
     * @return: int 
     */
    public int getYear()
    {
        return _day; 
    }// end of method getYear
    /**
     * method set the day of the date
     * @param: int x
     * @return: None
     */
    public void setDay(int x)
    {
        _day = x;
    }// end of method setDay
    /**
     * method set the month of the date
     * @param: int x
     * @return: None
     */
    public void setMonth(int x)
    {
        _month = x;
    }// end of method setMonth
    /**
     * method set the month of the date
     * @param: int x
     * @return: None
     */
    public void setYear(int x)
    {
        _year = x;
    }// end of method setDay
    /**
     * method return true if the two date are equals 
     * @param: Date date
     * @return: boolean
     */
    public boolean equals(Date date)
    {
        if(_day == date.getDay() && _month == date.getMonth() && _year == date.getYear())
        {
            return true;
        }
        return false;
    }// end of method equals
    /**
     * Method checks if the date represented by the object on which the method is invoked is before the date received as a parameter
     * @param other
     * @return true if the date is before the other date or false if not
     */
    public boolean before (Date other)
    {
        if ((this._month < other._month && this._year < other._year) || (this._day == other._day && this._month == other._month && this._year < other._year)  || (this._month == other._month && this._year == other._year &&  this._day < other._day) || (this._month > other._month && this._year < other._year) || (this._year == other._year && this._month < other._month))
        {
            return true;
        }
        return false;
    }// end of before method
    /**
     * Method checks if the date represented by the object on which the method is invoked is later than the date received as a parameter
     * @param other
     * @return true if the date is after the other date or false if not
     */
    public boolean after(Date other)
    {
        if (other.before(this))
        {
            return true;
        }
        return false;
    }// end of after method
    /**
     * Method return String that represents date
     * @param None
     * @return String
     */
    public String toString()
    {
        return  _day + "/" + _month + "/" + _year;
    }// end of method toString 
}// end of class Date 
