//*******************************************************
// Class Date.java
// The class manages everything related to dates
//*******************************************************
public class Date
{
   private int _day; // Number between 1 - 31
   private int _month; // Number between 1 - 12
   private int _year; //  4 digit number
   
   // Constant in the class
   private static final int MAX_YEAR = 9999;
   private static final int MIN_YEAR = 1000;
   private static final int DEFAULT_YEAR = 2000;
   private static final int MAX_MONTH = 12;
   private static final int MIN_MONTH = 1;
   private static final int MAX_DAY = 31;
   private static final int MIN_DAY = 1;
   private static final int JANUARY = 1;
   private static final int FEBRUARY = 2;
   private static final int MARCH = 3;
   private static final int APRIL = 4;
   private static final int MAY = 5;
   private static final int JUNE = 6;
   private static final int JULY = 7;
   private static final int AUGUST = 8;
   private static final int SEPTEMBER = 9;
   private static final int OCTOBER = 10;
   private static final int NOVEMBER = 11;
   private static final int DECEMBER = 12;
   private static final int LEAP_FEBRUARY = 29;
   
  /**
  * Constructor for class Date
  * @param day of the date, month of the date, year of the date 
  * @return None
  */
   public Date(int day, int month, int year)
   {
       if(isDateValid(day, month, year))
       {
           this._day = day;
           this._month = month;
           this._year = year;
       }
       else
       {
           this._day = MIN_DAY;
           this._month = MIN_MONTH;
           this._year =  DEFAULT_YEAR; 
       }
   }// end of Date method
  /**
  * Constructor for class Car
  * @param other
  * @return None
  */
   public Date (Date other)
   {
       this._day = other._day;
       this._month = other._month;
       this._year = other._year; 
       
   }// end of Date method
  /**
  * Method return the day of the rent
  * @param None
  * @return day of the rent
  */
   public int getDay()
   {
       return this._day;
   }// end of getDay method
  /**
  * Method return the month of the rent
  * @param None
  * @return month of the rent
  */
   public int getMonth()
   {
       return this._month;
   }// end of getMonth method
  /**
  * Method return the year of the rent
  * @param None
  * @return year of the rent
  */
   public int getYear()
   {
       return this._year;
   }// end of getYear method
  /**
  * Method set the day of the rent
  * @param day of the rent ot set
  * @return None
  */
   public void setDay(int dayToSet)
   {
      if(isDateValid(dayToSet, this._month, this._year))
      {
         this._day = dayToSet;
      }
      
   }// end of setDay method
  /**
  * Method set the month of the rent
  * @param month of the rent ot set
  * @return None
  */
   public void setMonth(int monthToSet)
   {
       if(isDateValid(this._day, monthToSet, this._year))
      {
         this._month = monthToSet;
      }
   }// end of setMonth method
  /**
  * Method set the year of the rent
  * @param year of the rent ot set
  * @return None
  */
   public void setYear(int YearToSet)
   {
      if(isDateValid(this._day, this._month, YearToSet))
      {
        this._year = YearToSet;
      }
   }// end of setYear method
  /**
  * Method checks if the date received as a parameter is the same as the date represented by the object on which the method is invoked
  * two dates are equals if the day, month and year is the same.
  * @param other
  * @return true if the dates is equals or false if not
  */
   public boolean equals (Date other)
   {
       if (other._day == this._day && other._month == this._month && other._year == this._year)
       {
           return true;
       }
       return false;
   }// end of equals method
  /**
  * Method checks if the date represented by the object on which the method is invoked is before the date received as a parameter
  * @param other
  * @return true if the date is before the other date or false if not
  */
   public boolean before (Date other)
   {
        if ((this._month < other._month && this._year < other._year) || (this._month == other._month && this._year == other._year &&  this._day < other._day) || (this._month > other._month && this._year < other._year) || (this._year == other._year && this._month < other._month))
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
       if (other.before(this) == true)
       {
            return true;
       }
       return false;
   }// end of after method
  /**
  * Method calculates and checks the difference in days between the date received as a parameter and the date represented by the object
  * @param other
  * @return the difference in days between the date received as a parameter and the date represented by the object
  */
   public int difference (Date other)
   {
       int difference = Math.abs(calculateDate(this._day, this._month, this._year) - calculateDate(other._day, other._month, other._year));
       return difference;
   }// end of difference method
  /**
  * Method returns the date as a string
  * @param None
  * @return string of the date
  */ 
   public String toString()
   {
       String dayAsString;
       String monthAsString;
       if(this._day < 10)
       {
           dayAsString = "0" + this._day;
       }
       else
       {
           dayAsString = "" + this._day;
           System.out.println(dayAsString);
       }
       if(this._month < 10)
       {
           monthAsString = "0" + this._month;
       }
       else
       {
           monthAsString = "" + this._month;
           System.out.println(monthAsString);
       }
       String date = dayAsString + "/" + monthAsString + "/" + this._year;
       return date;
   }// end of toString method
  /**
  * Method returns object date of tomorrow
  * @param None
  * @return Date
  */ 
   public Date tomorrow()
   {
       int tomorrowDay = (daysInMonth(this._month, this._year) == this._day) ? 1 : this._day + 1;
       System.out.println(this._day + " wow day ");
       int tomorrowMonth = (tomorrowDay == 1) ? this._month + 1 : this._month;
       System.out.println(this._month + " wow month ");
       if ( tomorrowMonth > MAX_MONTH)
       {
            tomorrowMonth = 1;
       }
       int tomorrowYear = (tomorrowDay == 1 && tomorrowMonth  == 1) ? this._year + 1 : this._year;
       return new Date(tomorrowDay,  tomorrowMonth, tomorrowYear);
   }// end of tomorrow method
  /**
  * Method check if the date is valid
  * @param day of the date, month of the date and the year of the date
  * @return true of the date is valid and false if not 
  */ 
  public boolean isDateValid(int day, int month, int year)
  {
       if( day < MIN_DAY || day > MAX_DAY || month < MIN_MONTH || month > MAX_MONTH || year < MIN_YEAR || year > MAX_YEAR)
       {
            return false;   
       }
       return day <= daysInMonth(month, year);     
  }// end of isDateValid method
  /**
  * Method return number of days in month
  * @param int
  * @return int 
  */  
  private int daysInMonth(int month, int year)
  {
      switch(month)
      {
           case JANUARY:
                 return MAX_DAY;
           case MARCH:
                 return MAX_DAY;
           case MAY:
                 return MAX_DAY;
           case JULY:
                 return MAX_DAY;
           case AUGUST:
                 return MAX_DAY;
           case OCTOBER:
                 return MAX_DAY;
           case DECEMBER:
               return MAX_DAY;
           case APRIL:
               return 30;
           case JUNE:
               return 30;
           case SEPTEMBER:
               return 30;
           case NOVEMBER:
               return 30;
           case FEBRUARY:
               return (isLeapYear(year)) ? LEAP_FEBRUARY: 28;   
      }
      return 0;
  }// end of method daysInMonth
  /**
  * Method return if the year is leap year
  * @param int
  * @return boolean 
  */
  public boolean isLeapYear(int year)
  {
       if (year % 400 == 0)
       {
          return true;
       } 
       else if (year % 100 == 0)
       {
          return false;
       } 
       else if (year % 4 == 0)
       {
          return true;
       } 
       return false;        
  }// end of method isLeapYear
  /**
  * Method computes the day number since the beginning of the Christian counting of years
  * @param day of the date, month of the date and the year of the date
  * @return the day number since the beginning of the Christian counting of years
  */ 
   private int calculateDate( int day, int month, int year)
   {
       if(month < 3)
       {
           year--;
           month = month + MAX_MONTH;
       }
       return 365*year + year/4 - year/100 + year/400 +((month+1) * 306)/10 + (day - 62);
   }// end of calculateDate method
}// end of class Date
