package homework3;
import java.util.Scanner;
/**
* class with solutions to arrays problems 
* @Date 19|12|2022
* @author liron mizrahi
*/
public class ArrayExercises
{
	/**
	* main method 
	* @param Strin[] args
	* @return void
	*/
	public static void main(String[] args) 
	{
		
		//make scan object
		Scanner scan = new Scanner(System.in);
		
		int choise;
		boolean fcontinue = true;
		
		// do while
		do
		{
			//menu
			System.out.println("Please Choose one of the following loops exercises: ");
			System.out.println("1 - For exercise 6");
			System.out.println("2 - For exercise 7");
			System.out.println("3 - For exercise 8");
			System.out.println("4 - For exercise 11");
			System.out.println("5 - For exercise 13");
			System.out.println("6 - For exercise 2");
			System.out.println("7 - For exercise 3");
			System.out.println("8 - For exercise 7");
			System.out.println("0 - To Exit " + "\n");
			System.out.println("Enter your choise --->  ");
			// take input from user
			choise = scan.nextInt();
			
			//switch case
			switch (choise)
			{
			case 1:
			{
				 //here code of Exercise 6
				 // take user input
				 System.out.print("enter the len of the array");
				 int len = scan.nextInt();
				 // make array
				 int[] arr1 = new int[len];
				 int[] arr2 = new int[len];
				 // insert valus to arrays
		         for(int i = 0; i < len; i++)
		         {
		        	 arr1[i] = scan.nextInt();
		         }
		         
		         for(int j = 0; j < len; j++)
		         {
		        	 arr2[j] = scan.nextInt();
		         }
				
		         System.out.println(isArrShift(arr1, arr2) + " ");
		         break;
			}//end of case 1
			
			case 2:
			{
				 //here code of Exercise 7
				 
				 char[] charArr = {'A', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'L'};
				
		         makeUpperCase(charArr);
		         for(int i = 0; i < charArr.length; i++)
		         {
		             System.out.print(charArr[i]);
		         }	
		         System.out.println(" ");
		         break;
			}//end of case 2
			
			case 3:
			{
				 //here code of Exercise 8
				 // take user input
				 System.out.print("enter the len of first array");
				 int len3 = scan.nextInt();
				 System.out.print("enter the len of second array");
				 int len4 = scan.nextInt();
				 
				 // make array
				 int[] arr3 = new int[len3];
				 int[] arr4 = new int[len4];
				 // insert valus to arrays
		         for(int i = 0; i < len3; i++)
		         {
		        	 arr3[i] = scan.nextInt();
		         }
		         
		         for(int j = 0; j < len4; j++)
		         {
		        	 arr4[j] = scan.nextInt();
		         }
				
				int[] arr5 = intersectionValusArr(arr3, arr4);
				// print the arr 
				for(int i = 0;  i < arr5.length; i++)
				{
					System.out.print(arr5[i]);
				}
				System.out.println(" ");
				break;
			}//end of case 3
			
			case 4:
			{
				//here code of Exercise 11
				// take user input
				System.out.print("enter the len of the array");
				int len6 = scan.nextInt();
				// make array
				int[] arr6 = new int[len6];
				for (int i=0; i < arr6.length; i++  )
				{
					arr6[i] = scan.nextInt();
				}
				printArrStar(arr6);
				System.out.println(" ");
				break;
			}//end of case 4
			
			case 5:
			{
				 //here code of Exercise 13
				 //take user input
				 System.out.print("enter the len of first array");
				 int len7 = scan.nextInt();
				 System.out.print("enter the len of second array");
				 int len8 = scan.nextInt();
				 
				 // make array
				 int[] arr7 = new int[len7];
				 int[] arr8 = new int[len8];
				 for (int i = 0; i < arr7.length; i++)
				 {
					 arr7[i] = scan.nextInt();
				 }
				 for (int i = 0; i < arr8.length; i++)
				 {
					 arr8[i] = scan.nextInt();
				 }
				 int[] arr9 = multiplyNumbers(arr7, arr8);
				 for(int i = 0; i < arr9.length; i++)
				 {
					 System.out.print(arr9[i]);
				 }
				 System.out.println(" ");
				 break;
			}//end of case 5
			
			case 6:
			{
				 //here code of Exercise 2
				 // take user input
				 System.out.print("enter the len of rows");
				 int rows = scan.nextInt();
				 System.out.print("enter the len of columns");
				 int columns = scan.nextInt();
				 int[][] matrix = new int[rows][columns];
				 for(int i = 0; i < rows; i++)
				 {
					 for(int j = 0; j < columns; j++)
					 {
						 matrix[i][j] = scan.nextInt();
					 }
				 }
				 System.out.println(maxValueInFrame(matrix));
				
				break;
			}//end of case 6
			
			case 7:
			{ 
				 //hare code of Exercise 3
				 //here code of Exercise 2
				 // take user input
				 System.out.print("enter the len of rows");
				 int rows1 = scan.nextInt();
				 System.out.print("enter the len of columns");
				 int columns1 = scan.nextInt();
				 fillMatrix(rows1, columns1);
				
				break;
			}//end of case 7
			
			case 8:
			{
				//hare code of Exercise 7
				char[][] charArr = 
			         {
			              {'a', 'a', 'a', '|', '-', '-'},
			              {'a', 'a', 'a', '|', 'a', 'a'},
			              {'|', '-', '-', '-', 'a', 'a'},
			              {'|', 'a', 'a', 'a', 'a', 'a'},
			              {'|', 'a', 'a', 'a', 'a', 'a'},
			         };
				System.out.println(isWay(charArr));
				break;
			}//end of case 8
			
			case 0:
			{
				fcontinue = false;
			}
			default:
			{
				            
				System.out.println("Invalid option");
			}
			}			
			
		} while (fcontinue);
		
		System.out.println("Goodbye");
				
	} //end of method main
	
	//Ex6 function
	public static boolean isArrShift(int[] arr1, int[]arr2)
	{

		for (int i=0; i < arr1.length; i++)
		{
			if(i == arr1.length - 1)
			{
				if(arr1[i] != arr2[0])
				{
					return false;
				}
			}
			else if(arr1[i] != arr2[i + 1])
			{
				return false;
			}
		}
		return true;
	}// end of method isArrShift
	
	//Ex7 function
	public static void makeUpperCase(char[] arr)
    {
       int startIndex = 0;
       int endIndex = 0;
       int flag = 0;
       
       for(int i = 0; i < arr.length; i++)
       {
           if(flag == 1)
           {
               if(Character.isUpperCase(arr[i]))
               {
                   endIndex = i;
                   flag--;
               }
           }
           else if(flag == 0)
           {
               if(Character.isUpperCase(arr[i]))
               {
                   startIndex = i;
                   flag++;
               }
           }
           
       }
       
       for(int j = startIndex + 1; j < endIndex; j++)
       {
           arr[j] = Character.toUpperCase(arr[j]);
       }
    }// end of method makeUpperCase
	//Ex8
    public static int[] intersectionValusArr(int[] arr1, int[] arr2)
    {
        arr1 = sortArr(arr1);
        arr2 = sortArr(arr2);
        int lenIntersectionArr = lenIntersectionArr(arr1, arr2);
        int[] intersectionArr = new int[lenIntersectionArr];
        int intersectionIndex = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                	
                    intersectionArr[intersectionIndex] = arr1[i];
                    intersectionIndex++;
                }
            }
        }
        return intersectionArr;
    }// end of method intersectionValuesArr
    
    private static int lenIntersectionArr(int[] arr1, int[] arr2)
    {
         int i = 0, j = 0, lenIntersectionArr = 0;
         while(i < arr1.length && j < arr2.length)
         {
             if(arr1[i] < arr2[j])
             {
                 i++;
             }
             else if(arr2[j] < arr1[i])
             {
            	
                 j++;
             }
             else
             {
                 lenIntersectionArr++;
                 i++;
             }
         }
         return lenIntersectionArr;
    }// end of method lenIntersectionArr
    
    private static int[] sortArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
           for(int j = 1; j < arr.length - i ; j++)
           {
               if(arr[i] > arr[j])
               {
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
        }
        return arr;
    }// end of method sortArr
  //Ex11
    public static void printArrStar(int[] arr)
    {
        int maxValue = 0;
        for(int value : arr)
        {
            if(value > maxValue)
            {
                maxValue = value;
            }
        }
        int index = maxValue;
        while(index > 0)
        {
        	System.out.println(" ");
            for(int i = 0; i < arr.length; i++)
            {
                if(index <= arr[i])
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            index -= 1;
        }
        System.out.print(" ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("__");
        }
        System.out.println("");
        System.out.print(" ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }// end of method printArrStar
  //Ex13
    public static int[] multiplyNumbers(int[] num1, int[] num2)
    {
        int sum = 0;
        for(int i = 0; i < num1.length; i++)
        {
            for(int j = 0; j < num2.length; j++)
            {
                sum += Math.pow(10, num1.length - i - 1) * num1[i] * Math.pow(10, num2.length - j - 1) * num2[j];
            }
        }
        int lenMultiplyArr = 0;
        int copySum = sum;
        while(copySum > 0)
        {
            lenMultiplyArr++; 
            copySum /= 10;
        }
        int[] multiplyArr = new int[lenMultiplyArr];
        for(int k = lenMultiplyArr - 1; k >= 0; k--)
        {
            int lastDigit = sum % 10;
            multiplyArr[k] = lastDigit;
            sum /= 10;
        }
        return multiplyArr;
    }// multiplyNumbers
  //Ex2
    public static int maxValueInFrame(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i += arr.length - 1)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i][0] > max)
            {
                max = arr[i][0];
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i][arr[i].length -1] > max)
            {
                max = arr[i][arr[i].length -1];
            }
        }
        
        return max;
    }// end of method maxValueInFrame
  //Ex3
    public static void fillMatrix(int rows, int cols)
    {
        int[][] matrix = new int[rows][cols];
        int flag = 2;
        if(cols % 2 == 0)
        {
            flag = 1;
        }
        else 
        {
            flag = 0;
        }
        int num = 1;
        for( int j = cols - 1; j >= 0; j--)
        {
            if(flag == 1)
            {
               if(j % 2 != 0)
                {
                    // fill the column top to bottom
                    for(int i = 0; i < rows; i++)
                    {
                        matrix[i][j] = num++;
                    }
                }
                else
                {
                    // fill the column bottom to top
                    for(int i = rows - 1; i >= 0; i--)
                    {
                        matrix[i][j] = num++;
                    }
                } 
            }
            else
            {
                if(j % 2 == 0)
                {
                    // fill the column top to bottom
                    for(int i = 0; i < rows; i++)
                    {
                        matrix[i][j] = num++;
                    }
                }
                else
                {
                    // fill the column bottom to top
                    for(int i = rows - 1; i >= 0; i--)
                    {
                        matrix[i][j] = num++;
                    }
                } 
            }
        }
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }// end of method fillMatrix
  //Ex7
    public static boolean isWay(char[][] arr)
    {
        if(arr[0][arr[0].length - 1] != '|' && arr[0][arr[0].length - 1] != '-')
        {
           return false; 
        }
        int cols = arr[0].length - 1; // 5
        for(int i = 0; i < arr.length; i++) // 4, 4 < 5
        {
            if( i == arr.length - 1)
            {
                if(arr[i][cols] == '|')
                {
                    return true;
                }
                else if(arr[i][cols] == '-')
                {
                    cols--;
                }
                else
                {
                    return false;
                }
            }
            if(arr[i][cols] != '-') 
            {
                if(arr[i][cols] != '|') 
                {
                   return false;
                }
            }
            else
            {
                cols = cols -1;
                if( cols < 0)
                {
                    return false;
                }
                i--;
            }
        }
        return true;
    }// end of method isWay
}// end of class ArrayExercises
