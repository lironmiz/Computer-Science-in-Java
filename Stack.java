/**
* Class Stack.java
* A class that represents an implementation of a Stack using arr
*/
public class Stack
{
    private int _arr[];
    private int _top;
    private int _capacity;
    /**
    * constructor of the class
    * @param int
    * @return None
    */
    public Stack(int size)
    {
        _arr = new int[size];
        _capacity = size;
        _top = -1;
    }// end of method Stack
    /**
    * method to add an element to the stack
    * @param int
    * @return None
    */
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow");
            System.exit(-1);
        }
        System.out.println("Inserting " + x);
        _arr[++_top] = x;
    }// end of method push
    /**
    * method to pop an element from the stack
    * @param int
    * @return None
    */
    public int pop()
    {
        // check if the stack is empty
        if (isEmpty())
        {
            System.out.println("underflow");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        return _arr[_top--];
    }// end of method pop 
    /**
    * method to return the top element of the stack
    * @param None
    * @return int
    */
    public int peek()
    {
        if(!isEmpty())
        {
            return _arr[_top];
        }
        else
        {
            System.exit(-1);
        }
        return -1;
    }// end of method peek
    /**
    * method return if the stack is empty or not
    * @param None
    * @return int
    */
    public int size()
    {
        return _top + 1;
    }// end of size method
    /**
    * method return if the stack is empty or not
    * @param None
    * @return int
    */
    public boolean isEmpty()
    {
        return _top == -1;
    }// end of method isEmpty
    /**
    * method return if the stack is full or not
    * @param None
    * @return int
    */
    public boolean isFull()
    {
        return _top == _capacity - 1;
    }// end of method isFull
}// end of class Stack
