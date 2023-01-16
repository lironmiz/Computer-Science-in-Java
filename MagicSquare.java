/**
 * MagicSquare.java
 * the class represent a MazicSquare
 * @author (liron mizrhai)
 * @Date (1/7/2023)
 */
public class MagicSquare
{
    /**
    * method return the sum of given row in the mat
    * @parm int[][] mat, int rowNumber
    * @return int
    */
    public static int sumRow(int[][] mat, int rowNumber)
    {
        int sum = 0;
        for (int i = 0; i < mat[rowNumber].length; i++)
        {
            sum += mat[rowNumber][i];
        }
        return sum;
    }// end of method sumRow
    /**
    * method return the sum of given col in the mat 
    * @parm int[][] mat, int colNumber
    * @return int
    */
    public static int sumCol(int[][] mat, int colNumber)
    {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
        {
            sum += mat[i][colNumber];
        }
        return sum;
    }// end of method sumCol
    /**
    * method return the sum of the primary digonal
    * @parm int[][] mat
    * @return int
    */
    public static int sumPrimaryDiag(int[][] mat)
    {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
        {
            sum += mat[i][i];
        }
        return sum;
    }// end of method sumPrimaryDiag
    /**
    * method return the sum of the second digonal
    * @parm int[][] mat
    * @return int
    */
    public static int sumSecondaryDiag(int[][] mat)
    {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
        { 
            sum += mat[i][mat.length-1-i]; 
        }
        return sum;
    }// end of method sumSecondaryDiag

    public static boolean isMagicSquare(int[][] mat)
    {
        int sumRow;
        int sumCol;
        int sumPrimary = sumPrimaryDiag(mat);
        int sumSecondary = sumSecondaryDiag(mat);
        if(sumPrimary != sumSecondary)
        {
            return false;
        }
        for(int i = 0; i < mat.length; i++)
        {
            if(sumRow(mat, i) != sumPrimary)
            {
                return false;
            }
            if(sumCol(mat, i) != sumPrimary)
            {
                return false;
            }
        }
        return true;
    }// end of method isMagicSquare
}// end of class MagicSquare
