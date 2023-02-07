/**
 * Exam2017JavaAMoadB.java
 * the class reprsents a Exam2017JavaAMoadB
 * Author: liron mizrhai
 */
public class Exam2017JavaAMoadB
{
    /**
     * solution to exercise 2: 
     * 2.1
     * solution: |3|4|1|2|11|9|
     * 2.2
     * soltion: |2|1|3|4|11|9|
     * 2.3
     * solution: 
     * Median of the members of the array 
     * (that is, the number that half of the members are larger
     * than and half of the members are smaller than)
     */
    public class Q2
    {
        private static double average (int []a, int low, int high)
        { 
            System.out.println("ok");
            return 5;
        }// end of method average 

        private static void swap (int []a, int p, int q)
        { 

        }// end of method swap

        public static int split (int[] a, int left, int right)
        {
            double avg = average (a, left, right);
            while (left < right)
            {
                while (left < right && a[left] <=avg)
                {
                    left++;
                }
                while (right > left && a[right] >=avg)
                {
                    right--;
                }
                swap (a, left, right);
            }
            return right;
        }// end of method split 

        public static void split (int [] a)
        {
            int left = 0;
            int right = a.length-1;
            int mid = a.length/2;
            int cut = split(a, left, right);
            while (cut!= mid)
            {
                if (cut < mid)
                {
                    left = cut; 
                }           
                else
                {
                    right = cut-1;
                }
                cut = split(a, left, right);
            }
        }// end of method split 

        public static int what (int [] a)
        {
            split(a);
            int mid = a.length/2;
            int min = a[mid];
            for (int i = mid+1; i<a.length; i++)
                if (a[i] < min)
                {
                    min = a[i];
                } 
            return min;
        }// end of method what 
    }// end of class Q2
    /**
     * solution to exercise 3
     * 3.1
     * solution: goo luch in th xam
     * 3.2
     * the function take down from s1 all the letters that in s2
     */
    // code for exercise 3
    public static String what(String s1, String s2)
    {
        int[] c = new int [26];
        String res = s1;
        for (int i=0; i<s2.length(); i++)
        {
            int p = s2.charAt(i) -'a';
            c[p]++;
        }
        int count = 0;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) >= 'a' && s1.charAt(i)<= 'z')
            {
                int p = s1.charAt(i) -'a';
                if (c[p] != 0)
                {
                    res = res.substring(0, count) + res.substring(count+1);
                }
                else
                {
                    count++; 
                }
            }
            else
            {
                count++;
            }
        }
        return res;
    }// end of method what 
}// end of exam Exam2017JavaAMoadB