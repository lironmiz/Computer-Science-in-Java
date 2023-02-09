
public class Clock
{
    public int _hour;
    public int _minute;
    public int _second;
    /**
     * Constractor of the class Clock
     * @param: int h, int m, int s
     * @return: None 
     */
    public Clock(int h, int m, int s)
    {
        if( h <= 23 && h >= 0)
        {
            _hour = h;
        }
        else
        {
            _hour = 0;
        }
        if( m <= 59 && m >= 0)
        {
            _minute = m;
        }
        else
        {
            _minute = 0;
        }
        if( s <= 59 && s >= 0)
        {
            _second = s;
        }
        else
        {
            _second = 0;
        }
    }// end of method Clock
    /**
     * method return true if this object is before the given paramter otherwise false
     * @param: Clock other
     * @return: boolean
     */
    public boolean before(Clock other)
    {
       if(_hour < other._hour)
       {
           return true;
       }
       else if(_hour == other._hour)
       {
           if(_minute < other._minute)
           {
               return true;
           }
           else if(_minute == other._minute)
           {
               if(_second < other._second)
               {
                   return true;
               }
               return false;
           }
       }
       return false;
    }// end of method before
    /**
     * method return true if this object is after the given paramter otherwise false
     * @param: Clock other
     * @return: boolean 
     */
    public boolean after(Clock other)
    {
       return other.before(this); 
    }// end of method after
    
}// end of class Clock
