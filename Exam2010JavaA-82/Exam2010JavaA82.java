
public class Exam2010JavaA82
{
    public static int maximalDrop(int[] a)
    {
        int maxDiff = Integer.MIN_VALUE;
        int minValue = a[0];
        int maxValue = a[0];
        int maxValueIndex = 0;
        int minValueIndex = 0;
        for(int i = 1; i < a.length; i++) 
        {
            if(a[i] > maxValue)
            {
                maxValue = a[i]; 
                maxValueIndex = i;  
            }
            else if( a[i] < minValue)
            {
                minValue = a[i]; 
                minValueIndex = i; 
            }
            else if( minValue < a[i] && i > maxValueIndex)
            {
                minValue = a[i];
                minValueIndex = i;
            }
            if(maxValue - minValue > maxDiff && maxValueIndex < minValueIndex)
            {
                maxDiff = maxValue - minValue; 
            }
        }
        return maxDiff;
    }
    public static void main(String[] args)
    {
        System.out.println(1.0 == 1);
    }
     /**
     * solution exercise 3
     * 1: System.out.print(a1 == a2); -> false 
     * 2: System.out.print(a1 == a3); -> true
     * 3: System.out.print(a1 == a4); -> false 
     * 4: System.out.print(a3 == a4); -> false
     * 5: System.out.print(b1 == b2); -> false
     * 6: System.out.print(b2 == b3); -> false
     * 7: System.out.print(b1 == b3); -> false
     * 8: System.out.print(a1.equals(a3)); -> true
     * 9: System.out.print(a2.equals(a1)); -> false
     * 10: System.out.print(a4.equals(a1)); -> true
     * 11: System.out.print(b1.equals(b2)); -> false
     * 12: System.out.print(b2.equals(a4)); -> true
     * 13: System.out.print(b1.equals(b3)); -> true
     * 14: System.out.print(b2.equals(a1)); -> true
     */
    /**
     * 3.2
     * the number of objects is 2
     * 3.3
     * the number is 3
     */
}// end of class Exam2010JavaA82
