
/**
* Class Queue.java
* A class that represents an implementation of a Queue in java
*/
public class Queue
{
  int[] _queue;
  int _size; // total number of elements in queue
  int _front;
  int _rear;
  /**
  * constractor of the class queue
  * @param int 
  * @return None
  */
  public Queue(int sizeOfArray)
  {
      _queue = new int[sizeOfArray];
      _rear = -1;
      _front = -1;
      _size = 0;
  }//end of method Queue
  /**
  * getSize get the size of the queue
  * @param None 
  * @return int
  */
  public int getSize()
  {
      return _size;
  }// end of method getSize
  /**
  * checking if the queue is empty
  * @param None
  * @return boolean
  */
  public boolean isEmpty()
  {
      boolean response = false;
      // if the size in 0 there the queue is empty
      if(_size == 0)
      {
         response = true;
      }
      return response;
  }//end of method isEmpty
  /**
  * enQueue method is insert value to queue
  * @param int 
  * @return boolean
  */
  public boolean enQueue(int element)
  {
      boolean response = false;
      // checking if the rear is not equeal the the final inded
      if(_rear != _queue.length - 1)
      {  
          _rear++;
          _queue[_rear] = element;
          _size = _size + 1;
          response = true;
      }
      return response;
  }//end of method enQueue
  /**
  * dequeue method is removing value from queue
  * @param None
  * @return int
  */
  public int deQueue()
  {
      int response = 0;
      // checking if the queue is not empty
      if(_size != 0)
      {
          _front++;
          response = _queue[_front];
          _size--;
      }
      return response;
  }// end of method deQueue
  /**
  * show method is print the queue elements
  * @param None
  * @return None
  */
  public void show()
  {
      System.out.println("Elements: ");
      // loopint the queue elements and prints them
      for(int i = 0; i < _size; i++)
      {
          System.out.print(_queue[i] + " ");
      }
  }// end of method show
  /**
  * peek method is show the first element in queue
  * @param None
  * @return int
  */
  public int peek()
  {
      int response = 0;
      if(!isEmpty())
      {
          response = _queue[_front + 1];
      }
      return response;
  }
  /**
  * main method
  * @param args (array type java.lang)
  * @return None
  */
  public static void main(String[] args) 
  {
      // making queue object 
      Queue queue = new Queue(10); 
      // insert element to the queue
      System.out.println(queue.enQueue(1000)); // return true
      System.out.println(queue.enQueue(2000)); // retrun true
      System.out.println(queue.enQueue(500)); // return true
      System.out.println(queue.getSize()); // return 3
      System.out.println(queue.peek()); // return 1000
      queue.show(); // return 1000, 2000, 500
      queue.isEmpty(); //return false
      System.out.println(queue.deQueue() + " deleted from the list"); // return 1000 deleted from the list
  }// end of method main
}
