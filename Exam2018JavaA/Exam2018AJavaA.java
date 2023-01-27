/**
 * Exam2018AJavaA.java
 * the class have solutions to the test
 * Author: liron mizrhai
 */
public class Exam2018AJavaA
{
    /**
     * the method return true if there are a partition that the sum of the two partitions are equal 
     * @param: int[] a
     * @return: boolean
     */
    public static boolean equalPartition(int[] a)
    {
        for(int i = 0; i < a.length; i++) 
        {
            int sumLeft = 0;
            int sumRight = 0;
            for(int j = 0; j <= i; j++) 
            {
                sumLeft += a[j]; 
            }
            for(int k = i + 1; k < a.length; k++) 
            {
                sumRight += a[k]; 
            }
            if(sumLeft == sumRight)
            {
                return true;
            }
        }
        return false;
    }// end of method equalPartition

    // Exercise 3
    // A -> 3
    // B -> abcde
    // C -> no 
    // D -> t the method will return the index (position)
    // in the input string where the longest consecutive repeating characters sequence starts,
    
    // Exercise 4
    // A -> 2 3
    // b -> 2
    // c -> 2 5
    // d -> The method prints the necessary divisors when allowing
    // the number to reach zero by dividing them without a remainder
}// end of class Exam2018AJavaA
