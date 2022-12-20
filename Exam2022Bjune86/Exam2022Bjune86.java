//*******************************************************
// Exam in June 2022B (86)
// Semester 2022B
// Solutions to the test
//*******************************************************
public class Exam2022Bjune86
{
    /**
    * Ex1 
    * static recursive method thet return the max sum of valid trace
    * in two d array if there not a valid path
    * the method return Integer.MIN_VALUE
    * we know in advance that all the numbers are positve and less then 100
    * a valid path is start from the (0, 0) index until the (mat.length, mat[0].length) 
    * and we can move from one cell the other cell by the example 
    * [2][3]
    * or +1 in row and +5 in column or +5 in row and +1 in column
    * @param int[][] mat 
    * @return int
    */
    public static int maxPath(int[][] mat)
    {
        return maxPath(mat, 0, 0, 0, 1);
    }
    // Aulliexsery method 
    private static int maxPath(int[][] mat, int row, int column, int sum, int cellId)
    {
        // checking if we out of the arr bound and we not in the same cell 
        if(row > mat.length - 1 || column > mat[0].length - 1 || row + column == cellId)
        {
            return Integer.MIN_VALUE;
        }
        // if we at the end of the track and increase sum
        if(row == mat.length - 1 && column == mat[0].length - 1)
        {
            return sum + mat[row][column]; 
        }
        // make cell id 
        cellId = row + column;
        int val = mat[row][column];
        // set the four opetion to min value
        int opetion1 = Integer.MIN_VALUE, opetion2 = Integer.MIN_VALUE , opetion3 = Integer.MIN_VALUE, opetion4 = Integer.MIN_VALUE;
        // opetion 1 if val is less then 10 we have two opetion row + val or column + val and incrase sum
        if(val < 10)
        {
            opetion1 = maxPath(mat, row + val, column, sum + val, cellId);
            opetion2 = maxPath(mat,row, column + val, sum + val, cellId);
        }
        else // if val is greatar then 10 we have also two opetion row + first digit and column + second digit or the opposite and incrase sum
        {
            int firstDigit = val % 10; 
            int secondDigit = val / 10;
            opetion3 = maxPath(mat, row + firstDigit, column + secondDigit, sum + val, cellId);
            opetion4 = maxPath(mat, row + secondDigit, column + firstDigit, sum + val, cellId);
        }
        // recursive call with the max of all the opetions
        return Math.max(Math.max(opetion1,opetion2), Math.max(opetion3, opetion4));
    }// end of method maxPath
    /**
    * Explanation of the code:
    * We use recursive loading and a pattern of a recursive algorithm
    * to find the maximum in the array when we try the possible options
    * when at the beginning we have our conditions where the first
    * condition is that we have not gone out of the bounds of the array
    * and that we have not returned to the same cell after that we check
    * if we are in the last cell when if we are in it We increase our sum
    * by the value of the last cell when at each cell visit the cell ID
    * \is output to avoid a loop that repeats itself in the recursive
    * tree and we check 4 options according to which are initialized to
    * integer.MIN_VAL and which return the largest value
    */
    /**
    * Ex2 
    * the metod is sort arr by k module value and the arr will be sort by that for all two 
    * indexs i, j if i < j -> arr[i]modk <= arr[j]modk
    * or +1 in row and +5 in column or +5 in row and +1 in column
    * @param int[], int 
    * @return None
    * * Time Complexity O(n^2) (two loop that depend on the size of the arr)
    * Space Complexity O(1) (because the amount of memory is fixed and does not depend on the size of the array)
    */
    public static void sortmod(int a[], int k)
    {
        // looping with the first index 
        for(int i = 0;  i< a.length; i++)
        {
            // for each index i we loop again on the arr with j 
            for(int j = i + 1;j<a.length;j++)
            {
                // if the opposite of condition happens we do a swape
                if(a[j] % k <= a[i] % k)
                {
                    // swaping the two values with temp var
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }// end of second loop 
        }// end of first loop
    }// end of method sortmod
    /**
    * Explanation of the code I basically perform the same
    * bubble sort algorithm only that I perform the comparison with
    * modulo K values
    */
    /**
    * Ex3 
    * Section A: 
    * to what method was given as parmater a root of binary tree the output was
    * ((30) 20 ((50) 5)) 40 (10)
    * and we need to print how the binary tree look like 
    *         20
    *        /  \
    *       30   5 
    *           / \
    *         50  10
    *            /
    *           40
    * Section B:
    * to what method was given as parmater a root of binary tree the output was
    * ((15)(((2) 30)4))7)
    * and we need to print how the binary tree look like 
    *          2
    *         / \
    *        15  4
    *           / \
    *          30   7
    *            
    * Section C:
    * to what methd was given as parmater a root of binary tree what we can say For sure about the output
    * answer: we can say that the values will be in the output in inorder
    * (left , root, right)
    * 
    * Section D; it was given the binary tree: 
    *          42 root
    *         /  \
    *       24    41
    *      /      /  \
    *     10    38    6
    *    /       \
    *   5         11
    *            
    *  and we been asking to rewrite the what method for return the string 
    *  (42(24(10(5))(45))(41(38(11))(6)))
    * Ex 4 
    * we have 3 class A, B, C and prints statment we need to say what each print will do 
    * Section 1:
    * what is the output of System.out.println(ab.f(bb));
    * answer: in A 3
    * Section 2:
    * what is the output of System.out.println(ab.f((A)bb));
    * answer: in A 3
    * Section 3:
    * what is the output of System.out.println(bb.f(ab));
    * answer: in A 2
    * Section 4:
    * what is the output of System.out.prontln(bb.f(bc));
    * answer in B 10
    * Section 5:
    * what is the output of System.out.prontln(ac.f(bc));
    * answer in C 6
    * Section 6:
    * what is the output of System.out.prontln(ac.f(bb));
    * answer in C in A 3
    * Section 7:
    * what is the output of System.out.prontln(bc.f(ab));
    * answer in C in A 2
    * Section 8:
    * what is the output of System.out.println(bc.f(bb));
    * answer in B 6
    * Section 9:
    * what is the output of System.out.println(bc.f((C)ab));
    * answer run time error 
    */
    /**
     * Ex5 we have a classs IntNode and linked list and what method
     * Section A: given the linked list: 
     * 1->1->0->1->1->0->1->1->1->1->0->0
     * what will be the ouput of what method with k = 2
     * answer 10
     * Section B:
     * what will be the ouput of what method with k = 5
     * answer 12
     * Section C:
     * what need to be k for the output of what method will be 4
     * answer k = 0
     * Section D:
     * we need to write a list with 5 elment that the calls
     * list1.what(0) will return 1
     * list1.what(1) will return 2
     * list1.what(2) will return 3
     * list1.what(3) will return 4
     * list1.what(4) will return 5
     * answer: 
     * 0->1->0->0->0
     *
     */
}// end of class Exam2022Bjune86
