
/**
* DateDriver.java
* A main class for check the Date class
*/
import java.util.Scanner;
public class DateDriver
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // print to user
        System.out.println("Please enter the day, month, year" + " of the first date");
        // take user input
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        // making 2 Date object
        Date d1 = new Date(day, month, year);
        Date d2 = new Date(d1.getDay(), d1.getMonth(), d1.getYear());
        System.out.println("d1 = " + d1.toString());
        System.out.println("d2 = " + d2.toString());
        // test the methods in the class
        if (d1.equals(d2))
        {
            System.out.println("Same Date");
        }
        else
        {
            System.out.println("Different Dates");
        }
        d1.setMonth(6);
        System.out.println("new month in d1: " + d1.getMonth());
         System.out.println("d1 = " + d1.toString());
        d2.setYear(2022);
        System.out.println("Updated year in d2: " + d2.getYear());
        System.out.println("Updated d2 = " + d2.getDay() + "/" + d2.getMonth() + "/" + d2.getYear());
        if (d1.equals(d2)) 
        {
            System.out.println("Same Date");
        } else if (date2.before(date1))
        {
            System.out.println("the date before: " + date2);
            System.out.println("the date after: " + date1);
        } 
        else 
        {
            System.out.println("the date before: " + date1);
            System.out.println("the date after: " + date2);
        }
        // close the scanner object
        scanner.close();
    } // end of method main 
} // end of class DateDriver
