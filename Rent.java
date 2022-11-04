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
  
  // Constructor for class Rent
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
  }
  // Constructor for class Rent
  public Rent(Rent other)
  {
      this._name = other._name;
      this._car = other._car;
      this._pickDate = other._pickDate;
      this._returnDate = other._returnDate;
  }
  // Method return the name of the renter
  public String getName()
  {
      return this._name;
  }
  // Method return the car of the renter
  public Car getCar()
  {
      return this._car;
  }
  // Method return the pick date of the renter
  public Date getPickDate()
  {
      return this._pickDate;
  }
  // Method return the return date of the renter
  public Date getReturnDate()
  {
      return this._returnDate;
  }
  // Method set the name of the renter
  public void SetName(String name)
  {
       this._name = name;
  }
  // Method set the car of the renter
  public void SetCar(Car car)
  {
       this._car = car;
  }
  // Method set the pick date of the renter
  public void SetPickDate(Date pickDate)
  {
       this._pickDate = pickDate;
  }
  // Method set the return date of the renter
  public void SetReturnDate(Date retuernDate)
  {
       this._returnDate = retuernDate;
  }
  // Method check if two Rent are equals
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
  }
  // Method return how much rent day left
  public int howManyDays(Rent other)
  {
       return this._pickDate.difference(other._returnDate);
  }
  // Method Calculates and returns the total price of the rental period
  public int getPrice()
  {
      double price = 0;
      int rentDays = this.howManyDays();
      int discount_weeks_num = rentDays / NUM_OF_DAYS_IN_WEEK;
      int num_without_discount = rentDays % NUM_OF_DAYS_IN_WEEK;
      char carType;
      for(int i = 0; i < discount_weeks_num; i++) 
      {
          if(this._car.getType() == 'A')
          {
              price = price + NUM_OF_DAYS_IN_WEEK * TYPE_A_PRICE;
              carType = 'A'
          }
          else if(this._car.getType() == 'B')
          {
              price = price + NUM_OF_DAYS_IN_WEEK * TYPE_B_PRICE;
              carType = 'B'
          }
          else if(this._car.getType() == 'C')
          {
              price = price + NUM_OF_DAYS_IN_WEEK * TYPE_C_PRICE;
              carType = 'C'
          }
          else if(this._car.getType() == 'D')
          {
              price = price + NUM_OF_DAYS_IN_WEEK * TYPE_D_PRICE;
              carType = 'D'
          }
          price = price * DISCOUNT; 
      }
      price = price + num_without_discount * carType;
      return price;
  }
  // Methed upgrade the car of the renter
  public int upgrade (Car newCar)
  {
      if(newCar.better(this._car)
      {
          priceCarBeforeUpgrade  = this._car.getPrice();
          _car = new Car(newCar);
          int price_increase = this._car.getPrice() - priceCarBeforeUpgrade;
      }
  }
  // Methed check if there overlap between two Rents
  public Rent overlap (Rent other)
  {
      
  }
  // Method returns the Rant data as a string
   public String toString()
  { 
      return "Name:" + this._name + " From:" + this._pickDate + " To:" + this._returnDate + " Type:" + this._car._type + " Days:" + this.howManyDays() + " Price:" + this.getPrice(); 
  }
}// end of class Rent
