//*******************************************************
// Ex13.java
// A class with all the methods of all the exercises
// semester סתיו 2023א
//*******************************************************
import java.util.Scanner;
public class Ex13
{
    public static void main(String[] args)
    {
       // tester for alternating method
       //System.out.println(alternating("10"));// 0
       //System.out.println(alternating("1100"));// 1
       //System.out.println(alternating("0011"));// 1
       //System.out.println(alternating("1010"));// 0
       //System.out.println(alternating("111000"));// 1
       //System.out.println(alternating("000111"));// 1
       //System.out.println(alternating("11110000"));// 2
       //System.out.println(alternating("1110001110001100"));// 3
       // tester for maximumLengthOfSubArray
       //int[] arr = new int[1];
       //arr[0] = 5;
       //System.out.println(MaximumLengthOfSubArray(arr, 1)); // 1 
       //int[] arr1 = new int[2];
       //arr1[0] = 4;
       //arr1[1] = 10;
       //System.out.println(MaximumLengthOfSubArray(arr1, 2)); // 2
       //int[] arr2 = new int[5];
       //arr2[0] = 4;
       //arr2[1] = 1;
       //arr2[2] = 2;
       //arr2[3] = 11;
       //arr2[4] = 9;
       //System.out.println(MaximumLengthOfSubArray(arr2, 5)); // 4
       // tester for isWay method 
       //System.out.println(isWay(arr, 0)); // true
       //System.out.println(isWay(arr1, 0)); // false
       //System.out.println(isWay(arr2, 0)); // true
       // tester for prince method
       int[][] twoDArr = {{2,0,1,2,3},
                  {2,3,5,5,4},
                  {8,-1,6,8,7},
                  {3,4,7,2,4},
                  {2,4,3,1,2}};
       
       System.out.println(prince(twoDArr, 0, 0, 0)); // 4
    }// end of method main

    public static int getFlipCounter(String str, char predictedCharacter)
    {
        int flipCounter=0;
        int size=str.length();
        for (int i=0; i<size; i++)
        {
            if (str.charAt(i) != predictedCharacter) 
            {
                flipCounter++;
            }
            predictedCharacter = (predictedCharacter == '0') ? '1' : '0';
        }
        return flipCounter;
    }// end of method getFlipCounter
    
    /**
    * Ex1
    * Function to return the minimum number of characters of the given binary string to be replaced to make the string alternating
    * It can be assumed that it has N zeros and n ones and it contains only zero and one
    * @param s (string) 
    * @return numOfExchanges (int) 
    * Time Complexity: O(len)
    * Auxiliary Space: O(1)
    */
    public static int alternating(String str)
    {
        return Math.min(getFlipCounter(str,'1'), getFlipCounter(str,'0')) / 2;
    }// end of method alternating
    
    /**
    * Ex2
    * Function find the maximum length of subarray such that sum of the subarray is even 
    * Time Complexity: O(N^3) ( loop inside loop inside loop with at least 1 time each loop run in the size of the arr )
    * Auxiliary Space: O(1) ( Because In relation to the size of the input, the memory used is a fixed size and known in advance ) 
    * @param a (int arr)
    * @return  len (int)
    * Time Complexity of my function is O(N). Because of two loops whose complexity is n
    * Auxiliary Space of my function is O(1). Because In relation to the size of the input, the memory I use is a fixed size and known in advance
    */
    static int MaximumLengthOfSubArray(int a[])
    {
        int sum = 0, len = 0;
    
        // Check if sum of complete array is even
        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
    
        if (sum % 2 == 0) // total sum is already even
        {
            return a.length;
        }
    
        // Find an index i such the a[i] is odd
        // and compare length of both halfs excluding
        // a[i] to find max length subarray
        for (int i = 0; i < arr.length; i++)
        {
            if (a[i] % 2 == 1 || a[i] % 2 == -1)
            {
                len = Math.max(len, Math.max(a.length - i - 1, i));
            }
        }
    
        return len;
    }// end of exercise 2
    /**
    * Ex3
    * The method is boolean recursive which returns if there is a valid route in the array
    * A valid path in an array is defined as a series of indices in the array starting from zero and moving to the right or left depending on the value in the cell when it is forbidden to leave the array's boundaries
    * @param arr, int 
    * @return true if there valid route or false if not
    */
     public static boolean isWay(int[] a)
    {
        if (0 == a.length-1)
        {
           return true; 
        }
        return isWay(a, 0);
    }// end of method isWay
    
    public static boolean isWay(int[] a, int index)
    {
        if (index > a.length-1 || index < 0 || a[index] == -1)
        {
            return false;
        }
        if (index == a.length-1)
        {
           return true; 
        }    
        int temp = a[index];
        a[index] = -1;
        boolean rightCheck =  isWay(a, index + temp);
        boolean leftCheck =  isWay(a, index-temp); 
        a[index] = temp;
        return leftCheck || rightCheck;
    }// end of method isWay
    /**
    * Ex4
    * The method is Boolean recursive and returns the smalest number of steps that the prince need to do to the evil person (-1) in two-dimensional array, If there is no path, then it returns -1
    * Where each number in the array represents the height of a roof and it can go to a roof at the same height or a height one higher or a height lower by one or two than the height it is at. when he is allowed to go in all directions except diagonally
    * @param drm (int [][]), i (int), j (int) 
    * @return the numbers of steps to get to the evil person and if there no such legal route to him the method will return -1
    */
    public static int prince(int[][] drm, int i, int j)
    {
        int result = prince(drm, i, j, 1, drm[i][j]);
        if(result == Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return result;
        }
    }// end of method prince 
    
    private static int prince(int[][] drm, int i, int j, int steps, int height)
    {
        if( i < 0 || i>= drm.length || j < 0 || j >= drm[0].length || drm[i][j] == Integer.MAX_VALUE || height > drm[i][j] + 2 || drm[i][j] > height + 1)
        {
            return Integer.MAX_VALUE;
        }
        if(drm[i][j] == -1)
        {   
            return steps;
        }
        if(nextToVillain(drm, i, j))
        {
            return steps + 1;
        }
        
        int tempVal = drm[i][j];
        drm[i][j] = Integer.MAX_VALUE;
        
        int option1 = prince(drm, i+1, j,steps+1, tempVal);
        int option2 = prince(drm, i, j-1, steps+1,tempVal);
        int option3 = prince(drm, i-1, j, steps+1, tempVal);
        int option4 = prince(drm, i, j+1, steps+1, tempVal);
        drm[i][j] = tempVal;
        return Math.min(Math.min(option2, option4), Math.min(option1,option3));
    }// end of method prince 
    
    private static boolean nextToVillain(int[][] drm, int i, int j)
    {
        if(( i+1<=drm.length -1 && drm[i+1][j]  == -1) || (j-1 >= 0 && drm[i][j-1] == -1) || i -1 >= 0 && drm[i-1][j] == -1 || (j+1 <= drm[0].length -1 && drm[i][j+1] == -1))
        {
            return true;
        }
        return false;
    }// end of method nextToVillain
}// end of class Ex13
