
/**
 * A.java
 */
public class A
{
   private int _num;
   
   public A(int num)
   {
       _num = num;
   }// end of method A
   
   public int getNum()
   {
       return _num;
   }// end of method getNum
   
   public void setNum(int num)
   {
       _num = num;
   }// end of method setNum
   
   public int f(A a)
   {
       System.out.print("in A ");
       _num = a._num;
       return _num;
   }// end of method f
}// end of class A
