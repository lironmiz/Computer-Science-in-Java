
//*******************************************************
// Class DateDriver.java
// The class represent usage of the class date 
// Author (tamir)
// Date 12/8/2022
//*******************************************************
import java.util.Scanner;
public class DateDriver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // print to user 
        System.out.println ("This program demonstrates the " + "usage of Date class.");
        System.out.println ("Please enter the day, month, year" + " of the first date");
        // taking input from user 
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        // make two object of kind Date 
        Date d1 = new Date(day, month, year);
        Date d2 = new Date(d1.getDay(), d1.getMonth(), d1.getYear());
        // print the two object data as string 
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        // checking if there equals print date same else print different dates
        if(d1.equals(d2))
        {
            System.out.println("date Same");
        }
        else
        {
            System.out.println("Different dates");
        }
        // set month of d1
        if(month < 12) // 1 2 3 4 5 6 7 8 9 10 11 
        {
            d1.setMonth(month + 1); 
        }
        else 
        {
            d1.setMonth(month - 1);
        }
        // print d1
        System.out.println(d1.toString());
        // set year of d2
        d2.setYear(year + 1);
        String dayStr;
        String monthStr;
        // making strings of the day and month for print the string without toString mehotd 
        if(d2.getDay() < 10)
        {
            dayStr = "0" + d2.getDay();
        }
        else
        {
            dayStr = "" + d2.getDay();
        }
        if(d2.getMonth() < 10)
        {
            monthStr = "0" + d2.getMonth();
        }
        else
        {
            monthStr = "" + d2.getMonth();
        }
        // print d2 info without toString method and in the format of toString 
        System.out.println(dayStr + "/" + monthStr + "/" + d2.getYear());
        // checking if the date are equals and print the date in order 
        if(d1.equals(d2))
        {
            System.out.println("Same dates");
        }
        else if(d1.before(d2))
        {
            System.out.println(d1.toString());
            System.out.println(d2.toString());
        }
        else
        {
           System.out.println(d2.toString());
           System.out.println(d1.toString()); 
        }
    }// end of mehtod main
}// end of class DateDriver 
