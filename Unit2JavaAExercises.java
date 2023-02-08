//*******************************************************
// Unit2JavaAExercises.java
// the class reprsents A solutions to unit2 exercises in java A
// Author: liron mizrahi
//*******************************************************
import java.util.Scanner;
class Unit2JavaAExercises
{
    public static void main(String[] args)
    {
        //Ex1 
        // program that take a input of 3 numbers and print their average.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        double average = (double) (num1 + num2 + num3) / 3;
        System.out.println("Average of " + num1 + ", " + num2 + " and " + num3 + " is: " + average);
        //Ex2
        // A program that accepts 3 numbers and prints their addition and multiplication.
        System.out.println("Enter 3 numbers: ");
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int num6 = scan.nextInt();
        int sum = num4 + num5 + num6;
        int product = num4 * num5 * num6;
        System.out.println("Sum of " + sum + " Product of " + product);
        //EX3
        // A program that receives a price in dollars and calculates and prints the price in NIS.
        System.out.println("Enter a dollar: ");
        double dollar = scan.nextDouble();
        double rate = 3.6;
        double nis = dollar * rate;
        System.out.println("Price of $" + dollar + " in NIS is: " + nis);  
        //EX4
        // A program that receives a price and a discount percentage and calculates the price after the discount.
        System.out.println("Enter the price and the discountPercentage: ");
        double price = scan.nextInt();
        double discountPercent = scan.nextDouble();
        double discountAmount = (discountPercent / 100) * price;
        double priceAfterDiscount = price - discountAmount;
        System.out.println("Price after discount is: " + priceAfterDiscount);
        //Ex5
        // A program that get the height, width and length of a box and calculates the volume and surface area of the box.
        System.out.println("Enter the height, width and length of the box: ");
        double height = scan.nextDouble();
        double width = scan.nextDouble();
        double length = scan.nextDouble();
        double volume = height * width * length;
        double surfaceArea = 2 * (height * width + height * length + width * length);
        System.out.println("Volume of the box is: " + volume);
        System.out.println("Surface area of the box is: " + surfaceArea);
        //Ex6
        // A program that receives as input the number students in the class and the number of cow chocolate cubes from a well-known and leading company in the market, and prints how many complete chocolate cubes each child received and how many cubes I have left.
        System.out.println("Enter the number of students in the class and number of chocloate cubes: ");
        int numOfStudents = scan.nextInt();
        int numOfChocolateCubes = scan.nextInt();
        int cubesPerStudent = numOfChocolateCubes / numOfStudents;
        int remainingCubes = numOfChocolateCubes % numOfStudents;
        System.out.println("Each student received " + cubesPerStudent + " chocolate cubes.");
        System.out.println("There are " + remainingCubes + " chocolate cubes left.");
        //Ex7
        // A program that receives a positive two-digit number, and prints the sum of its digits.
        System.out.println("Enter a two digit number: ");
        int twoDigitNum = scan.nextInt();
        int firstDigit = twoDigitNum / 10;
        int secondDigit = twoDigitNum % 10;
        int sumOfDigits = firstDigit + secondDigit;
        System.out.println("The sum is " + sumOfDigits);
        //Ex8
        // A program that captures train departure time in hours and minutes separately, travel time in hours and minutes separately,
        //and calculates and prints, without using
        //if or while the arrival time of the train, hour and minutes.
        System.out.println("Enter train departure time in hours and minutes separately and travel time in hours and minutes separately: ");
        int depHrs = scan.nextInt();
        int depMins = scan.nextInt();
        int travelHrs = scan.nextInt();
        int travelMins = scan.nextInt();
        int arrMins = (depMins + travelMins) % 60;
        int extraHrs = (depMins + travelMins) / 60;
        int arrHrs = (depHrs + travelHrs + extraHrs) % 24;
        System.out.println("The train will arrive at " + arrHrs + " hours and " + arrMins + " minutes");
    }
}// end of class Unit2JavaAExercises
