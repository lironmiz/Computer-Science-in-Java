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
  /**
  * Constructor for class Car
  * @param id of the car, type of the car, brand of the car, and isManual 
  * @return None
  */
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
  }// end of Car method
  
  /**
  * Constructor for class Car
  * @param id of the car, type of the car, brand of the car, and isManual 
  * @return None
  */
  public Car(Car other)
  {
      this._id = other._id;
      this._type = other._type;
      this._brand = other._brand;
      this._isManual = other._isManual;
  }// end of Car method
  /**
  * Method return the id of the car
  * @param None
  * @return the id of the car
  */
  public int getId()
  {
      return this._id;
  }// end of getId method
  /**
  * Method return the type of the car
  * @param None
  * @return the type of the car
  */
  public char getType()
  {
      return this._type;
  }// end of getType method
  /**
  * Method return the brand of the car
  * @param None
  * @return the brand of the car
  */
  public String getBrand()
  {
      return this._brand;
  }// end of getBrand method
  /**
  * Method return if the car is manual
  * @param None
  * @return if the car is manual
  */
  public boolean isManual()
  {
      return this._isManual;
  }// end of isManual method
  /**
  * Method set the car id
  * @param id of the car 
  * @return None
  */
  public void setId(int id)
  {
      int lengthOfId = String.valueOf(id).length();
      if(lengthOfId == ID_VALID_LENGTH && id > 0)
      {
          this._id = id;
      }
      this._id = id;
  }// end of setId method
  /**
  * Method set the car type
  * @param type of the car 
  * @return None
  */
  public void setType(char type)
  {
      // Checking if type is valid
      if(type == 'A' || type == 'B' || type == 'C' || type == 'D')
      {
          this._type = type;
      }
      this._type = type;
  }// end of setType method
  /**
  * Method set the car brand
  * @param brand of the car 
  * @return None
  */
  public void setBrand(String brand)
  {
      this._brand = brand;
  }// end of setBrand method
  /**
  * Method set if the car is manual
  * @param manual
  * @return None
  */
  public void setIsManual(boolean manual)
  {
      this._isManual = manual;
  }// end of setIsManual method
  /**
  * Method returns the car data as a string
  * @param None
  * @return string
  */
   public String toString()
  {
    if (this._isManual)
    {
      return "id:" + this._id + " type:" + this._type + " brand:" + this._brand + " gear: manual";
    }
    return "id:" + this._id + " type:" + this._type + " brand:" + this._brand + " gear: auto";
  }// end of toString method
  /**
  * Check if two cars are the same
  * Cars are considered the same if they have the same type, brand and gear
  * @param other the car to compare this car to 
  * @return true if the cars are the same, otherwise false 
  */
  public boolean equals (Car other)
  {
    return this._type == other._type && this._brand.equals(other._brand) && this._ismanual == other._isManual;
  }// end of equals method
  /**
  * Check if this car is better than the other car
  * A car is considered better than another car if its type is higher.
  * If both cars have same type, an automated car is better than a manual car. 
  * @param other the car to compare this car to 
  * @return true if the car is better than the other car, otherwise false 
  */
  public boolean better (Car other)
  {
      if (this._type > other._type)
      {
        return true;
      }
      else if ( this._type == other._type)
      {
        if (this._isManual == false && other.isManual () == true)
        {
          return true;
        }
      }
      return false;
  }// end of better method
  /**
  * Check if this car is worse than the other car
  * @param other the car to compare this car to 
  * @return true if the car is worse than the other car, otherwise false 
  */
  public boolean worse (Car other)
  {
      return (!better(other));
  }// end of worse method
}// end of class Car
