public class Ex13Driver
{
   public static void main(String[] args)
   {
       System.out.println("********** Ex13 class tester **********");
       System.out.println("-------- author: Liron mizrahi ---------\n");

       System.out.println("1. Ex1 alternating method test:\n");
       Ex13 classObject = new Ex13();
       
       int test1 = classObject.alternating("10");
       if(test1 == 0)
       {
           System.out.println("pass test 1 the string was 10 expected: 0 result was: " + test1);
       }
       else
       {
           System.out.println("falled test 1 the string was 10 expected: 0 result was: " + test1);
       }
       int test2 = classObject.alternating("01");
       if(test2 == 0)
       {
           System.out.println("pass test 2 the string was 01 expected: 0 result was: " + test2);
       }
       else
       {
           System.out.println("falled test 2 the string was 01 expected: 0 result was: " + test2);
       }
       int test3 = classObject.alternating("1100");
       if(test3 == 1)
       {
           System.out.println("pass test 3 the string was 1100 expected: 1 result was: " + test3);
       }
       else
       {
           System.out.println("falled test 3 the string was 1100 expected: 1 result was: " + test3);
       }
       int test4 = classObject.alternating("0011");
       if(test4 == 1)
       {
           System.out.println("pass test 4 the string was 0011 expected: 1 result was: " + test4);
       }
       else
       {
           System.out.println("pass test 4 the string was 0011 expected: 1 result was: " + test4);
       }
       int test5 = classObject.alternating("1010");
       if(test5 == 0)
       {
           System.out.println("pass test 5 the string was 1010 expected: 0 result was: " + test5);
       }
       else
       {
           System.out.println("falled test 5 the string was 1010 expected: 0 result was: " + test5);
       }
       int test6 = classObject.alternating("0101");
       if(test6 == 0)
       {
           System.out.println("pass test 6 the string was 0101 expected: 0 result was: " + test6);
       }
       else
       {
           System.out.println("falled test 6 the string was 0101 expected: 0 result was: " + test6);
       }
       int test7 = classObject.alternating("111000");
       if(test7 == 1)
       {
           System.out.println("pass test 7 the string was 111000 expected: 1 result was: " + test7);
       }
       else
       {
           System.out.println("falled test 7 the string was 111000 expected: 1 result was: " + test7);
       }
       int test8 = classObject.alternating("000111");
       if(test8 == 1)
       {
           System.out.println("pass test 8 the string was 000111 expected: 1 result was: " + test8);
       }
       else
       {
           System.out.println("falled test 8 the string was 000111 expected: 1 result was: " + test8);
       }
       int test9 = classObject.alternating("001101");
       if(test9 == 1)
       {
           System.out.println("pass test 9 the string was 001101 expected: 1 result was: " + test9);
       }
       else
       {
           System.out.println("falled test 9 the string was 001101 expected: 1 result was: " + test9);
       }
       int test10 = classObject.alternating("110010");
       if(test10 == 1)
       {
           System.out.println("pass test 10 the string was 110010 expected: 1 result was: " + test10);
       }
       else
       {
           System.out.println("falled test 10 the string was 110010 expected: 1 result was: " + test10);
       }
       int test11 = classObject.alternating("101100");
       if(test11 == 1)
       {
           System.out.println("pass test 11 the string was 101100 expected: 1 result was: " + test11);
       }
       else
       {
           System.out.println("falled test 11 the string was 101100 expected: 1 result was: " + test11);
       }
       int test12 = classObject.alternating("010011");
       if(test12 == 1)
       {
           System.out.println("pass test 12 the string was 010011 expected: 1 result was: " + test12);
       }
       else
       {
           System.out.println("falled test 12 the string was 010011 expected: 1 result was: " + test12);
       }
       int test13 = classObject.alternating("11110000");
       if(test13 == 2)
       {
           System.out.println("pass test 13 the string was 11110000 expected: 2 result was: " + test13);
       }
       else
       {
           System.out.println("falled test 13 the string was 11110000 expected: 2 result was: " + test13);
       }
       int test14 = classObject.alternating("00001111");
       if(test14 == 2)
       {
           System.out.println("pass test 14 the string was 00001111 expected: 2 result was: " + test14);
       }
       else
       {
           System.out.println("falled test 14 the string was 00001111 expected: 2 result was: " + test14);
       }
       int test15 = classObject.alternating("11001100");
       if(test15 == 2)
       {
           System.out.println("pass test 15 the string was 11001100 expected: 2 result was: " + test15);
       }
       else
       {
           System.out.println("falled test 15 the string was 11001100 expected: 2 result was: " + test15);
       }
       int test16 = classObject.alternating("00110011");
       if(test16 == 2)
       {
           System.out.println("pass test 16 the string was 00110011 expected: 2 result was: " + test16);
       }
       else
       {
           System.out.println("falled test 16 the string was 00110011 expected: 2 result was: " + test16);
       }
       int test17 = classObject.alternating("11100010");
       if(test17 == 1)
       {
           System.out.println("pass test 17 the string was 11100010 expected: 1 result was: " + test17);
       }
       else
       {
           System.out.println("falled test 17 the string was 11100010 expected: 1 result was: " + test17);
       }
       int test18 = classObject.alternating("11100001");
       if(test18 == 2)
       {
           System.out.println("pass test 18 the string was 11100001 expected: 2 result was: " + test18);
       }
       else
       {
           System.out.println("falled test 19 the string was 11100001 expected: 2 result was: " + test18);
       }
       int test19 = classObject.alternating("00011011");
       if(test19 == 2)
       {
           System.out.println("pass test 19 the string was 00011011 expected: 2 result was: " + test19);
       }
       else
       {
           System.out.println("falled test 19 the string was 00011011 expected: 2 result was: " + test19);
       }
       int test20 = classObject.alternating("00101011");
       if(test20 == 1)
       {
           System.out.println("pass test 20 the string was 00101011 expected: 1 result was: " + test20);
       }
       else
       {
           System.out.println("falled test 20 the string was 00101011 expected: 1 result was: " + test20);
       }
       int test21 = classObject.alternating("1111100000");
       if(test21 == 2)
       {
           System.out.println("pass test 21 the string was 1111100000 expected: 2 result was: " + test21);
       }
       else
       {
           System.out.println("falled test 21 the string was 1111100000 expected: 2 result was: " + test21);
       }
       int test22 = classObject.alternating("0000011111");
       if(test22 == 2)
       {
           System.out.println("pass test 22 the string was 0000011111 expected: 2 result was: " + test22);
       }
       else
       {
           System.out.println("falled test 22 the string was 0000011111 expected: 2 result was: " + test22);
       }
       int test23 = classObject.alternating("1100110010");
       if(test23 == 2)
       {
           System.out.println("pass test 23 the string was 1100110010 expected: 2 result was: " + test23);
       }
       else
       {
           System.out.println("falled test 23 the string was 1100110010 expected: 2 result was: " + test23);
       }
       int test24 = classObject.alternating("0011001101");
       if(test24 == 2)
       {
           System.out.println("pass test 24 the string was 0011001101 expected: 2 result was: " + test24);
       }
       else
       {
           System.out.println("falled test 24 the string was 0011001101 expected: 2 result was: " + test24);
       }
       int test25 = classObject.alternating("0001011110");
       if(test25 == 2)
       {
           System.out.println("pass test 25 the string was 0001011110 expected: 2 result was: " + test25);
       }
       else
       {
           System.out.println("falled test 25 the string was 0001011110 expected: 2 result was: " + test25);
       }
       int test26 = classObject.alternating("0000111110");
       if(test26 == 2)
       {
           System.out.println("pass test 26 the string was 0000111110 expected: 2 result was: " + test26);
       }
       else
       {
           System.out.println("falled test 26 the string was 0000111110 expected: 2 result was: " + test26);
       }
       int test27 = classObject.alternating("1110001110001100");
       if(test27 == 3)
       {
           System.out.println("pass test 27 the string was 1110001110001100 expected: 3 result was: " + test27);
       }
       else
       {
           System.out.println("falled test 27 the string was 1110001110001100 expected: 3 result was: " + test27);
       }
       int test28 = classObject.alternating("00000000001111111111");
       if(test28 == 5)
       {
           System.out.println("pass test 28 the string was 00000000001111111111 expected: 5 result was: " + test28);
       }
       else
       {
           System.out.println("falled test 28 the string was 00000000001111111111 expected: 5 result was: " + test28);
       }
       System.out.println(" ");
       System.out.println("2. Ex2 tester for maximumLengthOfSubArray:\n");
       int[] arr = new int[1];
       arr[0] = 6;
       int test29 = classObject.MaximumLengthOfSubArray(arr, 1);
       if(test29 == 1)
       {
           System.out.println("pass test 29 the arr is [6] expected: 1 result was: " + test29);
       }
       else
       {
           System.out.println("falled test 29 the arr is [6] expected: 1 result was: " + test29);
       }
       int[] arr1 = new int[2];
       arr1[0] = 4;
       arr1[1] = 10;
       int test30 = classObject.MaximumLengthOfSubArray(arr1, 2);
       if(test30 == 2)
       {
           System.out.println("pass test 30 the arr is [4][10]  expected: 2 result was: " + test30);
       }
       else
       {
           System.out.println("falled test 30 the the arr is [4][10] expected: 2 result was: " + test30);
       }
       int[] arr2 = new int[5];
       arr2[0] = 4;
       arr2[1] = 1;
       arr2[2] = 2;
       arr2[3] = 11;
       arr2[4] = 9;
       int test31 = classObject.MaximumLengthOfSubArray(arr2, 5);
       if(test31 == 4)
       {
           System.out.println("pass test 31 the arr is [4][1][2][11][9]  expected: 4 result was: " + test31);
       }
       else
       {
           System.out.println("falled test 31 the the arr is [4][1][2][11][9] expected: 4 result was: " + test31);
       }
       int[] arr3 = new int[6];
       arr3[0] = 1;
       arr3[1] = 2;
       arr3[2] = 2;
       arr3[3] = 2;
       arr3[4] = 2;
       arr3[5] = 2;
       int test32 = classObject.MaximumLengthOfSubArray(arr3, 6);
       if(test32 == 5)
       {
           System.out.println("pass test 32 the arr is [1][2][2][2][2][2] expected: 5 result was: " + test32);
       }
       else
       {
           System.out.println("falled test 32 the the arr is [1][2][2][2][2][2] expected: 5 result was: " + test32);
       }
       int[] arr4 = new int[4];
       arr4[0] = 15;
       arr4[1] = 2;
       arr4[2] = 7;
       arr4[3] = 4;
       int test33 = classObject.MaximumLengthOfSubArray(arr4, 4);
       if(test33 == 4)
       {
           System.out.println("pass test 33 the arr is [15][2][7][4] expected: 4 result was: " + test33);
       }
       else
       {
           System.out.println("falled test 33 the the arr is [15][2][7][4] expected: 4 result was: " + test33);
       }
       System.out.println(" ");
       System.out.println("3. Ex3 tester for isWay method :\n");
       boolean test34 = classObject.isWay(arr);
       if(test34)
       {
           System.out.println("pass test 34 the arr is [6]  expected: true result was: " + test34);
       }
       else
       {
           System.out.println("falled test 34 the the arr is [6] expected: true result was: " + test34);
       }
       boolean test35 = classObject.isWay(arr1);
       if(test35)
       {
           System.out.println("falled test 35 the arr is [4][10]  expected: false result was: " + test35);
       }
       else
       {
           System.out.println("pass test 35 the the arr is [4][10] expected: false result was: " + test35);
       }
       boolean test36 = classObject.isWay(arr2);
       if(test36)
       {
           System.out.println("pass test 36 the arr is [4][1][2][11][9]  expected: true result was: " + test36);
       }
       else
       {
           System.out.println("falled test 36 the the arr is [4][1][2][11][9] expected: true result was: " + test36);
       }
       boolean test37 = classObject.isWay(arr3);
       if(test37)
       {
           System.out.println("pass test 37 the arr is [1][2][2][2][2][2] expected: true result was: " + test37);
       }
       else
       {
           System.out.println("falled test 37 the the arr is [1][2][2][2][2][2] expected: true result was: " + test37);
       }
       boolean test38 = classObject.isWay(arr4);
       if(test38)
       {
           System.out.println("falled test 38 the arr is [15][2][7][4] expected: false result was: " + test38);
       }
       else
       {
           System.out.println("pass test 38 the the arr is [15][2][7][4] expected: false result was: " + test38);
       }
       System.out.println(" ");
       System.out.println("4. Ex4 tester for prince method :\n");
       int [][] twoDArr = new int[5][5];
       twoDArr[0][0] = 2;
       twoDArr[0][1] = 0;
       twoDArr[0][2] = 1;
       twoDArr[0][3] = 2;
       twoDArr[0][4] = 3;
       twoDArr[1][0] = 2;
       twoDArr[1][1] = 3;
       twoDArr[1][2] = 5;
       twoDArr[1][3] = 5;
       twoDArr[1][4] = 4;
       twoDArr[2][0] = 8;
       twoDArr[2][1] = -1;
       twoDArr[2][2] = 6;
       twoDArr[2][3] = 8;
       twoDArr[2][4] = 7;
       twoDArr[3][0] = 3;
       twoDArr[3][1] = 4;
       twoDArr[3][2] = 7;
       twoDArr[3][3] = 2;
       twoDArr[3][4] = 4;
       twoDArr[4][0] = 2;
       twoDArr[4][1] = 4;
       twoDArr[4][2] = 3;
       twoDArr[4][3] = 1;
       twoDArr[4][4] = 2;
       System.out.println(" ---- the 2-dimensional array ----");
       System.out.println(" start at (0, 0) ");
       System.out.println("-----------");
       System.out.println("|2||0|1|2|3|");
       System.out.println("------------");
       System.out.println("|2||3|5|5|4|");
       System.out.println("------------");
       System.out.println("|8||-1|6|8|7|");
       System.out.println("------------");
       System.out.println("|3||4|7|2|4|");
       System.out.println("------------");
       System.out.println("|2||4|3|1|2|");
       System.out.println("------------");
       int test39 = classObject.prince(twoDArr, 0, 0);
       if(test39 == 4)
       {
           System.out.println("pass test 39  expected: 4 result was: " + test39);
       }
       else
       {
           System.out.println("falled test 39 expected: 4 result was: " + test39);
       }
       int [][] twoDArr1 = new int[5][5];
       twoDArr1[0][0] = 2;
       twoDArr1[0][1] = 0;
       twoDArr1[0][2] = 1;
       twoDArr1[0][3] = 2;
       twoDArr1[0][4] = 3;
       twoDArr1[1][0] = 2;
       twoDArr1[1][1] = 3;
       twoDArr1[1][2] = 5;
       twoDArr1[1][3] = 5;
       twoDArr1[1][4] = 4;
       twoDArr1[2][0] = 8;
       twoDArr1[2][1] = -1;
       twoDArr1[2][2] = 6;
       twoDArr1[2][3] = 8;
       twoDArr1[2][4] = 7;
       twoDArr1[3][0] = 3;
       twoDArr1[3][1] = 4;
       twoDArr1[3][2] = 7;
       twoDArr1[3][3] = 2;
       twoDArr1[3][4] = 4;
       twoDArr1[4][0] = 2;
       twoDArr1[4][1] = 4;
       twoDArr1[4][2] = 3;
       twoDArr1[4][3] = 1;
       twoDArr1[4][4] = 2;
       System.out.println(" ---- the 2-dimensional array ----");
       System.out.println(" start at (1, 1) ");
       System.out.println("------------");
       System.out.println("|5||3|2|7|13|");
       System.out.println("------------");
       System.out.println("|-1||0|3|6|8|");
       System.out.println("------------");
       System.out.println("|3||4|4|1|2|");
       System.out.println("------------");
       System.out.println("|7||3|2|1|7|");
       System.out.println("------------");
       System.out.println("|1||6|3|7|2|");
       System.out.println("------------");
       int test40 = classObject.prince(twoDArr1, 1, 1);
       if(test40 == 2)
       {
           System.out.println("pass test 40  expected: 2 result was: " + test40);
       }
       else
       {
           System.out.println("falled test 40 expected: 2 result was: " + test40);
       } 
       
       System.out.println("\n********** End of tester **********\n");
   }
}
