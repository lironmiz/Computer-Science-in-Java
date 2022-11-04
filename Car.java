//*******************************************************
// Class Car.java
// The class represent car
//*******************************************************
public class Car
{
  private int _id;
  private char _type;
  private String _brand;
  private boolean _isManual;
  
  // Constant in the class
  private static final int DEFAULT_ID = 9999999; 
  private static final int ID_VALID_LENGTH = 7; 
  // Constructor for class Car
  public Car(int id, char type, String brand, boolean isManual)
  {
      // Checking if id is valid
      int lengthOfId = String.valueOf(id).length();
      if(lengthOfId == ID_VALID_LENGTH && id > 0)
      {
          _id = id;
      }
      else
      {
          _id =  DEFAULT_ID;
      }
      // Checking if type is valid
      if(type == 'A' || type == 'B' || type == 'C' || type == 'D')
      {
          _type = type;
      }
      else
      {
          _type = 'A';
      }
      _brand = brand;
      _isManual = isManual;
  }
  
  // Constructor for class Car
  public Car(Car other)
  {
      _id = other._id;
      _type = other._type;
      _brand = other._brand;
      _isManual = other._isManual;
  }
  // Method return the id of the car
  public int getId()
  {
      return _id;
  }
  // Method return the type of the car
  public char getType()
  {
      return _type;
  }
  // Method return the brand of the car
  public String getBrand()
  {
      return _brand;
  }
  // Method return if the car is manual
  public boolean isManual()
  {
      return _isManual;
  }
  // Method set the car id
  public void setId(int id)
  {
      int lengthOfId = String.valueOf(id).length();
      if(lengthOfId == ID_VALID_LENGTH && id > 0)
      {
          _id = id;
      }
      else
      {
          _id =  id;
      }
  }
  // Method set the car type
  public void setType(char type)
  {
      // Checking if type is valid
      if(type == 'A' || type == 'B' || type == 'C' || type == 'D')
      {
          _type = type;
      }
      else
      {
          _type = type;
      }
  }
  // Method set the car brand
  public void setBrand(String brand)
  {
      _brand = brand;
  }
  // Method set if the car is manual
  public void setIsManual(boolean manual)
  {
      _isManual = manual;
  }
  // Method returns the car data as a string
   public String toString()
  {
    return "id:" + _id + " type:" + _type + " brand:" + _brand + " gear:" + _isManual;
  }
  // Method checking if two car is equals
  public boolean equals (Car other)
  {
      boolean isCarEqual = true;
      if (_type == other._type && _brand == other._brand && Boolean.compare(_isManual, other._isManual) == 0)
      {
          return isCarEqual;
      }
      else
      {
          isCarEqual = false;
      }
      return isCarEqual;
  }
  // Method checking if car is better
  public boolean better (Car other)
  {
      boolean isCarBetter = true;
      if(Character.compare(_type, other._type) > 0)
      {
          return true;
      }
      else if(Character.compare(_type, other._type) == 0)
      {
          if(_isManual == true && _isManual == false)
          {
              return true;
          }
          else if(_isManual == true && _isManual == true)
          {
              return false;
          }
          else
          {
              return false;
          }
      }
      else
      {
          isCarBetter = false;
      }
      return isCarBetter;
  }
  // Method checking if car is worse
  public boolean worse (Car other)
  {
      return (!better(other));
  }
}// end of class Car
