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
          this._id = id;
      }
      else
      {
          this._id =  DEFAULT_ID;
      }
      // Checking if type is valid
      if(type == 'A' || type == 'B' || type == 'C' || type == 'D')
      {
          this._type = type;
      }
      else
      {
          this._type = 'A';
      }
      _brand = brand;
      _isManual = isManual;
  }
  
  // Constructor for class Car
  public Car(Car other)
  {
      this._id = other._id;
      this._type = other._type;
      this._brand = other._brand;
      this._isManual = other._isManual;
  }
  // Method return the id of the car
  public int getId()
  {
      return this._id;
  }
  // Method return the type of the car
  public char getType()
  {
      return this._type;
  }
  // Method return the brand of the car
  public String getBrand()
  {
      return this._brand;
  }
  // Method return if the car is manual
  public boolean isManual()
  {
      return this._isManual;
  }
  // Method set the car id
  public void setId(int id)
  {
      int lengthOfId = String.valueOf(id).length();
      if(lengthOfId == ID_VALID_LENGTH && id > 0)
      {
          this._id = id;
      }
      else
      {
          this._id = id;
      }
  }
  // Method set the car type
  public void setType(char type)
  {
      // Checking if type is valid
      if(type == 'A' || type == 'B' || type == 'C' || type == 'D')
      {
          this._type = type;
      }
      else
      {
          this._type = type;
      }
  }
  // Method set the car brand
  public void setBrand(String brand)
  {
      this._brand = brand;
  }
  // Method set if the car is manual
  public void setIsManual(boolean manual)
  {
      this._isManual = manual;
  }
  // Method returns the car data as a string
   public String toString()
  {
    return "id:" + this._id + " type:" + this._type + " brand:" + this._brand + " gear:" + this._isManual;
  }
  // Method checking if two car is equals
  public boolean equals (Car other)
  {
      boolean isCarEqual = true;
      if (this._type == other._type && this._brand == other._brand && Boolean.compare(this._isManual, other._isManual) == 0)
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
      if(Character.compare(this._type, other._type) > 0)
      {
          return true;
      }
      else if(Character.compare(this._type, other._type) == 0)
      {
          if(this._isManual == true && other._isManual == false)
          {
              return true;
          }
          else if(this._isManual == true && other._isManual == true)
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
