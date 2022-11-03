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
   private static final int MAX_MONTH = 12;
   private static final int MIN_MONTH = 1;
   private static final int MAX_DAY = 31;
   private static final int MIN_DAY = 1;
   // Constructor for class Date
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
           this._month = MIN_DAY;
           this._year = 2000; 
       }
   }
   // Constructor for class Date
   public Date (Date other)
   {
       this._day = other._day;
       this._month = other._month;
       this._year = other._year; 
       
   }
   // Method return the day
   public int getDay()
   {
       return this._day;
   }
   // Method return the month
   public int getMonth()
   {
       return this._month;
   }
   // Method return the year 
   public int getYear()
   {
       return this._year;
   }
   // Method set the day
   public void setDay(int dayToSet)
   {
       this._day = dayToSet;
   }
   // Method set the month
   public void setMonth(int monthToSet)
   {
       this._month = monthToSet;
   }
   // Method set the year
   public void setYear(int YearToSet)
   {
       this._year = YearToSet;
   }
   // Method checks if the date received as a parameter is the same as the date represented by the object on which the method is invoked
   public boolean equals (Date other)
   {
       boolean isEquals = true;
       if (other._day == this._day && other._month == this._month && other._year == this._year)
       {
           return isEquals;
       }
       else
       {
           isEquals = false;
       }
       return isEquals;
   }
   // Method checks if the date represented by the object on which the method is invoked is before the date received as a parameter
   public boolean before (Date other)
   {
       boolean isBefore = true;
       if ((this._day < other._day && this._month == other._month && this._year == other._year) || (this._day == other._day && this._month < other._month && this._year == other._year) || (this._day == other._day && this._month == other._month && this._year < other._year))
       {
           return isBefore;
       }
       else
       {
           isBefore = false;
       }
       return isBefore;
   }
   // Method checks if the date represented by the object on which the method is invoked is later than the date received as a parameter
   public boolean after(Date other)
   {
       boolean isAfter = true;
       other._day = other._day + 1;
       other._month = other._month + 1;
       other._year = other._year + 1;
       if (before(other) == false)
       {
           return isAfter;
       }
       else
       {
           isAfter = false;
       }
       return isAfter;
   }
   // Method calculates and checks the difference in days between the date received as a parameter and the date represented by the object
   public int difference (Date other)
   {
       int difference = Math.abs(calculateDate(this._day, this._month, this._year) - calculateDate(other._day, other._month, other._year));
       return difference;
   }
   // Method returns the date as a string
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
       }
       if(this._month < 10)
       {
           monthAsString = "0" + this._month;
       }
       else
       {
           monthAsString = "" + this._month;
       }
       String date = dayAsString + "/" + monthAsString + "/" + this._year;
       return date;
   }
   // Method returns today's date the day after the date represented by the object on which the method is invoked.
   public Date tomorrow()
   {
       if(isDateValid(this._day+1, this._month, this._year))
       {
           this._day++;
       }
       else if( isDateValid(MIN_DAY, this._month + 1, this._year))
       {
           this._day = MIN_DAY;
           this._month++;
       }
       else
       {
           this._day = MIN_DAY;
           this._month = 1;
           this._year++;
       }
       Date tomorrow = new Date(this._day, this._month, this._year);
       return tomorrow;
   }
   // Method check if date is Valid
   private boolean isDateValid(int day, int month, int year)
   {
       boolean dateValid = true;
       // Checking if the year is leap year
       if(year >= MIN_YEAR && year <= MAX_YEAR && year % 100 == 0 && year % 400 == 0)
       {
            if( month >= MIN_MONTH && month <= MAX_MONTH)
            {
                if(month == 2)
                {
                    if (day >= MIN_DAY && day <= 29)
                    {
                        return dateValid;
                    }
                    else
                    {
                        dateValid = false;
                    }
                }
                else if(month ==  4 || month == 6 || month == 9 || month == 11)
                {
                    if(day >= MIN_DAY && day <= 30)
                    {
                        return dateValid;
                    }
                    else
                    {
                        dateValid = false;
                    }
                }
                else
                {
                    if(day >= MIN_DAY && day <= MAX_DAY)
                    {
                        return dateValid;
                    }
                    else
                    {
                        dateValid = false;
                    }
                }
            }
            else
            {
                dateValid = false;
            }
       }
       // Checking the date
       else if(month >= MIN_MONTH && month <= MAX_MONTH && year >= MIN_YEAR && year <= MAX_YEAR)
       {
           if (month == 2)
           {
               if(day >= MIN_DAY && day <= 28)
               {
                   return dateValid;
               }
               else
               {
                   dateValid = false;
               }
           }
           else if(month ==  4 || month == 6 || month == 9 || month == 11)
           {
                if(day >= MIN_DAY && day <= 30)
                {
                        return dateValid;
                }
                else
                {
                        dateValid = false;
                }
           }
           else
           {
               if(day > MIN_DAY && day <= MAX_DAY)
               {
                   return dateValid;
               }
               else
               {
                   dateValid = false;
               }
           }
           return dateValid;
       }
       else
       {
           dateValid = false;
       }
       return dateValid;     
   }
   // Computes the day number since the beginning of the Christian counting of years
   private int calculateDate( int day, int month, int year)
   {
       if(month < 3)
       {
           year--;
           month = month + MAX_MONTH;
       }
       return 365*year + year/4 - year/100 + year/400 +((month+1) * 306)/10 + (day - 62);
   }
}
