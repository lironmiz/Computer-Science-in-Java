
import java.util.Scanner;

public class RecursionExercisesAfekaCollege
{

	public static void main(String[] args) 
	{
		
		Scanner  scan = new Scanner(System.in);
		
		int choise;
		boolean fcontinue = true;
		
		// do while 
		do 
		{
			// menu 
			System.out.println("Please Choose one of the following loops exercises: ");
			System.out.println("1 - For exercise 2");
			System.out.println("2 - For exercise 3");
			System.out.println("3 - For exercise 4");
			System.out.println("4 - For exercise 8");
			System.out.println("5 - For exercise 9");
			System.out.println("6 - For exercise 20");
			System.out.println("7 - For exercise 22");
			System.out.println("0 - To Exit " + "\n");
			System.out.println("Enter your choise --->  ");
			// take input 
			choise = scan.nextInt();
			// switch case 
			switch (choise) 
			{
			case 1: 
			{
				System.out.println("Enter Number: ");
				int num = scan.nextInt();
				System.out.println(countEvenDigits(num));
				break;
			}// end of case 1
			case 2: 
			{
				System.out.println("Enter Number: ");
				int num1 = scan.nextInt();
				System.out.println(allEvenDigits(num1));
				
				break;
			}// end of case 2
			case 3: 
			{	
				System.out.println("Enter size of the array: ");
				int size = scan.nextInt();
				int[] arr = new int[size];
				for(int i = 0; i < size; i++)
				{	
					arr[i] = scan.nextInt();
 				}
				System.out.println(countEven(arr, size));
				break;
			}// end of case 3
			case 4: 
			{
				System.out.println("Enter Number: ");
				int num2 = scan.nextInt();
				System.out.println(isAlternating(num2));
				break;
			}// end of case 4
			case 5: 
			{
				System.out.println("Enter Number: ");
				int num3 = scan.nextInt();
				System.out.println(hasAlternating(num3));
				break;
			}// end of case 5
			case 6: 
			{
				System.out.println("Enter Number: ");
				int num4 = scan.nextInt();
				System.out.println(calculateTerm(num4));
				break;
			}// end of case 6
			case 7: 
			{
				System.out.println("Enter Number: ");
				int num5 = scan.nextInt();
				drawRuler(num5);		
				break;
			}// end of case 7
			case 0: 
			{
				fcontinue = false;
				break;			
			}
			default:
				System.out.println("Invalid option");
				break;			
			}		
		} while (fcontinue);
		
		System.out.println("Goodbye!!");	
	}// end of method main
	/**
    * The method is boolan recursive which returns the num of even digits in a given number 
    * @parm int (num)
    * @return int
    */
	public static int countEvenDigits(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        int lastDigit = num % 10;
        if(lastDigit % 2 == 0)
        {
            return 1 + countEvenDigits(num / 10);
        }
        else
        {
            return countEvenDigits(num / 10);
        }
    }// end of method countEvenDigits

	/**
    * The method is boolean recursive which returns true if all the digits in the number is even else false 
    * @parm int num
    * @return boolean 
    */	
	public static boolean allEvenDigits(int num)
    {
        if( num == 0)
        {
            return true;
        }
        int lastDigit = num % 10;
        if(lastDigit % 2 == 0)
        {
            return allEvenDigits(num / 10);
        }
        else
        {
            return false;
        }
    }// end of method allEvenDigits
	
	/**
    * The method is boolean recursive which returns the num of even number in an array of numbers 
    * @parm int[] arr, int index
    * @return int
    */
	public static int countEven(int[] arr, int size)
    {
        if(size == 0)
        {
            return 0;
        }
        int count = 0;
        if(arr[size - 1] % 2 == 0)
        {
            count = 1;
        }
        return count + countEven(arr, size - 1);
    }// end of method countEven
	
	/**
    * The methdo is boolean recursive which returns true if it is an alternation number
    * altenation number is a number in which each pair of adjacent digits has a different parity 
    * @parm int num
    * @return boolean 
    */
	public static boolean isAlternating(int num)
    {
        if (num < 10)
        {
            return true;
        }
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;
        if(lastDigit % 2 == secondLastDigit % 2)
        {
            return false;
        }
        else 
        {
            return isAlternating(num / 10);
        }
    }// end of method isAlternating
	
	/**
    * The method is boolean recursive which returns true if there is at least one pair of alternating digits and if the number is a single digit it will return false
    * alternating number is a number in which each pair of adjacent digits has a differnet parity 
    * @parm int num
    * @return boolean 
    */
    public static boolean hasAlternating(int num)
    {
        if(num < 10)
        {
            return false;
        }
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;
        if(lastDigit % 2 != secondLastDigit)
        {
            return true;
        }
        else
        {
            return hasAlternating(num / 10);
        }
    }// end of method hasAlternatin
    
    /**
     * The method return the n Term in a sequence 
     * @parm int 
     * @return int
     */
    public static int calculateTerm(int num)
    {
        if(num <= 3)
        {
            return num;
        }
        if(num % 2 == 0)
        {
            return calculateTerm(num -1) + calculateTerm(num - 2) + calculateTerm(num - 3);
        }
        else
        {
            return Math.abs(calculateTerm(num - 1) - calculateTerm(num - 3));
        }
    }// end of method calculateTerm
    
    /**
     * The method is boolean recursive which print a a ruler according to the given num
     * @parm int 
     * @return void
     */
    public static void drawRuler(int num)
    {
        if(num == 0)
        {
            return;
        }
        drawRuler(num - 1);
        for(int i = 0; i < num; i++)
        {
            System.out.print("-");
        }
        System.out.println();
        drawRuler(num -1);
    }
}
