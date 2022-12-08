
//*******************************************************
// Class CarDriver.java
// The class represent usage of the class Car
// Author (tamir)
// Date 12/8/2022
//*******************************************************
import java.util.Scanner;
public class CarDrivar
{
    // CONSTANT IN THE CODE
    private static final int DEFAULT_ID = 9999999; 
    private static final int MIN_ID = 1000000; 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // print to user 
        System.out.println ("This program demonstrates the " + "usage of Car class.");
        System.out.println("Please enter Car information: \n ID:(have to be seven digits) \n Type: (A,B,C,D) \n Brand:(car brand) \n Is Manual:(true or false)");
        // taking input from user
        int id = scanner.nextInt();
        char type = scanner.next().charAt(0);
        String brand = scanner.next();
        boolean isManual = scanner.nextBoolean();
        // checking if id and type is valid 
        if(!(id >= MIN_ID && id <= DEFAULT_ID))
        {
             id = DEFAULT_ID;
        }
        if(!(type == 'A' || type == 'B' || type == 'C' || type == 'D'))
        {
            type = 'A';
        }
        // making car object 
        Car c1 = new Car(id, type, brand, isManual); 
        // print to user 
        System.out.println("Please enter Car information: \n ID:(have to be seven digits) \n Type: (A,B,C,D) \n Brand:(car brand) \n Is Manual:(true or false)");
         // taking input from user
        int id1 = scanner.nextInt();
        char type1 = scanner.next().charAt(0);
        String brand1 = scanner.next();
        boolean isManual1 = scanner.nextBoolean();
        // checking if id and type is valid 
        if(!(id >= MIN_ID && id <= DEFAULT_ID))
        {
             id = DEFAULT_ID;
        }
        if(!(type == 'A' || type == 'B' || type == 'C' || type == 'D'))
        {
            type = 'A';
        }
        // making car object 
        Car c2 = new Car(id1, type1, brand1, isManual1); 
        // print the cars data as string 
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        // check if the two boolean value is equal 
        boolean isManualEqual = (isManual == isManual1);
        if(type == type1 && brand == brand1 && isManualEqual)
        {
            System.out.println("Same car");
        }
        else
        {
            System.out.println("Different cars");
        }
        // update c1 isManual 
        c1.setIsManual(!c1.isManual());
        // cecking which car is beter 
        if(c1.better(c2))
        {
            System.out.println("C1 is better: " + c1.toString()); 
        }
        else if(c2.better(c1))
        {
             System.out.println("C2 is better: " + c2.toString());
        }
        
    }// end of method main 
}// end of class CarDrivar 
