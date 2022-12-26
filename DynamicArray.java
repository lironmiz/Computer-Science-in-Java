import java.util.Arrays;
/**
* Class DynamicArray.java
* A class that represents an implementation of DynamicArray in java
*/
public class DynamicArray<T>
{
   Object[] _data;
   int _size;
   
   /**
   * constructor of the class
   * @param None
   * @return None
   */
   public DynamicArray()
   {
        _size = 0;
        _data = new Object[1];
   }// end of method DynamicArray
   /**
   * getSize method return the size of the dynamic array
   * @param None
   * @return int
   */
   public int getSize()
   {
       return _size;
   }// end of method getSize
   /**
   * get method return the value of the arr in given index
   * @param int
   * @return T (generics)
   */
   public T get(int index)
   {
       return (T) _data[index];
   }// end of method get
   /**
   * put method insert a element to the arr
   * @param int
   * @return T (generics)
   */
   public void put(Object element)
   {
       ensureCapacity(_size + 1);
       _data[_size++] = element;
   }// end of method put
   /**
   * ensureCapacity method ensure the capacity is 
   * @param int
   * @return T (generics)
   */
   public void ensureCapacity(int minCapacity)
   {
       int oldCapacity = getSize();
       if( minCapacity > oldCapacity)
       {
           int newCapacity = oldCapacity * 2;
           if(newCapacity < minCapacity)
           {
               newCapacity = minCapacity;
           }
           _data = Arrays.copyOf(_data, newCapacity);
       }
   }// end of method ensureCapacity
}// end of class DynamicArray
