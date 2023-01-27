import java.util.Scanner;
//*******************************************************
// class with solutions to loop problems 
// Author: liron mizrahi
//*******************************************************
public class Loops
{
    public static void main(String[] args) 
    {
        // make scan object 
        Scanner  scan = new Scanner(System.in);

        int choise;
        boolean fcontinue = true;
        // do while 
        do 
        {
            // menu 
            System.out.println("Please Choose one of the following loops exercises: ");
            System.out.println("1 - For exercise 4");
            System.out.println("2 - For exercise 5");
            System.out.println("3 - For exercise 8");
            System.out.println("4 - For exercise 10");
            System.out.println("5 - For exercise 13");
            System.out.println("6 - For exercise 14");
            System.out.println("7 - For exercise 17");
            System.out.println("0 - To Exit " + "\n");
            System.out.println("Enter your choise --->  ");
            // take input 
            choise = scan.nextInt();
            // switch case 
            switch (choise) 
            {
                case 1: 
                    {
                        System.out.println("Enter your ID: ");
                        // take input 
                        int id = scan.nextInt();
                        int idCopy = id;
                        int idLength = 0;
                        while(idCopy > 0)
                        {
                            idLength++;
                            idCopy /= 10;
                        }
                        if (idLength != 8 && idLength != 9)
                        {
                            System.out.println("Error and exit");
                        }	
                        int checkDigit = id % 10;
                        id /= 10;
                        double totalSum = 0;
                        int digit;
                        int idLengthCopy = idLength;
                        for(int i = 0; i < idLength - 1; i++)
                        {
                            if((idLengthCopy - 1) % 2 == 0)
                            {
                                digit = id % 10; 
                                if(digit * 2 > 9)
                                {
                                    int sum = digit * 2;
                                    totalSum += sum % 10;
                                    totalSum += sum / 10;
                                }
                                else
                                {
                                    totalSum += digit * 2; 
                                }
                            }
                            else
                            {
                                digit = id % 10; 
                                totalSum += digit * 1;
                            }
                            id /= 10;
                            idLengthCopy -= 1; 
                        }
                        System.out.println(totalSum);
                        if ((int) Math.ceil(totalSum / 10.0) * 10 - totalSum == checkDigit)
                        {
                            System.out.println("Your ID is OK");
                        }
                        else 
                        {
                            System.out.println("Your ID is NOT Good");
                        }
                        break;
                    }// end of case 1
                case 2: 
                    {
                        int num, newNum=0, firstDigit, secondDigit, index=1;
                        // take input from user
                        System.out.println("Enter a number: ");
                        num = scan.nextInt();

                        while (num > 10) 
                        {
                            firstDigit = num % 10;
                            num /= 10;
                            secondDigit = num % 10;
                            num /= 10;

                            newNum += (firstDigit * Math.pow(10, index)) + (secondDigit * Math.pow(10, index-1));
                            index +=2;
                        }

                        newNum += num * Math.pow(10, index-1);
                        System.out.println("The new number is: "+ newNum);																		
                        break;
                    }// end of case 2				
                case 3: 
                    {			
                        int counter = 0;				
                        for (int i = 10; i < 100; i++) 
                        {

                            for(int k = 10; k<i ; k++) 
                            {
                                if ((float)k/i == (float)(k/10)/(i%10)) 
                                {
                                    counter++;
                                    System.out.println(k + "/" + i);
                                }
                            }
                        }

                        break;
                    }// end of case 3
                case 4: 
                    {	
                        int num, lenOfsegments, newNum=0;				
                        int numLen=0;

                        System.out.println("Enter a number and a digit: ");
                        num = scan.nextInt();
                        lenOfsegments = scan.nextInt();
                        int tempNum = num;

                        while (tempNum > 0) 
                        {
                            numLen++;
                            tempNum /=10;
                        }

                        int res=0;
                        int mul=1;

                        if (lenOfsegments >= numLen)
                        {
                            while (num > 0)
                            {
                                int lastDigit = num % 10;
                                res = res * 10 + lastDigit;
                                num /=10;
                            }
                        }
                        else
                        {
                            while (num > 0)
                            {
                                int segnment=0;
                                int nextMul = mul;

                                for ( int i=0; i < lenOfsegments; i++)
                                {
                                    if (num > 0)
                                    {
                                        int lastDigit = num % 10;
                                        segnment *=10;
                                        segnment +=lastDigit;
                                        nextMul *= 10;
                                        num /=10;
                                    }
                                }
                                res +=segnment*mul;
                                mul = nextMul;					
                            }
                        }
                        System.out.println(res);				
                        break;
                    }// end of case 4
                case 5: 
                    {
                        // take input form user 
                        System.out.println("Plase Enter a base: ");
                        int base = scan.nextInt();

                        for (int i = 1; i <= base; i++) 
                        {			
                            for (int space = 1; space < i; space++) 
                            {
                                System.out.print(" ");
                            }
                            for (int stars = 0; stars <= base-i; stars++) 
                            {
                                System.out.print("*" + " ");
                            }
                            System.out.println();			
                        }
                        for (int i = base; i >= 1; i--) 
                        {

                            for (int space = 1; space < i; space++) 
                            {
                                System.out.print(" ");
                            }
                            for (int stars = 0; stars <= base-i; stars++) 
                            {
                                System.out.print("*"+" ");
                            }
                            System.out.println();			
                        }	
                        break;
                    }// end of case 5
                case 6: 
                    {
                        // take input from user
                        System.out.println("Enter a base: ");
                        int base = scan.nextInt();

                        for (int z = 0; z < base; z++) 
                        {

                            for (int j =0; j < base; j++) 
                            {

                                for(int k = 0; k < base; k++) 
                                {

                                    for (int i = 0; i < base; i++ ) 
                                    {
                                        System.out.print("*");
                                    }
                                    System.out.print(" ");
                                }
                                System.out.println(" ");
                            }
                            System.out.println(" ");
                        }		
                        break;
                    }// end of case 6
                case 7: 
                    {

                        int counter=0,result=10;
                        int num = result;
                        int count = 1;

                        while (counter < 3) 
                        {
                            result = num;

                            while (result !=1 && result !=4) 
                            {
                                result = isHappy(result);
                            }

                            if (result ==1) 
                            {
                                System.out.println(count + ")" + " " + num + " is a happy number :-)");
                                count++;
                                counter++;
                            }
                            else 
                            {
                                counter = 0;
                            }
                            num++;
                        }

                        System.out.println((num-3) + " " + (num-2) + " " + (num-1));
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

    public static int isHappy (int num) 
    {

        int sum =0;

        while (num > 0) {
            int res = num % 10;
            sum += res*res;
            num /=10;
        }
        return sum;
    }// end of method isHappy
}// end of class Loops
