
//*******************************************************
// PriorityQueue.java
// A class that represents an implementation of PriorityQueue in java
// Author: liron mizrahi
//*******************************************************
public class PriorityQueue
{
   private int _max;
   private int[] _arr;
   private int _length;
   /**
   * constructor of the class
   * @param int
   * @return None
   */
   public PriorityQueue(int max)
   {
       _max = max;
       _arr = new int[_max];
       _length = 0;
   }// end of method PriorityQueue
   /**
   * insert method will insert data to the priority queue
   * @param int
   * @return None
   */
   public void insert(int val)
   {
       int i;
       if (_length == 0)
       {
           _arr[0] = val;
           _length++;
           return;
       }
       for(i = _length - 1; i >= 0; i--)
       {
           if(val > _arr[i])
           {
               _arr[i + 1] = _arr[i];
           }
           else
           {
               break;
           }
       }
       _arr[i + 1] = val;
       _length++;
   }// end of method insert
   /**
   * printPriorityQueue method will print the values in the queue
   * @param None
   * @return None
   */
   public void printPriorityQueue()
   {
       for( int i = 0; i < _length; i++)
       {
           System.out.print(_arr[i] + " ");
       }
   }// end of method printPriorityQueue
   /**
   * remove method remove the last value in the queue
   * @param None
   * @return int
   */
   public int remove()
   {
       return _arr[--_length];
   }// end of method remove
   /**
   * isFull method return if the queue is full or not 
   * @param None
   * @return boolean
   */
   public boolean isFull()
   {
       return _length == _max;
   }// end of method isFull
   /**
   * isEmpty method return if the queue is empty or not 
   * @param None
   * @return boolean
   */
   public boolean isEmpty()
   {
       return _length == 0;
   }// end of method isEmpty
}// end of class PriorityQueue 
