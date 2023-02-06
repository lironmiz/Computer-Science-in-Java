
public class Exam2017JavaA
{
    /**
     * Ex2
     * 
     * solution:
     * Ex2.A
     * |-4|-3|0|0|1|2|6|4|5|3|2|
     * Ex2.B
     *  rearranges its elements such that all positive 
     *  elements are at the end of the array, all negative
     *  elements are at the beginning of the array, and all 
     *  0's are in the middle.
     */ 
    public static int[] secret (int [] a)
    {
        int r = -1;
        int w = 0;
        int b = a.length;
        int temp;
        do{
            if (a[w] == 0)
                w++;
            else
            if (a[w] < 0)
            {
                r++;
                temp = a[r];
                a[r] = a[w];
                a[w] = temp;
                w++;
            }
            else
            {
                b--;
                temp = a[b];
                a[b] = a[w];
                a[w] = temp;
            }
        } while (w<b);
        return a;
    }// end of method secret
    public class Str
    {
        private String _s;
        public Str(String s)
        {
            _s = s;
        }

        public void what (Str other)
        {
            int b =0, p = 0;
            for (int i=0; i< _s.length (); i++)
            {
                int ind = other._s.indexOf(_s.charAt(i));
                if (ind == i)
                    b++;
                else if (ind != -1)
                    p++;
            }
            System.out.println ("b = " + b + " p = " + p);
        }
    } 
    /**
     * Exercise3 
     * 3.A  the output is b = 2 p = 4
     * The method compares two Str objects and print the number of characters that exist in
     * both Str objects and the number of characters 
     * that exist in both Str objects but not at the same position. 
     */
}// end of Exam2017JavaA
