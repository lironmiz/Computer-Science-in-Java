/**
* Class Runner.java
* A main class for playing and checking the linked list
*/
public class Runner
{
    public static void main(String[] args)
    {
        // creating linked list
        LinkedList list = new LinkedList();
        // insert values to the linked list
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insert(2);
        // linked list: (head)18 -> 45 -> 12 -> 2
        // print the linked list
        list.show();
        // print the size of the linked list
        System.out.println("the size: " + list.length());
        // print the first item in the linked list
        System.out.println("the first: " + list.getFirst()); 
        // print the last item in the linked list 
        System.out.println("the last: " + list.getLast());
        // print the sum of items in linked list
        System.out.println("sum: " +  sumListRecursion(list.head));
        // print the sum of items in linked list
        System.out.println("sum1: " +  sumListIterative(list.head));
        // print if 17 is on the linked list
        System.out.println("is 17 is on the list? " + linkedListFindIterative(list.head, 17));
        // print if 2 is on the linked list
        System.out.println("is 2 is on the list? " + linkedListFindRecursion(list.head, 2));
        // print the value in index 2 in the linked list
        System.out.println("the value in index 2 is: " + getNodeValueIterative(list.head, 2));
        // print the value in index 2 in the linked list
        System.out.println("the value in index 12 is: " + getNodeValueRecursion(list.head, 12));
    }// end of method main
    /**
    * linkedListValues Iterative approach method will insert the values of the linked list to arr
    * Time complexity n = number of nodes O(n)
    * Space complexity O(n)
    * @param Node (head)
    * @return None
    */
    public static int[] linkedListValues(LinkedList list)
    {
        Node curr = list.head;
        int index = 0;
        int[] arr = new int[list.length()];
        // looping the linked list
        while(curr != null)
        {
            arr[index] = curr._data;
            curr = curr._next;
            index++;
        }
        return arr;
    }// end of method linkedListValues
    /**
    * sumList Recursion approach method will return the sum of all the values in the linked list
    * Time complexity n = number of nodes O(n)
    * Space complexity O(n)
    * @param Node (head)
    * @return int
    */
    public static int sumListRecursion(Node head)
    {
        if (head == null)
        {
            return 0;
        }
        return head._data + sumListRecursion(head._next);
    }// end of method sumListRecursion
    /**
    * sumList Iterative approach method will return the sum of all the values in the linked list
    * Time complexity n = number of nodes O(n)
    * Space complexity O(1)
    * @param Node (head)
    * @return int
    */
    public static int sumListIterative(Node head)
    {
        int sum = 0;
        Node curr = head;
        // looping the linked list
        while(curr != null)
        {
            sum += curr._data;
            curr = curr._next;
        }
        return sum;
    }// end of method  sumListIterative
    /**
    * linkedListFindIterative Iterative approach method will return true if the target is in the linked list and false if don't
    * Time complexity n = number of nodes O(n)
    * Space complexity O(1)
    * @param Node (head), int (target)
    * @return boolean
    */
    public static boolean linkedListFindIterative(Node head, int target)
    {
        Node curr = head;
        // looping the linked list
        while(curr != null)
        {
            // checking if the data is equal the target
            if(curr._data == target)
            {
                return true;
            }
            // assign curr to the next node
            curr = curr._next;
        }
        // if we didnt found the number in all the node we return false
        return false;
    }// end of method linkedListFindIterative
    /**
    * linkedListFindRecursion Recursion approach method will return true if the target is in the linked list and false if don't
    * Time complexity n = number of nodes O(n)
    * Space complexity O(n) (call stack is depend on the input)
    * @param Node (head), int (target)
    * @return boolean
    */
    public static boolean linkedListFindRecursion(Node head, int target)
    {
        if(head == null)
        {
            return false;
        }
        if(head._data == target)
        {
            return true;
        }
        return linkedListFindRecursion(head._next, target);
    }// end of method linkedListFindRecursion
    /**
    * getNodeValueIterative Iterative approach method will return the number in the index given as parameter
    * Time complexity n = number of nodes O(n)
    * Space complexity O(1)
    * @param Node (head), int (index)
    * @return int
    */
    public static int getNodeValueIterative(Node head, int index)
    {
        int number = index;
         // looping the linked list
        while(head != null)
        {
            if (number == 0)
            {
                return head._data;
            }
            number = number - 1;
            head = head._next;
        }
        // if the index don't right we return the min value of int
        return Integer.MIN_VALUE;
    }// end of method getNodeValueIterative
    /**
    * getNodeValueRecursion Recursion approach method will return the number in the index given as parameter
    * Time complexity n = number of nodes O(n)
    * Space complexity O(n)
    * @param Node (head), int (index)
    * @return int
    */
    public static int getNodeValueRecursion(Node head, int index)
    {
         if (head == null)
         {
             return Integer.MIN_VALUE;
         }
         if(index == 0)
         {
             return head._data;
         }
         return getNodeValueRecursion(head._next, index - 1);
    }// end of method getNodeValueRecursion
    /**
    * reverseListIterative Iterativ approach method will reverse the linked list
    * Time complexity n = number of nodes O(n)
    * Space complexity O(1)
    * @param Node (head)
    * @return Node
    */
    public static Node reversListIterativ(Node head)
    {
        Node prev = null;
        Node curr = head;
        // looping the linked list
        while(curr != null)
        {
            Node next = curr._next;
            curr._next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }// end of method reversListIterativ
    /**
    * reverseListRecursion Recursion method will reverse the linked list
    * Time complexity n = number of nodes O(n)
    * Space complexity O(n)
    * @param Node (head)
    * @return Node
    */
    public static Node reversListRecursion(Node head)
    {
        if(head._next == null)
        {
            return head;
        }
        Node ret = reversListRecursion(head._next);
        head._next._next = head;
        head._next = null;
        return ret;
    } // end of method reversListRecursion
    /**
    * zipperListsIterative Iterativ approach method will zipper the two lists
    * Time complefxity n = number of nodes of list 1 m = number of nodes of list 2 -> O(min(n,m))
    * Space complexity O(1)
    * @param Node (head)
    * @return Node
    */
    public static Node zipperListsIterative (Node head1, Node head2)
    {
        Node tall = head1;
        Node curr1 = head1._next;
        Node curr2 = head2;
        int count = 0;
        // looping the linked list
        while(curr1 != null && curr2 != null)
        {
            // checking if count is odd or even
            if (count % 2 ==0)
            {
                tall._next = curr2;
                curr2 = curr2._next;
            }
            else
            {
                tall._next = curr1;
                curr1 = curr1._next;
            }
            tall = tall._next;
            // checking if curr1 and curr2 is no null 
            if(curr1 != null)
            {
                tall._next = curr1;
            }
            if(curr2 != null)
            {
                tall._next = curr2;
            }
            count++;
        }
        return head1;
    }// end of method zipperListIterative
    /**
    * zipperListsRecursion Recursion approach method will zipper the two lists
    * Time complefxity n = number of nodes of list 1 m = number of nodes of list 2 -> O(min(n,m))
    * Space complexity O(n)
    * @param Node (head)
    * @return Node
    */
    public static Node zipperListsRecursion(Node head1, Node head2)
    {
        if (head1 == null && head2 == null)
        {
            return null;
        }
        if (head1 == null)
        {
            return head2;
        }
        if(head2 == null)
        {
            return head1;
        }
        Node next1 = head1._next;
        Node next2 = head2._next;
        head1._next = head2;
        head2._next = zipperListsRecursion(next1, next2);        
        return head1;
    }// end of method zipperListRecursion
}// end of class Runner
