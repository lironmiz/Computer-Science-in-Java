/**
 * Exam2011JavaA87.java
 * the class hava solutions to the test
 * Author : liron mizrhai
 */
public class Exam2011JavaA87
{
    /**
     * the method return true if the there are two numbers in the array that there difference is bigger than x else false 
     * @parma: int[] a, int x
     * @return boolean
     */
    public boolean difference(int[] a, int x)
    {
        int max = a[0];
        int min = a[0];
        
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        int difference = max - min;
        return difference > x ?  true : false;
    }// end of method difference
    /**
    * Exercise 3 
    * the correct statments are A, B, E
    */
}// end of class Exam2011JavaA87
