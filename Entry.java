
//*******************************************************
// Class Entry.java
// Class that represents an implementation of a Entry for hase table in java
// Author: liron mizrahi
//*******************************************************
 public class Entry
{
    int _key;      
    Object _value;
    Entry _next;
    /**
    * constructor of the class
    * @param int
    * @return None
    */
    public Entry(int key, Object value)
    {
        _key = key;
        _value = value;

    }// end of method Entry
    public Entry()
    {
        _next = null;
    }// end of method entry
    /**
    * Method return the key 
    * @param None
    * @return int 
    */
    public int GetKey()
    {
        return _key;
    }// end of method KetKey
     /**
    * Method return the value 
    * @param None
    * @return Object 
    */
    public Object GetValue()
    {
        return _value;
    }// end of method GetValue
}// end of class Entry
