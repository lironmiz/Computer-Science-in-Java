/**
* Class Runner.java
* A main class for playing and checking the priority queue
*/
public class Runner
{
    public static void main(String[] args)
    {
       // create a priority queue object
       PriorityQueue queue = new PriorityQueue(10);
       // add data 
       queue.insert(10);
       queue.insert(55);
       queue.insert(40);
       queue.insert(5);
       queue.insert(-5);
       queue.insert(100);
       queue.insert(525);
       queue.insert(430);
       queue.insert(18);
       queue.insert(78);
       // -5 | 5 | 10 | 18 | 40 | 55 | 78 | 100 | 430 | 525
       // print the queue values
       queue.printPriorityQueue();
       // print if the queue is empty
       System.out.println("is queue empty? " + queue.isEmpty());
       // remove data
       queue.remove();
       queue.remove();
       // print the queue values
       queue.printPriorityQueue();
       // | 10 | 18 | 40 | 55 | 78 | 100 | 430 | 525 | 
    }// end of method main
}// end of class Runner
