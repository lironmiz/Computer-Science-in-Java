//*******************************************************
// Class Rent.java
// The class represent Rent
//*******************************************************
public class Rent
{
  private String _name;
  Car _car;
  Date _pickDate;
  Date _returnDate;
  
  // Constant in the class
  private static final int TYPE_A_PRICE = 1OO; 
  private static final int TYPE_B_PRICE = 150; 
  private static final int TYPE_C_PRICE = 18O; 
  private static final int TYPE_D_PRICE = 240; 
  private static final int NUM_OF_DAYS_IN_WEEK = 7; 
  private static final double DISCOUNT = 9/10; 
   
  /**
  * Constructor for class Rent
  * @param name of the renter, car of the renter of type Car, date of pick the car of type Date, date of return the car of type Date
  * @return None
  */
  public Rent(String name, Car car, Date pick, Date ret)
  {
      this._name = name;
      this._car = car;
      this._pickDate = pick;
      if(this._pickDate.after(pick))
      {
          this._returnDate = ret;
      }
      else
      {
          this._returnDate = new Date(pick.getDay() + 1, pick.getMonth(), pick.getYear());
      } 
  }// end of Rent method
  /**
  * Constructor for class Rent
  * @param other of type Rent
  * @return None
  */
  public Rent(Rent other)
  {
      this._name = other._name;
      this._car = other._car;
      this._pickDate = other._pickDate;
      this._returnDate = other._returnDate;
  }// end of Rent method
  /**
  * Method return the name of the renter
  * @param None
  * @return name of the renter
  */
  public String getName()
  {
      return this._name;
  }// end of getName method
  /**
  * Method return the car of the renter
  * @param None
  * @return car of the renter
  */
  public Car getCar()
  {
      return this._car;
  }// end of getCar method
  /**
  * Method return the date the renter pick the car
  * @param None
  * @return the date the renter pick the car
  */
  public Date getPickDate()
  {
      return this._pickDate;
  }// end of getPickDate method
  /**
  * Method return the date the renter need to return the car
  * @param None
  * @return the date the renter need to return the car
  */
  public Date getReturnDate()
  {
      return this._returnDate;
  }// end of getReturnDate method
  /**
  * Method set the name of the renter
  * @param name
  * @return None
  */
  public void setName(String name)
  {
       this._name = name;
  }// end of setname method
  /**
  * Method set the car of the renter
  * @param car
  * @return None
  */
  public void setCar(Car car)
  {
       this._car = car;
  }// end of setCar method
  /**
  * Method set the pick date of the renter
  * @param pickDate
  * @return None
  */
  public void setPickDate(Date pickDate)
  {
       this._pickDate = pickDate;
  }// end of setPickDate method
  /**
  * Method set the returen date of the renter
  * @param returnDate
  * @return None
  */
  public void SetReturnDate(Date retuernDate)
  {
       this._returnDate = retuernDate;
  }// end of SetReturnDate method
  /**
  * Method check if two Rent are equals
  * two rent are equals if the name, the pick and return date and the car is the same
  * @param other
  * @return true if the rents is equals else return false
  */
  public boolean equals(Rent other)
  {
      if(this._name == other._name && this._pickDate.equals(other._pickDate) && this._returnDate.equals(other._returnDate) && this._car.equals(other._car))
      {
          return true;
      }
      else
      {
          return false;
      }
  }// end of equals method
  /**
  * Method return how much rent day left
  * @param other
  * @return how much rent day left
  */
  public int howManyDays(Rent other)
  {
       return this._pickDate.difference(other._returnDate);
  }// end of howManyDays method
  /**
  * Method Calculates and returns the total price of the rental period
  * @param None
  * @return the total price of the rental period
  */
  public int getPrice()
  {
      int rentDays = howManyDays(this);
      int amountOfWeeksDiscount = rentDays / NUM_OF_DAYS_IN_WEEK;
      int numDaysWithoutDiscount = rentDays % NUM_OF_DAYS_IN_WEEK;
      // Price calculation according to the type of car
      if(this._car.getType() == 'A')
      {
          return (int) (( NUM_OF_DAYS_IN_WEEK * amountOfWeeksDiscount * TYPE_A_PRICE ) * (DISCOUNT) + ( numDaysWithoutDiscount * TYPE_A_PRICE));
      }
      else if(this._car.getType() == 'B')
      {
           return (int) (( NUM_OF_DAYS_IN_WEEK * amountOfWeeksDiscount * TYPE_B_PRICE ) * (DISCOUNT) + ( numDaysWithoutDiscount * TYPE_B_PRICE));
      }
      else if(this._car.getType() == 'C')
      {
         return (int) (( NUM_OF_DAYS_IN_WEEK * amountOfWeeksDiscount * TYPE_C_PRICE ) * (DISCOUNT) + ( numDaysWithoutDiscount * TYPE_C_PRICE));
      }
      return  (int) (( NUM_OF_DAYS_IN_WEEK * amountOfWeeksDiscount * TYPE_D_PRICE ) * ( DISCOUNT) + ( numDaysWithoutDiscount * TYPE_D_PRICE));
  }// end of getPrice method
  /**
  * Methed upgrade the car of the renter
  * @param newCar to upgrade
  * @return the total price of the rental period
  */
  public int upgrade (Car newCar)
  {
      if(newCar.better(this._car))
      {
          priceCarBeforeUpgrade  = this.getPrice();
          _car = new Car(newCar);
          int price_increase = this.getPrice() - priceCarBeforeUpgrade;
      }
  }// end of upgrade method
  /**
  * Methed check if there overlap between two Rents
  * @param other
  * @return 
  */
  public Rent overlap (Rent other)
  {
    Date pickDate = this._pickDate;
    Date returnDate = this._returnDate;
    Date otherPickDate = other._pickDate;
    Date otherReturnDate = other._returnDate;
    // Chcking if the name isn't the same or the cars isn't the same
    if (!this._name.equals(other._name) || !this._car.equals(other._car))
    {
      return null;
    }
    // Checking if there are intersection in dates
    if (pickDate.after(otherReturnDate) || returnDate.before(otherPickDate))
    {
      return null;
    }
    // Checking if there same dates
    if (pickDate.before(otherPickDate) && returnDate.after(otherReturnDate))
    {
      return this;
    }
    else if (pickDate.equals(otherPickDate) && returnDate.equals(otherReturnDate))
    {
      return this;
    }
    // Checking if same pickDates and other returnDates
    if(pickDate.before(otherPickDate) && returnDate.after(otherPickDate) && returnDate.before(otherReturnDate))
    {
      return new Rent (this._name, this._car, pickDate, otherReturnDate);
    }
    else if (pickDate.equals(otherPickDate) && returnDate.before(otherReturnDate))
    {
       return new Rent (this._name, this._car, pickDate, otherReturnDate);
    }
    else if (returnDate.equals(otherPickDate))
    {
       return new Rent (this._name, this._car, pickDate, otherReturnDate);
    }
    // returns other pickDate and amse returnDate
    if(pickDate.after(otherPickDate) && pickDate.before(other.returnDate) && returnDate.after(otherReturnDate))
    {
      return new Rent (this._name, this._car, otherPickDate, returnDate);
    }
    else if (pickDate.equals(otherPickDate) && returnDate.after(otherReturnDate))
    {
       return new Rent (this._name, this._car, otherPickDate, returnDate);
    }
    else if (pickDate.equals(other._returnDate))
    {
       return new Rent (this._name, this._car, otherPickDate, returnDate);
    }
    // returns other pickDate and other returnDate
    return new Rent (this._name, this._car, otherPickDate, otherReturnDate);
  }// end of overlap method
  /**
  * Method returns the Rant data as a string
  * @param None
  * @return string of the rant data
  */
   public String toString()
  { 
      return "Name:" + this._name + " From:" + this._pickDate + " To:" + this._returnDate + " Type:" + this._car._type + " Days:" + howManyDays(this) + " Price:" + this.getPrice(); 
  }// end of toString method
}// end of class Rent
