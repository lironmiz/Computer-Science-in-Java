import java.util.Scanner;
public class Exam2018Moad82
{
    /**
     * solution to Exercise 2
     */
    public static boolean diffValues(int[] a, int num)
    {
        if(a.length == 1)
        {
            return a[0] <= num && a[0] >= 1;
        }
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < 1 || a[i] > num)
            {
                return false;
            }
            if( i != a.length - 1)
            {
                for(int j = i + 1; j < a.length; j++)
                {
                    if(a[j] == a[i])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }// end of method diffValues
    /**
     * Solution to exercise 3
     */
    // 3.1
    // |8|68|12|6|3|7|45|23|
    // 3.2
    // 2 4 5 5 5 5 5 5 
    // 3.3
    // 5 5 5 5 5 5 5 5 
    // 3.4
    // The program section puts odd numbers on the right side of
    // the array and even numbers on the left side of the array
    // when it print the even and odd numbers at the end
    public static void main(String[] args)
    {
        int[] arr = new int[8];
        int i=0, k, num;
        Scanner input = new Scanner(System.in);
        k = arr.length - 1;
        while (i <= k)
        {
            num = input.nextInt();
            if (num%2 == 0)
            {
                arr[i] = num;i++;
            }
            else   
            {
                arr[k] = num;
                k--;
            }
        }
        System.out.println ("i= " + i + "k= " + k);
    }

    /**
     * Solution to exercise 4
     */
   // 4.1 
   // |5|9|12|14|16|18| 
   // |9|12|14|16|18|20|
   // |12|14|16|18|20|40|
   // 4.2 
   // The method checks that for each member the member to the right and below it is greater than 
   // it if all the members represent it except
   // the lower right member the function returns true otherwise false
}// end of class Exam2018Moad82
