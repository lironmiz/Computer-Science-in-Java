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
  
  // Constructor for class Rent
  public Rent(String name, Car car, Date pick, Date ret)
  {
      this._name = name;
      _car = car;
      _pickDate = pick;
      if(_pickDate.after(pick))
      {
          _returnDate = ret;
      }
      else
      {
          _returnDate = new Date(pick.getDay() + 1, pick.getMonth(), pick.getYear());
      } 
  }
  // Constructor for class Rent
  public Rent(Rent other)
  {
      _name = other._name;
      _car = other._car;
      _pickDate = other._pickDate;
      _returnDate = other._returnDate;
  }
  // Method return the name of the renter
  public String getName()
  {
      return _name;
  }
  // Method return the car of the renter
  public Car getCar()
  {
      return _car;
  }
  // Method return the pick date of the renter
  public Date getPickDate()
  {
      return _pickDate;
  }
  // Method return the return date of the renter
  public Date getReturnDate()
  {
      return _returnDate;
  }
  // Method set the name of the renter
  public void SetName(String name)
  {
       _name = name;
  }
  // Method set the car of the renter
  public void SetCar(Car car)
  {
       _car = car;
  }
  // Method set the pick date of the renter
  public void SetPickDate(Date pickDate)
  {
       _pickDate = pickDate;
  }
  // Method set the return date of the renter
  public void SetReturnDate(Date retuernDate)
  {
       _returnDate = retuernDate;
  }
  // Method check if two Rent are equals
  public boolean equals(Rent other)
  {
      boolean isEquals = true;
      if(this._name == other._name;
  }
}// end of class Rent
