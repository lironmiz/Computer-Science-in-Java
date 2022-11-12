//*******************************************************
// Ex13.java
// A class with all the methods of all the exercises
// semester סתיו 2023א
//*******************************************************
public class Ex13
{
    /**
    * Ex1
    * Function to return the minimum number of characters of the given binary string to be replaced to make the string alternating
    * It can be assumed that it has N zeros and n ones and it contains only zero and one
    * @param s (string) 
    * @return numOfExchanges (int) 
    * Time Complexity: O(len)
    * Auxiliary Space: O(1)
    */
    public static int alternating (String s)
    {
        int numOfExchanges = 0;
        int lenStr = s.length();
        // looping the string
        for (int i = 0; i < lenStr ; i++) 
        {
            // If there is 1 at even index positions
            if (i % 2 == 0 && s.charAt(i) == '1')
                numOfExchanges++;
            // If there is 0 at odd index positions
            if (i % 2 == 1 && s.charAt(i) == '0')
                numOfExchanges++;
        }
        // return the minimum number between the two possibilitys.
        return Math.min(numOfExchanges, lenStr - numOfExchanges);
    } // end of exercise 1
    
    /**
    * Ex2
    * Function find the maximum length of subarray such that sum of the subarray is even 
    * Time Complexity: O(N^3)
    * Auxiliary Space: O(1)
    * @param a (int arr) n (int)
    * @return  len (int)
    * Time Complexity of my function is O(N). Because of two loops whose complexity is n
    * Auxiliary Space of my function is O(1). Because In relation to the size of the input, the memory I use is a fixed size and known in advance
    */
    static int MaximumLengthOfSubArray(int a[], int n)
    {
        int sum = 0, len = 0;
 
        // Check if sum of complete array is even
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
 
        if (sum % 2 == 0) // total sum is already even
        {
            return n;
        }
 
        // Find an index i such the a[i] is odd
        // and compare length of both halfs excluding
        // a[i] to find max length subarray
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 == 1)
            {
                len = Math.max(len, Math.max(n - i - 1, i));
            }
        }
 
        return len;
    }// end of exercise 2
    /**
    * Ex3
    * The method is boolean recursive which returns if there is a valid route in the array
    * A valid path in an array is defined as a series of indices in the array starting from zero and moving to the right or left depending on the value in the cell when it is forbidden to leave the array's boundaries
    * @param a (int arr) 
    * @return true if there valid route or false if not
    */
   public static boolean isWay(int[] a, int index)
   {
    if (index == a.length-1) return true;
    if (index > a.length-1 || index < 0) return false;
    return isWay(a, index+a[index]) || isWay(a, index-a[index]);
   }
    /**
    * Ex4
    * The method is Boolean recursive and returns the smalest number of steps that the prince need to do to the evil person (-1) in two-dimensional array, If there is no path, then it returns -1
    * Where each number in the array represents the height of a roof and it can go to a roof at the same height or a height one higher or a height lower by one or two than the height it is at. when he is allowed to go in all directions except diagonally
    * @param drm (int [][]), i (int), j (int) 
    * @return the numbers of steps to get to the evil person and if there no such legal route to him the method will return -1
    */
    public static int prince(int[][] drm, int i, int j)
    {
        int count = 0;
        //Checking if the cell he arrived at is the desired cell  
        if(drm[i][j] == -1)
        {
            return count;
        }
        if ( i + 1 > drm.length)
        {
            drm[i + 1][j] += drm[i][j] + 5;
        }
        else if( i - 1 < 0 )
        {
            drm[i - 1][j] += drm[i][j] + 5;
        }
        else if(j + 1 > drm[0].length)
        {
            drm[i][j + 1] += drm[i][j] + 5;
        }
        else if(j - 1 < 0)
        {
            drm[i][j - 1] += drm[i][j] + 5;
        }
        else if(drm[i][j] == drm[i + 1][j] || drm[i + 1][j] == drm[i + 1][j] + 1 || drm[i + 1][j] == drm[i + 1][j] -1 || drm[i + 1][j] == drm[i + 1][j] -2)
        {
            count++;
            prince(drm, i + 1, j);
            drm[i + 1][j] += drm[i][j] + 5;
            prince(drm, i, j);
        }
        else if(drm[i][j] == drm[i - 1][j] || drm[i - 1][j] == drm[i][j] + 1 || drm[i - 1][j] == drm[i][j] -1 || drm[i - 1][j] == drm[i][j] -2)
        {
            count++;
            prince(drm, i - 1, j);
            drm[i - 1][j] += drm[i][j] + 5;
            prince(drm, i, j);
        }
        else if(drm[i][j] == drm[i][j +1] || drm[i][j + 1] == drm[i][j] + 1 || drm[i][j + 1] == drm[i][j] -1 || drm[i][j + 1] == drm[i][j] -2)
        {
            count++;
            prince(drm, i, j + 1);
            drm[i][j + 1] += drm[i][j] + 5;
            prince(drm, i, j);
        }
        else if(drm[i][j] == drm[i][j - 1] || drm[i][j - 1] == drm[i][j] + 1 || drm[i][j - 1] == drm[i][j] -1 || drm[i][j - 1] == drm[i][j] -2)
        {
            count++;
            prince(drm, i, j - 1);
            drm[i][j - 1] += drm[i][j] + 5;
            prince(drm, i, j);
        }
        return -1;
    } // end of exercise 4
}// end of class Ex13
