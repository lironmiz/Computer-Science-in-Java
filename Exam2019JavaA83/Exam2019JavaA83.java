/**
 * Exam2019JavaA83.java
 * the class solutions to the test 
 * Author: liron mizrhai
 */
public class Exam2019JavaA83
{
    /**
    * the method return the original string of secret string
    * @param: String secret
    * @return: String
    */
    public static String getOriginal(String secret)
    {
       String originalString = "";
       for(int i = 0; i < secret.length(); i++)
       {
           char ch = secret.charAt(i);
           int intChar = (int) (ch - (i + 1));
           ch = (char) intChar;
           originalString += ch;
       }
       return originalString; 
    }// end of method gotOriginal
    
    // Ex3
    // Solution 1 -> | | | | |2|5|7|0|9|4|
    // Solution 2 -> the method put the num in the last indexs she need to 
    // Solution 3->  |0|0|0|0|6|4|6|1|8|9|
    // Solution 4 -> she do add the two numbers and put in the arr3
                
    /**
     * Ex4
     * -3 -2 0 9
     * -1  0 5 12
     *  5  8 11 14
     *  num = 5
     */
    // Solution 1 -> true
    // Solution 2 -> the method return true if the array is sorted for low to high in all the rows and columns
    // Solution 3 -> 2
    // Solution 4 -> The method returns the number of occurrences of the number in the two-dimensional matrix, given that the test method returned true
    
    // res = 2
    // row = 3
    // col = -1
    // while( 3 < 3 && 0>=0)
    //
}// end of class Exam2019JavaA83
