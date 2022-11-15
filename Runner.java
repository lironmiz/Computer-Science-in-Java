/**
* Class Runner.java
* A main class for playing and checking the stack
*/
public class Runner
{
    public static void main(String[] args)
    {
        // making a stack object
        Stack stack = new Stack(5);
        // pushing elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        //   | 5 |
        //     -
        //   | 4 |
        //     -
        //   | 3 |
        //     -
        //   | 2 |
        //     -
        //   | 1 |
        //     _
        // poping out two elements of the stack
        stack.pop();
        stack.pop();
        //   | 3 |
        //     -
        //   | 2 |
        //     -
        //   | 1 |
        //     _
        // checking if the stack is empty or not
        if (stack.isEmpty())
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println("stack is not empty");
        }
    }// end of method main
}// end of class Runner
