//*******************************************************
// Triangle1.java.
// Calculation of area and perimeter of a triangle.
//*******************************************************
import java.util.Scanner;
public class Triangle1
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in); // Create Reader
        System.out.println("This program calculate the area and the perimeter of a given triangle. ");
        System.out.print("Enter the three lengths of the triangle's sides"); // Ask for input
        int a = scan.nextInt(); // Read value from user
        int b = scan.nextInt();
        int c = scan.nextInt();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        int perimeter = a + b + c;
        System.out.println("The lengths of the triangle sides are: " + a + ", " + b + ", " +  c + ".");
        System.out.println("The perimeter of the triangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);
        
    }// end of method main
}// end of class Triangle1
