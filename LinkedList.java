/**
* Class LinkedList.java
* A class that represents an implementation of linked list in java
*/
public class LinkedList
{
    Node head;
    /**
    * insert method will add a number to the end of the linked list
    * @param int (number)
    * @return None
    */
    public void insert(int data)
    {
        Node node = new Node();
        node._data = data;
        node._next = null;
        if (head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n._next != null)
            {
                n = n._next;
            }
            n._next = node; 
        }
    }// end of method insert
    /**
    * show method will print the data in the linked list
    * @param None
    * @return None
    */
    public void show()
    {
        Node node = head;
        while(node._next != null)
        {
            System.out.println(node._data);
            node = node._next;
        }
        System.out.println(node._data);
    }// end of method show
    /**
    * length method will return the size of linked list
    * @param None
    * @return int
    */
    public int length()
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp._next;
        }
        return count;
    }// end of method length
    /**
    * getFirst method will return the first number of the linked list
    * @param None
    * @return int
    */
    public int getFirst() 
    {
        if(this.length() == 0)
        {
            System.out.println("linked list is empty");
        }
        return head._data;
    }// end of method get first
    /**
    * getLast method will return the last number of the linked list
    * @param None
    * @return int
    */
    public int getLast()
    {
        if (this.length() == 0)
        {
            System.out.println("linkes list is empty");
        }
        Node curr = this.head;
        while(curr._next != null)
        {
           curr = curr._next; 
        }
        return curr._data;
    }// end of method getLast
}// end of class LinkedList
