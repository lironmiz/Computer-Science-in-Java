/**
 * Exam2014JavaA.java
 * the class reprsents a solutions to the test
 * Author: liron mizrhai
 */
public class Exam2014JavaA
{
    public static void main(String[] args)
    {
        String s1 = "abcdef\n";
        //System.out.println(s1.substring(0,0));
        A.f(5);
    }
    /**
     * solution to Exercise 2
     * 2.1 The method returns the index with the largest ASCII
     * length in the string from position f + 1 to the end
     * of the string
     * 
     * 2.2 The "fun2" method performs the swapping 
     * of characters to move the smallest character 
     * found by the "fun1" method to its proper position
     * in the string. The method takes the character at
     * the index "i" and moves it to the left until it
     * is in its proper sorted position. The method does 
     * his by comparing the value of the current character
     * with the previous character in the string, and if
     * the previous character is greater, the two characters
     * are swapped. This process continues until the current
     * character is in its proper position, or until there
     * are no more characters to the left to compare with.
     * The sorted string is then returned by the method.
     * 
     * 2.3 The "something" method performs a sort on a given
     * string of characters "s" by iterating over the string
     * "s" and finding the index of the smallest character
     * starting from the current position "i".
     * The method then moves the smallest character to the current
     * position "i" by swapping the characters in the string.
     * This process is repeated until the string is
     * sorted in ascending order.
     */

    /**
     * solution to exercise 3
     * a.g(4) : ? -> 6, 4 -> lines of code
     * a.g(3) : ? -> 3, 3 -> lines of code 
     * a.f(1) : ? -> 0, 1 -> lines of code
     * a.f(5) : ? -> 20, 14 -> lines of code
     */
    // Ex2 code 
    public int fun1(String s, int f)
    {
        int ans = f;
        for(int i =f+1; i<s.length(); i++)
        {
            if (s.charAt(ans) > s.charAt(i))
            {
               ans = i;
            }
        }
        return ans;
    }// end of method fun1
    public String fun2(String s, int i)
    {
        char value = s.charAt(i);
        while (i > 0 && s.charAt(i-1) > value)
        {
            s=s.substring(0,i)+s.charAt(i-1)+s.substring(i+1);
            i = i-1;
        }
        s=s.substring(0,i)+value+s.substring(i+1);
        return s;
    }// end of method fun2
    public String something(String s)
    {
        for(int i=0; i<s.length()-1; i++)
        {
            int m = fun1(s, i);
            s=fun2(s, m);
        }
        return s;
    }// end of method something 
    // Ex3 code
    public class A
    {
        public static void f (int n)
        {
            for (int i=n; i>0; i--)
            {
                g(i);
            }  
        }// ene of method f
        public static void g (int n)
        {
            for (int i=0; i<n; i++)
                h(i);
        }// end of method g
        public static void h (int n)
        {
            for (int i=0; i<n; i++)
                System.out.print (" ? " );
            System.out.println();
        }// end of method h
    }// end of class A
}// end of class Exam2014JavaA
