
//*******************************************************
// Class Entry.java
// A class that represents an implementation of a hase table in java
// Author: liron mizrahi
//*******************************************************
public class HashTableArray<T>
{
   Entry[] _hashArray;
   int _size;
   /**
   * constructor of the class
   * @param int
   * @return None
   */
   public void HaseTableArray( int size)
   {
       _size = size;
       _hashArray = new Entry[size];
       for(int i=0; i<size; i++)
       {
           _hashArray[i] = new Entry();
       }
   }// end of method HaseTableArray
   /**
   * method to get hase value
   * @param int
   * @return int
   */
   public int GetHash(int key)
   {
       return key % _size;
   }// end of method GetHash
   /**
   * method to put key value in hase table
   * @param int, Object
   * @return None
   */
   public void put(int key, Object value)
   {
       int hashIndex = GetHash(key);
       Entry arrayValue = _hashArray[hashIndex];
       Entry newItem = new Entry(key, arrayValue);
       newItem._next = arrayValue._next;
       arrayValue._next = newItem;
   }// end of method put
   /**
   * method to return value in the hase table by the key
   * @param int
   * @return T
   */
   public T get(int key)
   {
       T value = null;
       int hashIndex = GetHash(key);
       Entry arrayValue = _hashArray[hashIndex];
       while(arrayValue != null)
       {
           if (arrayValue.GetKey() == key)
           {
               value = (T) arrayValue.GetValue();
               break;
           }
           arrayValue = arrayValue._next;
       }
       return value;
   }// end of method get
}// end of class HashTableArray
