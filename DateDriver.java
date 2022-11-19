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
        Date date1 = new Date(day, month, year);
        Date date2 = new Date(date1.getDay(), date1.getMonth(), date1.getYear());
        System.out.println("date1 = " + date1.toString());
        System.out.println("date2 = " + date2.toString());
        // test the methods in the class
        if (date1.equals(date2))
        {
            System.out.println("Same Date");
        }
        else
        {
            System.out.println("Different Dates");
        }
        date1.setMonth(6);
        System.out.println("new month in date1: " + date1.getMonth());
        date2.setYear(2022);
        System.out.println("Updated year in date2: " + date2.getYear());
        System.out.println("Updated date2 = " + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
        if (date1.equals(date2)) 
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