public class ClassA
{
    public ClassA()
    {
        f();
    }// end of method ClassA
    
    public void f()
    {
        System.out.println("Class a");
    }// end of method f
    
    public static void main(String[] args)
    {
        new ClassB();
    }// end of method main
}// end of class ClassA
