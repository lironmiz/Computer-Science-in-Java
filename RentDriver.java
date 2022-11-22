/**
* RentDriver.java
* A main class for check the Rent class
*/
import java.util.Scanner;
public class RentDriver
{
    public static void main(String[] args)
    {
       // creat scanner object
       Scanner scanner = new Scanner(System.in);
       // print to user
       System.out.println(" Please enter the name, car, pick date, return date");
       String name = scanner.nextLine();
       // take user input for car object
       System.out.println("Please enter Car information: \n ID:(have to be seven digits) \n Type: (A,B,C,D) \n Brand:(car brand) \n Is Manual:(true or false)");
       int id = scanner.nextInt();
       char type = scanner.next().charAt(0);
       System.out.println("now string");
       String brand = scanner.next();
       boolean isManual = scanner.nextBoolean();
       Car car = new Car(id, type, brand, isManual);
       // take input for pick date
       System.out.println("Please enter the day, month, year" + " of the pick date");
       // take user input
       int pickDay = scanner.nextInt();
       int pickMonth = scanner.nextInt();
       int pickYear = scanner.nextInt();
       // making Date object
       Date pickDate = new Date(pickDay, pickMonth, pickYear);
       // take input for return date 
       System.out.println("Please enter the day, month, year" + " of the return date");
       // take user input
       int returnDay = scanner.nextInt();
       int returnMonth = scanner.nextInt();
       int returnYear = scanner.nextInt();
       // making Date object
       Date returnDate = new Date(returnDay, returnMonth, returnYear);
       // make a rent object 
        Rent rent = new Rent(name, car, pickDate, returnDate);
       // print to user
       System.out.println(" Please enter the name, car, pick date, return date");
       String name1 = scanner.next();
       // take user input for car object
       System.out.println("Please enter Car information: \n ID:(have to be seven digits) \n Type: (A,B,C,D) \n Brand:(car brand) \n Is Manual:(true or false)");
       int id1 = scanner.nextInt();
       char type1 = scanner.next().charAt(0);
       System.out.println("now string");
       String brand1 = scanner.next();
       boolean isManual1 = scanner.nextBoolean();
       Car car1 = new Car(id1, type1, brand1, isManual1);
       // take input for pick date
       System.out.println("Please enter the day, month, year" + " of the pick date");
       // take user input
       int pickDay1 = scanner.nextInt();
       int pickMonth1 = scanner.nextInt();
       int pickYear1 = scanner.nextInt();
       // making Date object
       Date pickDate1 = new Date(pickDay1, pickMonth1, pickYear1);
       // take input for return date 
       System.out.println("Please enter the day, month, year" + " of the return date");
       // take user input
       int returnDay1 = scanner.nextInt();
       int returnMonth1 = scanner.nextInt();
       int returnYear1 = scanner.nextInt();
       // making Date object
       Date returnDate1 = new Date(returnDay1, returnMonth1, returnYear1);
       // make a rent object 
       Rent rent1 = new Rent(name1, car1, pickDate1, returnDate1);
       // chek the equals method 
       if (rent.equals(rent1))
       {
           System.out.println("Same");
       }
       else
       {
           System.out.println("not the same");
       }
       // check toString method 
       System.out.println(rent.toString());
       System.out.println(rent1.toString());
       // check how much rent day left 
       System.out.println("the days left is: " + rent.howManyDays());
       // get the price of the rent
       System.out.println("rent price is: " + rent.getPrice());
       System.out.println("rent1 price is: " + rent1.getPrice());
       // check the overlap method
       Rent overlapRent = rent.overlap(rent1);
       System.out.println("overlap rent: " + overlapRent.toString());
       // close the scanner object
       scanner.close();
    }// end of method main
}// end of class RentDriver
