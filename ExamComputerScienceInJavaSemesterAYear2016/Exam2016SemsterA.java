
public class Exam2016SemsterA
{
    /**
     * In this question, we will manage data from a deck of cards in which the user takes a card from the top 
     * of a deck of cards, and must guess whether the card below the top of the deck is off or lower than
     * the card in his possession. If the user was right, he will make another guess, until the cards run out
     * in the deck or until he presents an incorrect guess. Finally the program will show the user how many correct guesses he made
     * Each card has a numerical value from 1 to 10 and a sign
     * 1. Rose
     * 2. Heart
     * 3. Diamond
     * 4. Clover
     * A card is considered high because if its numerical value is greater, and if the numerical value is the same,
     * there is priority for signs according to the following list: the clover has the highest priority and the rose has the lowest priority.
     * Complete the project sections as follows:
     * 1 card class :
     * 1.1 You must create this class and define the following properties in it: a constant for the maximum numerical value of a card,
     * the numerical value of the card, an enum for the different types of symbols for the card and a attribute for the card sign
     * 
     * 1.2 Define a method that receives a number and a sign if the number is not between 1 and 10 it will receive the value 1.
     * 
     * 1.3 Define a method that knows how to build card data from a file that is already open and ready to read.
     * 1.4 Write a save method that receives an object ready for writing and writes to it the numerical value of the card and the name
     * of the symbol on it
     * 1.5 isHigher method that accepts an additional card as a parameter and returns true if the value of the card representing the 
     * activating object is greater than the value of the card received as a parameter, otherwise false will be returned
     * 1.6 toString method that returns a string with the number of the card and the name of the symbol that appears on it
     * 
     * 2 Deck class
     * 2.1 You must create this class and define the following properties in it: a constant for the symbolic number of cards in the pack
     * and the array of cards in the deck and a number indicating how many cards are left in the deck
     * 2.2 Write a builder and draw the face of the pack so that there is a card for every combination of number and sign.
     * Finally, the method that shuffles the order of the cards in the pack must be called
     * 2.3 Write a constructor that accepts the name of a file containing deck data: the first value in the file is the number of
     * cards in the deck and add pairs of values so that each pair describes card data a number that is the numerical value of the
     * card and a string with the mark on the card
     * 2.4 Write a save method that accepts the name of a file and writes to it the number of cards in the deck and calculates
     * the data of all the cards, the number of the card and the mark on the card
     * 2.5 Write a shuffle method that shuffles the order of the members of the pack as follows: Runs in a loop for the number
     * of members in the pack and in each turn replaces the position of two random members
     * 2.6 Write a method that returns the number of cards left in the deck
     * 2.7 Write a method that removes the card at the top of the deck and returns it
     * 2.8 Write a method that returns the card at the top of the deck and does not remove it
     * 2.9 Write a toString method that returns a string with the data of all the cards in the deck, so that the card at
     * the top of the deck appears first.
     */

    // exercise 2 part 1 from year 2016 semster a
    // you have this recursive function 
    public static int what(int num)
    {
        if(num < 10)
        {
            return 0;
        }

        if(num%100%3 == 0)
        {
            return 1 + what(num/10);
        }
        else 
        {
            return what(num/10);
        }
    }
    /**
     * A : print Trace tree for this function with num=93423
     * Answer: 
     * what(93423) -> 2
     *   |
     * what(9342)
     *   |
     * 1 + what(934)
     *   |
     * what(93)
     *   |
     * 1 + what(9)
     *   |
     *   0
     * B : what the function doing with given num?
     * The function returns the number of consecutive
     * digit pairs divisible by 3
     */

    /**
     *  write a fucntion that get array and it size and return the distinct numbers in the array
     *  Example:
     *  [3, 8, 8, 3, 3] -> 2
     *  [7, 3, 8, 6, 7] -> 4
     *  [4, 0, 8, 0, 5] -> 4
     *  [9, 6, 2, 5, 1] -> 5
     *  [7, 8, 2, 9, 9] -> 4
     */
    // Soultion :
    /**
     * method return the number of distinct numbers in the array
     * @param: int[] arr, int size
     * @return: int 
     */
    public static int numOfDifferentValues(int[] arr, int size)
    {
        if(size <= 1)
        {
            return size;
        }

        for(int i = 0; i < size - 1; i++)
        {
            if(arr[i] == arr[size - 1])
            {
                return numOfDifferentValues(arr, size - 1);
            }
        }
        return numOfDifferentValues(arr, size - 1) + 1;
    }// end of method numOfDifferentValues
    /**
     * Exercise 3: 
     * Keperker number - is a natural number equal to the sum of the
     * Risha and Sipa of the decimal representation of its square.
     * For example: 9 is a Keperker number because the square of its
     * digits is 81 and 8 + 1 equals 9, the root is 8 and the sipa is
     * 1 and the number 95121 also maintains the same property
     * because in the square it is 9048004641 and its risha and 
     * sipa add up to 95121
     * 
     * A : Section A should write a function named isKaprekarVerInts
     * as described above so that the implementation will be based 
     * on mathematical commands only and the method will receive
     * a number and an array of length 2 and return true if the number
     * is a Kaprekar number and if it is, it puts its Risha and Sipa
     * in the array and if it is not, it returns false
     * 
     */
    /**
     * method checks if two given numbers end with the same digits 
     * @param: long num1, long num2
     * @return: boolean 
     */
    private static boolean numberEndsWith(long num1, long num2)
    {
        while(num2 > 0)
        {
            if(num1 % 10 != num2 % 10)
            {
                return false;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return true;
    }// end of method numberEndsWith
    /**
     * method return the given number  
     * @param: long num
     * @return: long
     */
    private static long reverse(long num)
    {
        long revNum = 0;
        while(num > 0)
        {
            revNum *= 10;
            revNum += num % 10;
            num /= 10;
        }
        return revNum;
    }// end of method reverse 
    /**
     * method return if two given numbers start with the same digits
     * @param: long num1, long num2
     * @return: boolean
     */
    private static boolean numberStartsWith( long num1, long num2)
    {
        return numberEndsWith(reverse(num1), reverse(num2));
    }// end of method numberStartsWith
    /**
     * method return if the middle part of the numbers is equal in its digits 
     * @param: long num1, long part1, long part2
     * @return: boolean
     */
    private static boolean isMiddlePartOfNumber(long num1, long part1, long part2)
    {
        while(part2 > 0)
        {
            num1 /= 10;
            part2 /= 10;
        }

        return reverse(num1) == reverse(part1);
    }// end of method isMiddlePartOfNumber
    /**
     * method return true if the all the helper methods return true
     * @param: long num, long part1, long part2
     * @return: boolean
     */
    private static boolean arePartsKaprekarNum2(long num, long part1, long part2)
    {
        long doubleNum = num*num;
        return numberStartsWith(doubleNum, part1) && numberEndsWith(doubleNum, part2) && isMiddlePartOfNumber(doubleNum, part1, part2);
    }// end of method arePartsKaprekarNum2
    /**
     * method return true given num is kaprekar num 
     * @param: int num, int[] parts
     * @return: boolean
     */
    public static boolean isKaprekarVerInts(int num, int[] parts)
    {
        for(int i = 1; i < num; i++)
        {
            int part1 = num - i, part2 = i;
            if(arePartsKaprekarNum2(num, part1, part2))
            {
                parts[0] = part1;
                parts[1] = part2;
                return true;
            }
        }
        return false;
    }// end of method isKaprekarVerInts

    /**
     * same method with strings
     * @param: int num, int[] parts
     * @return: boolean
     */
    public static boolean isKaprekarVerStrings(int num, int[] parts)
    {
        for(int i = 1; i < num; i++)
        {
            int part1 = num - i, part2 = i;
            if(arePartsKaprekarNum1(num, part1, part2))
            {
                parts[0] = part1;
                parts[1] = part2;
                return true;
            }
        }
        return false;
    }// end of method isKaprekarVerStrings 
    /**
     * method return true if the num and the parts pass all the test that show if the num is kaprekar num
     * @param: long num, long part1, long part2
     * @return: boolean
     */
    private static boolean arePartsKaprekarNum1(long num, long part1, long part2)
    {
        String doubleNum = num*num + "";
        String leftPart = part1 + "";
        String rightPart = part2 + "";
        String middleString = doubleNum.replaceAll(leftPart, "").replaceAll(rightPart, "");
        middleString = middleString.isEmpty() ? "0" : middleString;
        return doubleNum.startsWith(leftPart) && doubleNum.endsWith(rightPart) && Integer.parseInt(middleString) == 0;
    }// end of method arePartsKaprekarNum1
}// end of class Exam2016SemsterA
