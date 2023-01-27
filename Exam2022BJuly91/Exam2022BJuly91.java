//*******************************************************
// Exam in July 2022B (91)
// Semester 2022B
// Solutions to the test
// Author: liron mizrahi
//*******************************************************
public class Exam2022BJuly91
{
   /**
   * Ex1 
   * static recursive method thet return the min pay that amir need to pay to go from first
   * station to the last and also the method print all the possible traces from the first to last station
   * in this format:
   * for example if the arr is [2][4][8][3][10][1][12][3][2]
   * @param int[] stations, int step1, int step2, int limit 
   * @return int
   */
   public static int cheapRt(int[] stations, int step1, int step2, int limit)
   {
        // bases cases 
        if(stations.length - 1 == 0)
        {
            System.out.print(0 + " =" + stations[0]);
            return stations[1];
        }
        else if(step1 >= stations.length && step2 >= stations.length)
        {
            return Integer.MAX_VALUE;
        }
        // call to the Aulliexsery method
        return cheapRt(stations, step1, step2, limit, 0, 0, " ");
   }// end of method cheapRt
   // Aulliexsery method 
   private static int cheapRt(int[] stations, int step1, int step2, int limit, int sum, int index,String str)
   {
        if(index > stations.length - 1 || limit < 0)
        {
            return Integer.MAX_VALUE;
        }
        if(index == stations.length - 1 && limit >= 0)
        {
            sum += stations[index];
            str += index + " ";
            System.out.println(str + "=" + sum);
            return sum;
        }
        int firstWay = cheapRt(stations, step1, step2, limit, sum + stations[index], index + step1,str + index + " ");
        int secondWay = cheapRt(stations, step1, step2, limit - 1, sum + stations[index], index + step2, str + index + " ");
        return Math.min(firstWay, secondWay);
   }// end of method cheapRt
   /**
   * Explanation of the code:
   * I used a recursive pattern of testing using a helper method
   * to keep track of the indexes and building the requested string when
   * I checked two conditions one condition if I went beyond the limits 
   * of the array or we used more than our quota for the second step when
   * in this situation I returned Integer.MAX_VALUE and in the second
   * condition I checked if I reached the end of the array I advanced the
   * amount Accordingly, I printed the requested strings while returning
   * the amount, when at the end of the method I return the minimum
   * number among all the options while using the loading
   */
   /**
   * Ex2
   * the method need to fine 3 numbers in the arr thet there product art the max product of 3 numbers in the arr
   * the method also need to print the 3 numbers 
   * for example:
   * arr -> [-4][1][-8][9][6]
   * the method will print -4 -8 9
   * and return -4*-8*9 = 288
   * @param int[] arr 
   * @return int
   * Time Complexity: O(n) n = len of the arr
   * Space Complexity O(1) the space is fixed and not dependent on the size of the arr 
   */
   public static int findTriplet(int[] arr)
   {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int n : arr)
        {
            if ( n > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if( n > max2)
            {
                max3 = max2;
                max2 = n;
            }
            else if( n > max3)
            {
                max3 = n;
            }
            if (n < 1)
            {
                min2 = min1;
                min1 = n;
            }
            else if( n < min2)
            {
                min2 = n;
            }
        }
        if( max1*max2*max3 > max1*min1*min2)
        {
            System.out.println(max1 + " " + max2 + " " + max3);
            return max1*max2*max3;
        }
        else 
        {
            System.out.println(max1 + " " + min1 + " " + min2);
            return max1*min1*min2;
        }
   }// end of methdo findTriplet
   /**
   * Explanation of the code:
   * we loop in the arr and fine the free largest
   * number and the two smallest and return the bigger product of the two options  
   */
   
   /**
   * Ex3
   * Section A: what f method will return after the call BinaryTree.f(root, 30)
   * Enswer : true
   * Section B: what f method do?
   * Enswer: the method return true if the tree is not empty and num exists in one of the nodes 
   * if not it will return false
   * Section C: what secret method will print after the call BinaryTree.secret(root, 25)
   * Enswer: the method will return 0
   * Section D: what will return what method after the call BinaryTree.what(root, 10)
   * Enswer: 50
   * Section E: what what method do?
   * Enswer: the what method return the sum of the Node that own of there sons is the same value as num
   * if there not like this or the tree is empty the method will return the value 0
   *
   */
   /**
   * Ex4 
   * Section A:
   * a = new B(m); // m type is int 
   * what will need to be the value of m that after the above line make the proporty of _x of a equal to 25?
   * Enswer: 24
   * Section B:
   * a = new B(3); // _x = 4
   * int k = a.f(a.f(6));
   * what the value of k will be after the above two lines?
   * Enswer: 14
   * Section C:
   * b = new D(5);
   * int k = b.f(b.f(4));
   * Enswer: 12
   * Section D:
   * a = new D(8); // 7
   * b = new B(6); // 7
   * b.f(a);
   * what will be the value _x of the object b after the above 3 lines
   * Enswer: 7
   * Section E:
   * D d = new D(m) m of type int
   * a = new D(2);
   * ((A)d).f(a);
   * what need to be the value of for _x after the above 3 lines wil be 5
   * Enswer 4
   * Ex5
   * Section A
   * if we call the secret method on the list = 8 -> 2 -> 5 -> 4 -> null
   * how the list will look like 
   * Enswer:
   * list = 4->5->2->8-> null
   * Section B
   * how need to look a list that if we will call the secret method upon we wil get the list
   * list = 7->7->7->7->null
   * Enswer: 7->7->7->7->null
   * Section C
   * if we will call the what method on the list
   * list = 4->5->->2->9->7->2->1->4-> null what value the method will give?
   * Enswer: false 
   * Section D:
   * what is the minimal changes that we need to do in list from Section c for if we call what method on this list if will print true
   * Enswer:
   * the 5 we will change to 1
   * the 9 we will change to 7
   * Section E:
   * if we will call to what method on list with odd numbers if she will do the same thing like we will call
   * to what method on even numbers? if no write why? and if yes give example
   * to a list with even len and example to a list with odd len and tell what is the diffrent between them.
   * Enswer:
   * Palindrome can be with even size and odd size the meaning of the method will not change!!.
   * 
   */
}// end of class Exam2022BJuly91
