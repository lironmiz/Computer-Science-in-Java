/**
 * Bus.java
 * the class reprsents a Bus
 * Author: liron mizrhai
 */
public class Bus
{
   public static final int MAX_WHEELS_IN_BUS = 10;
   public Wheel[] _wheels = new Wheel[MAX_WHEELS_IN_BUS];
   public int _noOfWheels;
   /**
    * the method return true if wheel is added otherwise false 
    * @param: Wheel wh
    * @return: boolean 
    */
   public boolean addWheel(Wheel wh)
   {
       if(_wheels[MAX_WHEELS_IN_BUS - 1] instanceof Wheel)
       {
           return false;
       }
       int numOfWheels = howMuchWheels();
       int middleIndex = numOfWheels / 2;
       int finalIndex = numOfWheels - 1;
       for(int i = numOfWheels; i > middleIndex; i--)
       {
           _wheels[i] = _wheels[i - 1];
       }
       _wheels[middleIndex] = wh;
       return true;
   }// end of method addWheel
   /**
    * the method return the num of wheels in the array of wheels
    * @param: None
    * @return: int
    */
   private int howMuchWheels()
   {
       int count = 0;
       for(int i = 0; i < MAX_WHEELS_IN_BUS; i++)
       {
           if(_wheels[i] instanceof Wheel)
           {
               count++;
           }
       }
       return count;
   }// end of method howMuchWheel
   /**
    * the method return true if all the wheels is valid 
    * @param: None
    * @return: boolean
    */
   public boolean allVaild()
   {
       for(int i = 0; i < MAX_WHEELS_IN_BUS; i++)
       {
           if(_wheels[i] instanceof Wheel)
           {
               if(!_wheels[i].isValidCatNum(_wheels[i].getCatNum()))
               {
                  return false; 
               }
           }
       }
       return true;
   }// end of method allVaild
   /**
    * the method return true if the bus can drive 
    * @param: None
    * @return: boolean
    */
   public boolean canDrive()
   {
       int isEven = 0;
       boolean isCanDrive = true;
       for(int i = 0; i <  MAX_WHEELS_IN_BUS; i++)
       {
           Wheel wheel = _wheels[i];
           if( wheel instanceof Wheel)
           {
               isEven++;
               if(!(wheel.getIsOk() && wheel.isValidCatNum(wheel.getCatNum())))
               {
                   System.out.println(i);
                   isCanDrive = false;
               }
           }
       }
       return isCanDrive && isEven % 2 == 0;
   }// end of method canDrive 
}// end of class Bus
