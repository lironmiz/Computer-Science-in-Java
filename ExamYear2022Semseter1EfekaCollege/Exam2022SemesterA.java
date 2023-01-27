//*******************************************************
//Exam2022SemesterA.java
//the class has solutions to the test 
// Author: liron mizrahi
//*******************************************************
import java.util.Random;
public class Exam2022SemesterA
{
    /**
     * Ex1
     * In this question we will save a song database: for each song we will save its name, who is the artist who wrote it
     * and who is the last artist who performed it. For each artist we will save his name, the list of songs
     * he wrote and the list of songs he performed.
     * Below is a description of the classes that exist in the system and classes that you must add or update,
     * later main will be shown as an example and the output of the result of its execution.
     * 1. Given below is the department for an artist:
     * 1.1. Features of the department: the name of the artist, the set of songs he wrote and the set of songs he performed.
     * 1.2. A constructor that accepts the name of the artist and initializes both arrays to be of size 0.
     * 1.3. getName method that returns the name of the artist.
     * 1.4. Given a wrapper for the hasWroteSong method that accepts a song and returns true whether the artist performed 
     * this song, otherwise return false. It can be assumed that the implementation of the method is correct and working,
     * and can be used (it is not required to implement this method!).
     * 
     * 1.5. Given the wrapper for the addWrittenSong method that receives a song and tries to add its reference to the array of songs
     * the artist wrote, and returns true if the song has been added to the array, otherwise returns false. A song can be 
     * added to the array only if there is no other song with the same name in the array of songs written by the artist.
     * If the array of songs is full, the method increases its size by 2 times. It can be assumed that the implementation of the method
     * is correct and working, and can be used (it is not required to implement this!).
     * 1.6. Add the method hasPerformedSong which receives a song and returns true if the artist has performed a song with this name,
     * otherwise it returns false.
     * 1.7. (6 pts) Added the method addPerformedSong which receives a song and tries to add its reference to the collection of songs
     * the artist has performed. The method returns true if the song has been added to the array, otherwise it returns false.
     * A song can be added to the array of songs performed by the artist only if it does not exist in the array of songs performed by another
     * song with the same name. If the array of songs is full, the method increases its size by 1. Also, make sure to update
     * for the song that this artist is the last to perform a song This (see reference later in the Song class). In order to implement
     * this section, methods from the Arrays class can be used.
     * 1.8. (5 points) Add the toString method that returns a string with the artist's data as shown in the output below.
     * 
     * 2. A class for a song is partially given:
     * 2.1. The class attributes are the name of the song, a reference to the artist who wrote it and a reference
     * to the last artist who performed it.
     * 2.2. (7 points) Write the constructor of the class that receives the name of the song, the artist who wrote it 
     * and the last artist who performed it (this field can be null). The method initializes the object's data and will also take
     * care of the following: for the artist who wrote it, add the song to the list of songs written by him, and similarly,
     * \for the artist who performed it, add the song to the list of songs performed by him (if indeed a performing artist was transferred).
     * 2.3. (6 points) Write the method setLastPerformer which receives an artist (can also be null) and updates him as the last artist
     * who performed the song, and also updates this song for the artist in the list of songs he performed.
     * 2.4. given the method getName which returns the name of the song.
     * 2.5. Given the toString method that returns a string with the user's data.
     * 
     * 3. Partially given class for the song repository (SongsRepository):
     * 3.1. Features of the department: the array of artists and the number of members from the array in use (logical size),
     * the array of songs and the number of members from the array in use (logical size).
     * These two arrays will always grow 2x when they run out of space.
     * 3.2. An enum type called eAddSongStatus is defined in the class which defines success/failure values 
     * when adding a song to the database.
     * 3.3. Given a constructor that initializes the arrays to an initial size of 2.
     * 3.4. Given the methods getArtistByName and getSongByName which accept a string representing
     * a name and return a reference to the corresponding artist/song with that name. If there is no artist/song with this name,
     * null will be returned.
     * 3.5. The method addArtist is given which receives the name of an artist,
     * and if he is not yet in the database, adds him and returns true, otherwise returns false.
     * The method verifies that there is enough space in the array of artists, and if there isn't, increases it by 1.
     * 3.6 Added the addSong method which receives the name of a song, the name of the artist who wrote the song and the name of the artist
     * who last performed the song. If there is no artist who performed the song, an empty string will be passed to this parameter.
     * The method will try to add the song to the database and will only succeed if the song is not yet in the database, the artist 
     * who wrote the song is in the database and the artist who last performed the song (if transferred) is in the database.    
     * The method will verify that there is indeed an artist in the database with the name of the artist who wrote the song,
     * it will verify that there is indeed an artist in the database with the name of the last artist who performed the song
     * (if a non-empty string was passed for the last artist who performed the song) and check that there is enough space in the
     * database to add the new song (and increase if necessary ). 
     * Finally, when everything is in order, you will add the song to the database. Also, the method will make sure to add the song
     * to the artist who wrote the song to his set of songs that he wrote, and if there is a last artist who performed the song,
     * to add the song to the set of songs he performed.
     * The method will return a value of type eAddSongStatus depending on the nature of the failure or success.
     * 3.7. Given the toString method that returns a string with the buffer data.
     */
    // main for example
    public static void main(String[] args)
    {
        SongsRepository repository = new SongsRepository();

        repository.addArtist("gogo");
        repository.addArtist("momo");

        repository.addSong("Corona Hey!", "gogo", "gogo");
        repository.addSong("Antigen sucks", "gogo", "momo");
        repository.addSong("PCR rocks!", "gogo", "momo");
        repository.addSong("Be Healthy Choopie-Doop", "momo", "");
        System.out.println(repository.toString());

        System.out.println("Repository after change:");
        repository.getSongByName("Corona Hey!").setLastPerformer(repository.getArtistByName("momo"));

        System.out.println(repository.toString());
    }// end of method main1
    /**
     * Ex2 
     * you have this recursive function 
     * A : print trace tree for the fuction foo with given num = 1234321 and write what the function will return 
     * B : what the method do? 
     */
    /**
     * the method return true if given number is palindrome otherwise return false
     * @param: int
     * @return: boolean
     */
    public static boolean foo(int num)
    {
        if(num < 10)
        {
            return true;
        }

        if(num < 100)
        {
            return num % 10 == num / 10;
        }

        String strNum = num + "";
        if(strNum.charAt(0) != strNum.charAt(strNum.length() - 1))
        {
            return false;
        }

        return foo(Integer.parseInt(strNum.substring(1, strNum.length() - 1)));
    }// end of method foo 
    // Solution A:
    /**
     *  [1234321] - > true
     *      |
     *   [23432] 
     *      |
     *    [343]
     *      |
     *     [4]
     *      |
     *     true
     */
    // Solution B:
    // the function return true if the number if palindrome otherwise return false

    /**
     * 
     * write this recursive function 
     * public static boolean checkIfNumExistsExactly(int[] arr, int size, int num, cout)
     * 
     * the function get array of number that show the num of elments in the second array ad two aother numbers num and count 
     * the function return true if the num exists exactly in the array count times otherwise the function will return false
     */
    /**
     * the methd return true if the the num exists exactly in the array count times otherwise the function will reutrn false
     * @param: int[] arr, int size, int num, int count 
     * @return: boolean 
     */
    public static boolean checkIfNumExistsExactly(int[] arr, int size, int num, int count)
    {
        if(size == 0)
        {
            return count == 0;
        }
        if(arr[size - 1] == num)
        {
            return checkIfNumExistsExactly(arr, size - 1, num, count - 1);
        }
        else
        {
            return checkIfNumExistsExactly(arr, size - 1, num, count);
        }
    }// checkIfNumExistsExactly
    /**
     * Ex3:
     * A: write a function 
     * public static int biggestSquareWithSameValueFromPos(int[] matrix, int row, int col)
     * The function receives a matrix of numbers and two integers row and col representing a cell
     * in the matrix located at indexes [row][col].
     * The function will check what is the largest square dimension that starts
     * at position [row][col] and its values are identical.
     * Note: the matrix can be in any NXM dimension.
     * @param: int[][] matrix, int row, int col
     * @return: int 
     */
    // Solution A
    public static int biggestSquareWithSameValueFromPos(int[][] matrix, int row, int col)
    {
        int size = 1;

        while(row + size <= matrix.length && col + size <= matrix[row].length)
        {
            for(int i = 0; i < size && row + i < matrix.length; i++)
            {
                for(int j = 0; j < size && col + j < matrix[row].length; j++)
                {
                    if(matrix[row + i][col + j] != matrix[row][col])
                    {
                        return size - 1;
                    }
                }
            }
            size++;
        }
        return size - 1;
    }// end of method biggestSquareWithSameValueFromPos

    /**
     * Ex3: 
     * B: write this function 
     * public static int biggestSquareWithSameValue(int[][] matrix, int res)
     * The function accepts a matrix of numbers and an output array of numbers of size 2 and returns an integer. 
     * The function will check from which index in the matrix a square of numbers with identical values 
     * with the largest dimension begins and will update the indices in the res array
     * (the row index will be at position 0 in the array and the column index will be at position 1 in the array). 
     * The function will return the largest square dimension whose values are the same.
     */
    // solution Ex3 B
    /**
     * the function return the largest square dimension whose values are the same 
     * @param: int[][] matrix, int[] res
     * @return: int 
     */
    public static int biggestSquareWithSameValue(int[][] matrix, int[] res)
    {
        int size = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                int curSize = biggestSquareWithSameValueFromPos(matrix, i, j);
                if(curSize > size)
                {
                    size = curSize;
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return size;
    }// end of method biggestSquareWithSameValue 
    /**
     * Ex3:
     * C: you have the following function and you can use them in the solution 
     * private static void printMatrix(int[][] matrix)
     * {
     *     
     * }
     * private static void randomMatrix(int[][] matrix)
     * {
     *     
     * }
     * write main method that create matrix size 5X5 and will put random numbers inside her and will 
     * print her and will call the function in Ex3 B and finally will print the largest square dimension whose values are the same 
     * 
     */
    // Solution Ex3 C
    /**
     *  public static void main(String[] args)
     * {
     *       int[][] matrix = new int[5][5];
     *       randomMatrix(matrix);
     *       printMatrix(matrix);
     *
     *       int[] res = new int[2];
     *       int size = biggestSquareWithSameValue(matrix, res);
     *       System.out.println("Biggest square size is " + size + " starting from [" + res[0] + ", " + res[1] + "]");
     8  }// end of method main
     */
    /**
     * the function will print the matrix
     * @param: int[][] matrix
     * @return: None
     */
    private static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }// end of method printMatrix 
    /**
     * the function will put random values in the matrix
     * @param: int[][] matrix
     * @return: None
     */
    private static void randomMatrix(int[][] matrix)
    {
        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = rand.nextInt(1, 2);
            }
        }
    }// end of method randomMatrix
}// end of class Exam2022SemesterAEfekaCollege
