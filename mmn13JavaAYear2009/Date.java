/**
 * Date.java
 * The class reprsents date
 * Author liron mizrahi
 */
public class Date 
{
    private int _day;
    private int _month;
    private int _year;

    /**
     * constructor of the class Date
     * @param  int day, int month, int year
     * @return: None
     */
    public Date(int day, int month, int year)
    {
        _day = day;
        _month = month;
        _year = year;
    }// end of method Date
    /**
     * Copy Constructor of the class Date
     * @param Date date
     * @return: None
     */
    public Date(Date date)
    {
        _day = date._day;
        _month = date._month;
        _year = date._year;
    }// end of method Date 
    /**
     * method return the year 
     * @param None
     * @return: int
     */
    public int getYear()
    {
        return _year;
    }// end of method getYear
    /**
     * method return the month 
     * @param None
     * @return: int
     */
    public int getMonth()
    {
        return _month;
    }// end of method getMonth
    /**
     * method return the day
     * @param None
     * @return: int
     */
    public int getDay()
    {
        return _day;
    }// end of method getDay
    /**
     * method set the year 
     * @param int yearToSet
     * @return: None
     */
    public void setYear(int yearToSet)
    {
        _year = yearToSet;
    }// end of method setYear 
    /**
     * method set the month
     * @param int monthToSet
     * @return: None
     */
    public void setMonth(int monthToSet)
    {
        _month = monthToSet;
    }// end of method setMonth
    /**
     * method set the day
     * @param int dayToSet
     * @return: None
     */
    public void  setDay(int dayToSet)
    {
        _day = dayToSet;
    }// end of method setDay
    /**
     * return true if date 2 is after date
     * @param Date date2 t
     * @retun boolean
     */
    public boolean before(Date date2)
    {
        if (_year < date2._year)
        {
            return true;
        }
        if (_year == date2._year) 
        {
            if (_month < date2._month)
            {
                return true;
            }
            if (_month == date2._month && _day < date2._day)
            {
                return true;
            }
        }
        return false;
    }// end of method before
    /**
     * method return string that represents Date data
     * @param: None
     * @return: String
     */
    public String toString()
    {
        return _day +"/" + _month + "/" + _year;
    }// end of method toString
}// end of class Date 
