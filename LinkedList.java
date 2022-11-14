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
}
