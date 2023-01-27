//*******************************************************
// Exam in February 2022 (89)
// Semester 2022a
// Solutions to the test
// Author: liron mizrahi
//*******************************************************
public class Exam2022aFebruary89
{
   public static void main(String[] args) 
   {
       // checking the isJump method
       System.out.println(isJump("adbrcfa", "abc", 2)); // true
       System.out.println(isJump("cbdadbrcfa", "abc", 2)); // false
       System.out.println(isJump("adcfbaagcxabcd", "abc", 4)); // true
       System.out.println(isJump("abcfbaagcxabcd", "abc", 1)); // true
       System.out.println(isJump("accbc", "abc", 3)); // false
       // checking the strStep method
       System.out.println(strStep("adbrcfa", "abc")); // 2
       System.out.println(strStep("cbdadbrcfa", "abc")); // -1
       System.out.println(strStep("adcfbaagcxabcd", "abc")); // 4
       System.out.println(strStep("abcfbaagcxabcd", "abc")); // 1
       // checking the longestSubarray method 
       int[] arr = new int[6];
       arr[0] = -1;
       arr[1] = 1;
       arr[2] = -1;
       arr[3] = -5;
       arr[4] = 2;
       arr[5] = 2;
       System.out.println(longestSubarray(arr)); 
       // return: 3 Starting index = 0 Ending index = 2
       int[] arr1 = new int[6];
       arr1[0] = 1;
       arr1[1] = 2;
       arr1[2] = 3;
       arr1[3] = 4;
       arr1[4] = 5;
       arr1[5] = 4;
       //System.out.println(longestSubarray(arr1));
       // return: 1 Starting index = 0 Ending index = 0
       int[] arr2 = new int[9];
       arr2[0] = 3;
       arr2[1] = 3;
       arr2[2] = 2;
       arr2[3] = -7;
       arr2[4] = 2;
       arr2[5] = 1;
       arr2[6] = 1;
       arr2[7] = -2;
       arr2[8] = -2;
       System.out.println(longestSubarray(arr2)); 
       // return: 3 Starting index = 2 Ending index = 4
       int[] arr3 = new int[10];
       arr3[0] = 1;
       arr3[1] = -2;
       arr3[2] = 3;
       arr3[3] = -4;
       arr3[4] = -5;
       arr3[5] = 4;
       arr3[6] = 2;
       arr3[7] = -4;
       arr3[8] = 6;
       arr3[9] = -2;
       System.out.println(longestSubarray(arr3));
       // return: 4 Starting index = 0 Ending index = 3
   }// end of method main
   /**
   * Ex1 section A
   * A Boolean recursive static method that returns true
   * if the second string appears in constant skips
   * within the first string starting from the first character in both
   * strings and otherwise it will return false
   * @parm String str1, String str2, int step
   * @return boolean true or false
   */
   public static boolean isJump(String str1, String str2, int step)
   {
        // check if step is not valid
        if(step < 1)
        {
            return false;
        }
        // check if str2 is empty
        if(str2.length() == 0)
        {
            return true;
        }
        // checking that the jump start from the first index 
        if(str1.charAt(0) != str2.charAt(0))
        {
            return false;
        }
        // checking if we can make a substring 
        if(str1.length() < step)
        {
            return false;
        }
        return isJump(str1.substring(step),str2.substring(1), step);
   }// end of method isJump
   /**
   * Ex1 section B
   * A recursive static method which returns the value of the constant skip
   * where the second string is inside the first starting from
   * the first character of the first string if it is not in a constant skip
   * the method returns -1
   * @parm String str1, str2
   * @return int 
   */
   public static int strStep(String str1, String str2)
   {
       // checking if str2 can be in str1 if yes we call the auxiliary method if not we return -1
       if(str1.length() < str2.length())
       {
           return -1;
       }
       return strStep(str1, str2, 1);
   }// end of method strStep
   // Auxiliary method
   public static int strStep(String str1, String str2, int step)
   {
       // checking if the step + the length greter then str1 length
       if( str2.length() + step > str1.length())
       {
           return -1;
       }
       // checking if the there is jump with the step if we call again to the method with the step + 1
       if(isJump(str1, str2, step))
       {
           return step;
       }
       return strStep(str1, str2, step + 1);
   }// end of method strStep
   /**
   * Ex2
   * A static method that accepts an array and returns the length of the
   * longest continuous subarray whose members are alternately positive
   * and negative numbers and prints the initial and final index of the
   * desired subarray
   * Time Complexity O(n) (n = size of the arr and we looping all the arr)
   * Space Complexity O(1) (because the amount of memory is fixed and does not depend on the size of the array)
   */

   public static int longestSubarray(int[] a)
   {
       int temp = a[0];
       int start = 0;
       int end = 0;
       int size = 1;
       // looping the arr
       for(int i = 1; i < a.length; i++)
       {
           // if we the value we check is greater then 0
           if(temp > 0)
           {
               // checking if the next index is less then zero and we not run to far on the index
               if(a[i] < 0 && i == end +1)
               {
                   size++;
                   temp = a[i];
                   end++;
               }
               // if the size is 1 and we not on the index of the end of arr
               else if( size == 1 &&  i != a.length - 1)
               {
                   start++;
                   temp = a[i];
                   end++;
               }
               // if we came to the end of the arr with size 1 so it mean we need to reset the start and end var
               else if(size == 1)
               {
                   start = 0;
                   end = 0;
               }
           }
           // if the value is less then 0
           else
           {
               // checking if the next index is greater then 0 and we not run to far on the index
               if(a[i] > 0 && i == end +1)
               {
                   size++;
                   temp = a[i];
                   end++;
               }
           }
       }
       System.out.println("Starting index = " + start + " Ending index = " + end);
       return size;
   }// end of method longestSubarray
   /** 
   * Ex3 
   * Section A - The method what will return 9 by the call BinaryTree.what(root)
   * Section B - the method what returns the amount of the Members in the
   * tree if the root is null so it return 0 and if it only one node it return 1
   * Section C - The method something will return false for the call BinaryTree.something(root);
   * Section D - the method return if all the members in the tree is
   * larger then 0 else it return false if the tree is empty it return true
   * Section E - the method return 4 by the call BinaryTree.sectet(root)
   * Section F - the method return the amount of members of the 
   * biggest sub-tree that all is members is greater then 0 if there
   * is none positive numbers in the tree it will return 0
   */
   
   /** 
   * Ex4
   * In this question there are 7 sections and you have
   * to write what will happen following the command
   * in each section if there is any error you must indicate
   * whether it is a compilation or running error and what is
   * the reason for the error
   * 
   * 1: what will happen with the call p1.compare(a);
   *  -> Poodle - negative
   * 2: what will happen with the call p1.compare(d2);
   * -> Poodle - Positive
   * 3: what will happen with the call d3.compare(p1);
   * -> Dog - No
   * 4: what will happen with the call d.compare(d4);
   * -> Poodle - Positive
   * 5: what will happen with the call d.compare(p1);
   * comparing poodle Dalmatian Poodle - Positive
   * 6: what will happen with the call ((Dog)p2).compare(p3);
   * -> comparing... Poodle - Positive
   * 7: what will happen with the call ((Dalmatian)d).compare(a);
   * -> Dalmatian Poodle-Negative
   */
   /**
   *Ex5
   *In this question there are API of the class Queue
   *and method what and we been asking question about them
   *Section A: if we call what method on the queue {1, 2, 3, 4, 5, 6} 
   * in -> [6, 5, 4, 3, 2, 1] -> out how the return q will be 
   * answer is: in -> [6, 3, 5, 2, 4, 1] -> out
   * Section B: after a call to what method the return q was
   * in -> [1, 5, 2, 6, 3, 7, 4, 8] and we been asking what is the q was
   * when it was given as a parameter to what method
   * answer is: in -> [1, 2, 3, 4, 5, 6, 7, 8] -> out
   * Section C: after a call to what method the return q was
   * in -> [0, 1, 1, 0, 0, 1] -> out and we been asking what is the q was
   * when it was given as a parameter to what method
   * answer is: in -> [0, 1, 0, 1, 0, 1] -> out
   * Section D: we need to show a queue with 4 members that if the method
   * what will act on him the program will crash with run time error and 
   * also we need to Bring an explanation for a run time error
   * the queue {10, 9, 8, 7, 6, 5, 4} will cause run time error
   * Explanation:
   * Because in the last loop we will try to access an empty member
   * in the queue and it will give an error because each of the inner
   * loops will run 3 times and insert 6 members into the second loop
   * and in the last loop they run as many members as the original queue 
   * which is 7 and that is why the error will occur
   */
}// end of class Exam2022aFebruary89
