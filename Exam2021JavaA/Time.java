/**
 * Time.java
 * the class reprsents time 
 * Author: liron mizrhai
 */
public class Time
{
    public static int _hour;
    public static int _minute;
    /**
     * constructor of the class Time 
     * @param: int h, int m
     * @return: None 
     */
    public Time(int h, int m)
    {
        if(h < 0 && h > 23 && m < 0 && m > 59 )
        {
           _hour = h;
           _minute = m; 
        }
        else
        {
            _hour  = 0;
            _minute = 0;
        }
    }// end of method Time 
    /**
     * copy constructor of the class Time 
     * @param: Time t
     * @return: None 
     */
    public Time(Time t)
    {
        _hour = t._hour;
        _minute = t._minute;
    }// end of methed Time
    /**
     * method return the hour 
     * @param: None 
     * @return: int  
     */
    public int getHour()
    {
        return _hour;
    }// end of method getHour 
    /**
     * method return the minute 
     * @param: None 
     * @return: int  
     */
    public int getMinute()
    {
        return _minute;
    }// end of method getMinute 
    /**
     * method return time object after add to the time given paramter
     * @param: int mintueToAdd 
     * @return: Time 
     */
    public Time addMinutes(int minuteToAdd)
    {
        int addHour = minuteToAdd / 60;
        int m = minuteToAdd - addHour * 60; 
        if( _hour + addHour > 23 || _minute + m > 59)
        {
            return new Time((_hour + addHour) % 23, (_minute + m) % 59);
        }
        else
        {
            return new Time(_hour + addHour, _minute + m);
        }
    }// end of method addMinutes
    /**
     * method return true if given time equals to this
     * @param: Time other 
     * @return: boolean
     */
    public boolean equals(Time other)
    {
        if(_hour == other._hour && _minute == other._minute )
        {
            return true;
        }
        else
        {
            return false;
        }
    }// end of method equals
    /**
     * method return true if this is before given paramter 
     * @param: Time other;
     * @return: boolean;
     */
    public boolean before(Time other)
    {
        if(_hour < other._hour)
        {
            return true;
        }
        else if(_hour == other._hour && _minute < other._minute)
        {
            return true;
        }
        return false;
    }// end of method before 
    /**
     * method return true if this is after given paramter 
     * @param: Time other 
     * @return: boolean 
     */
    public boolean after(Time other)
    {
        return other.before(this);
    }// end of method after 
    /**
     * method return string represent the object 
     * @param: None 
     * @return: String 
     */
    public String toString()
    {
        return _hour + ":" + _minute;
    }// end of method toString
}// end of class Time 
