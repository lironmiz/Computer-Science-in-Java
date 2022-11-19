/**
* Class Runner.java
* A main class for playing and checking the dynamic array
*/
import java.util.Scanner;
  
public class TestCarClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Car information: \n ID:(have to be seven digits) \n Type: (A,B,C,D) \n Brand:(car brand) \n Is Manual:(true or false)");
        int id = scanner.nextInt();
        char type = scanner.next().charAt(0);
        System.out.println("now string");
        String brand = scanner.next();
        boolean isManual = scanner.nextBoolean();
        Car car1 = new Car(id, type, brand, isManual);
        System.out.println("Please enter another Car");
        System.out.println("Please enter Car information:\nID:(must be seven digits)\nType:(A,B,C,D)\nBrand:(car brand)\nIs Manual:(true or false)");
        id = scanner.nextInt();
        type = scanner.next().charAt(0);
        brand = scanner.next();
        isManual = scanner.nextBoolean();
        Car car2 = new Car(id, type, brand, isManual);
        System.out.println("car1 = " + car1.toString());
        System.out.println("car2 = " + car2.toString());
        if (car1.equals(car2))
        {
            System.out.println("Same car");
        } 
        else
        {
            System.out.println("Different car");
        }
        if (car1.better(car2)) 
        {
            System.out.println("Better car:\n" + car1);
        } else if (car2.better(car1))
        {
            System.out.println("Better car:\n" + car2);
        }
        scanner.close();
    }
}// end of class Runner
