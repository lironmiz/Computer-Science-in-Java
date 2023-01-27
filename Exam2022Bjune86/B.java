//*******************************************************
// B.java
// the class reprsents B
// Author: liron mizrahi
//*******************************************************
public class B extends A
{
   public B(int n)
   {
       super (n);
   }// end of method B
   
   public int f(B b)
   {
       System.out.print ("in B ");
       setNum(b.getNum() * 2);
       return getNum();
   }// end of method f
}// end of class B
