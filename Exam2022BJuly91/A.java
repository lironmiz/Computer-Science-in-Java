
/**
* A.java
*/
public abstract class A
{
   protected int _x;
   
   public A()
   {
       _x = 1;
   }// end of method A
   
   public abstract int f(int x);
   
   public void f(A a)
   {
       _x = a._x;
   }// end of method f
}// end of abstract class A
