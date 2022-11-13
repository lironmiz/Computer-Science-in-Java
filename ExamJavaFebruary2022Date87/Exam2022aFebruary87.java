//*******************************************************
// Exam in February 2022 (87)
// Semester 2022a
// Solutions to the test
//*******************************************************
public class Exam2022aFebruary87
{
    /**
    * Ex1 section A
    * A boolean recursive method that returns true if the submatrix
    * of size whose upper left corner is [x][x] is a unit matrix
    * otherwise it returns false
    * It can be assumed that the matrix is not empty and square
    * and furthermore it is forbidden to use loops and auxiliary arrays
    * @param mat (Square matrix) int x, int size
    * (Represents the size of a matrix)
    * @return true or false
    */
    public static boolean isIdentity (int[][] mat, int x, int size)
    {
        // if the matrix is one cell
        if(size == 1 && mat[x][x] == 1)
        {
            return true;
        }
        //looping the matrix
        return checkRow(mat, x, x, size);
    }// end of method isIdentity
    private static boolean checkRow( int[][] mat, int row, int x, int size)
    {
        // If we have finished checking all the rows
        if(row == x + size)
        {
            return true;
        }
        // check all columns and all rows
        return checkRow(mat, row +1, x, size) && checkCol(mat, row, 0, x, size);
    }// end of method checkRow
    private static boolean checkCol(int[][] mat, int row, int col, int x, int size)
    {
        // If we have finished checking all the columns and did not return false
        if (col == x + size)
        {
            return true;
        }
        // If we are not on the main diagonal
        if (row != col)
        {
            // If the number that is not on the main diagonal is non-zero
            if( mat[row][col] != 0)
            {
                return false;
            }
        }
        // If we are on the main diagonal
        if (row == col)
        {
            // If the number on the main diagonal is different from one
            if( mat[row][col] != 1)
            {
                return false;
            }
        }
        //If we didn't return false until now everything is fine
        return checkCol(mat, row, col + 1, x, size);
    }// End of method checkCol
    /**
    * Ex1 section B
    * A boolean recursive method that returns the maximum size of
    * the central submatrix of mat which is a unit matrix
    * It can be assumed that the matrix mat is square and
    * that the number of rows and columns is odd
    * @param mat (Square matrix)
    * @return int
    */
    public static int maxMatrix(int[][] mat)
    {
        // Index in the middel of the matrix
        int mid = mat.length/2;
        
        return maxMatrix(mat, mid, 1, 0);
 
    }// end of method maxMatrix
    public static int maxMatrix(int[][] mat, int mid, int size, int count)
    {
        // Special case
        if (size ==1)
        {
            if (isIdentity(mat, mid, 1))
            {
                return maxMatrix(mat, mid, 2, 1);
            }
        }
        // Checking whether we are leaving the boundaries of the array
        if( 2*size + 1 > mat.length)
        {
            return count;// We'll bring back the biggest yet
        }
        if(isIdentity(mat, mid + size, 1 + 2*size))
        {
            return maxMatrix(mat, mid, size + 1, 1+2*size);
        }
        else
        {
            //We will return the largest we have found so far
            return count;
        }
    }// End ex1 section B
    // Explanation of the code
    /**
    * Section A - The idea is to run over all the members of the sub-matrix
    * and check if they all fit to be a unit matrix.
    * That is, if all the members only the main diagonal are equal to zero
    * and only one on the main diagonal
    * We will use 2 recursive methods
    * to run on each column and row and check each cell.
    * *****************************************************
    * Section B - In the solution of this section,
    * we use the method from Section A, therefore we find each time
    * the index of the upper left member and the size
    * of the largest matrix stored in the count variable,
    * when we cannot find a larger one,
    * we return the count which is the last size we found
    */
    
    /**
    * Ex2
    *  The method returns the index in the array where the first member
    *  of the missing subseries should have appeared.
    *  If no member of the series is missing, the value
    *  of the place after the end of the array will be returned
    *  It can be assumed that the array contains whole numbers and its
    *  length is greater than or equal to 3
    *  which contains a sequence of consecutive members of an invoice
    *  series. When a subseries is deleted from the series - that is,
    *  a number of consecutive members. At least one member and maybe more
    * @param a (arr)
    * @return int
    */
    public static int findMissingIndex(int[] a)
    {
        int d1, d2, d; 
        // We will find the difference of the invoice series, it will definitely be at the end\beginning
        d1 = a[a.length -1] - a[a.length -2];
        d2 = a[1] - a[0];
        d=Math.min(d1, d2);
        //variables for binary search
        int n1 = a.length -1,low=0,mid, largestValue, elementAmount;
        
        while (low <= n1)
        {
           mid =(n1+low)/2;
           if (mid - 1 > 0 && a[mid]-a[mid] > d)
           {
               return mid;
           }// If we found the cell
           elementAmount = n1 - mid; // The number of jumps between the members of the series
           largestValue = a[mid] + elementAmount * d; // The value that should have been in a[n1] if it was a valid series
           if(a[n1] == largestValue)
           {
               n1 = mid -1;
           }
           else // The right part is not a valid series
           {
               low = mid + 1;
           }
        } 
        return a.length + n1;//If we did not return a value, it means that the series is correct
    }// end of method findMissingIndex
}
 // Explanation of the Ex2
/**
* First we will find d of the arithmetic series by a suitable calculation.
* We will then perform a type of binary search to locate the problematic index if it exists at all.
* Algorithm explanation - we always calculate the expected value that we would get in a[n1] 
* if it were a normal invoice series. If we find that the value is different,
* then of course we have to search in the right part. If the right part is normal,
* we will search in the left part again, God forbid.
* Time Complexity O(log(n)) (Binary Search)
* Space Complexity O(1) (because the amount of memory is fixed and does not depend on the size of the array)
*/
/**
* Ex3 
* Section A - The method will return 37 by the call BinaryTree.f(root)
* Section B - the method f returns the route amount of the route
* with the maximum amount when there is a single cell in the tree,
* will return the value at the root if the tree is empty will
* return Integer.MIN_VALUE
* Section C - The method will return 10, 9, 7, 6 by the call BinaryTree.something(root, 32)
* Section D - The method returns true if there is a route from
* the root of the tree, to one of the leaves, whose sum of members
* in the route is equal to num. If so, true will be returned and the
* route from the leaf to the root of the route will be printed,
* while otherwise, false will be returned and nothing will be printed.
* If the tree is empty and the number is different from zero,
* false will be printed, otherwise true will be printed.
* If there is a single member and it is equal to a number,
* true will be returned otherwise false will be returned
*/
/**
* Ex4 
* In this question, sections are given and there are seven sections
* where in each section you have to choose the most appropriate answer
* Section 1: Which of the following calls will return the value true
* Answer: d - c2.f(1)
*
* Section 2: Which of the following readings will print the line result: 10
* Answer: b - b2.g(b2)
*
* Section 3: Which of the following readings will print the line result: 9
* Answer: A - c2.g(b1)
*
* Section 4: Following the addition of the order: ((A)c2(.g(c2);
* Which line will be printed?
* Answer - a - the line -resulat 7 will be printed
*
* Section 5: Following the addition of the order: ((B)b1).g(b2);
* Which line will be printed?
* Answer - d - the line -resulat 10 will be printed
*
* Section 6: Following the addition of the order: ((C)b1).g(c2);
* Which line will be printed?
* Answer - and - a runtime error will appear
*
* Section 7: Following the addition of the order: ((C)b2).g(c1);
* Which line will be printed?
* Answer - E - A compilation error will appear
*
*/
