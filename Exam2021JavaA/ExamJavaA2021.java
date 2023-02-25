/**
 * Exam2021AavaA.java
 * the class have solutions to the test
 * Author: liron mizrhai
 */
public class ExamJavaA2021
{
    /**
     * solution to exercise 2
     * method return true if given num is specialNumber  otherwise false 
     * @param: int 
     * @return: boolean
     */
    public static boolean specialNumber(int num)
    {
        int firstSum = 0;
        int secondSum = 0;
        int index = 0;
        if(num < 10)
        {
            return true;
        }
        while(num > 0)
        {
            int lastDigit = num % 10;
            if(index % 2 == 0)
            {
                firstSum += lastDigit;
            }
            else
            {
                secondSum += lastDigit;
            }
            num /= 10;
            index++;
        }
        return firstSum == secondSum;
    }// end of method specialNumber 
    /**
     * solution to exercise 3
     *  1. row  = 1 col = 3
     *  solution to exercise 4
     *  false
     *  solution to exercise 5
     *  false 
     *  solution to exercise 6 
     *  4 none of the enswer are correct 
     *  solution to exercise 7
     *  false 
     *  solution to exercise 8 
     *  'c'
     *  solution to exercise 9 
     *  'n'
     *  solution to exercise 10
     *  "medcne"
     *  solution to exercise 11
     *  'f'
     *  solution to exercise 12
     *  "cdeeilimn"
     *  solution to exercise 13
     *  "nmiieedc 
     */
}// end of class ExamJavaA2021
