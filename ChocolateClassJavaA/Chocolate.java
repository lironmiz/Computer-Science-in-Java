//*******************************************************
// Chocolate.java
// the class reprsents a a chocolate 
// Author: liron mizrahi
//*******************************************************
public class Chocolate
{
    private String _manufacturer;
    private int _cubes;
    private int _calories;
    private double _price;
    /**
     * constractor of the class Chocolate 
     * @param: String newManufacturer,int newCubes,int newCalories,double newPrice
     * @return: None
     */
    public Chocolate(String newManufacturer,int newCubes,int newCalories,double newPrice)
    {
        _manufacturer = newManufacturer;
        _cubes = newCubes;
        _calories = newCalories;
        _price = newPrice;
    }// end of method Chocolate 
    /**
     * copy constractor of the class Chocolate 
     * @param: Chocolate other 
     * @return: None
     */
    public Chocolate(Chocolate other)
    {
        _manufacturer = other._manufacturer;
        _cubes = other._cubes;
        _calories = other._calories;
        _price = other._price;
    }// end of method Chocolate 
    /**
     * method return the manufacturer
     * @param: None
     * @return: String 
     */
    public String getManufacturer()
    {
        return _manufacturer;
    }// end of method getManufacturer 
    /**
     * method the set the manufacturer 
     * @param: String manufacturerToSet
     * @return: None
     */
    public void setManufacturer(String manufacturerToSet)
    {
        _manufacturer = manufacturerToSet;
    }// end of method setManufacturer
    /**
     * method return the num of cubes 
     * @param: None
     * @return: int 
     */
    public int getCubes()
    {
        return _cubes;
    }// end of method getCubes 
    /**
     * method set the number of cubes 
     * @param: int cubesToSet
     * @return: None
     */
    public void setCubes(int cubesToSet)
    {
        _cubes = cubesToSet ;
    }// end of method setCubes
    /**
     * method return the num of calories 
     * @param: None
     * @return: int 
     */
    public int getCalories()
    {
        return _calories;
    }// end of method getCalories
    /**
     * method set the number of calories 
     * @param: int caloriesToSet
     * @return: None
     */
    public void setCalories(int caloriesToSet)
    {
        _calories = caloriesToSet;
    }// end of method setCalories 
    /**
     * method return the price of the chocolate  
     * @param: None
     * @return: int 
     */
    public double getPrice()
    {
        return _price;
    }// end of method getPrice 
    /**
     * method set the price of the chocolate  
     * @param: double priceToSet
     * @return: None 
     */
    public void setPrice(double priceToSet)
    {
        _price = priceToSet;
    }// end of method setPrice
    /**
     * Method return String that represents Chocolate 
     * @param None
     * @return String
     */
    public String toString() 
    {
        return "Chocolate [manufacturer=" + _manufacturer + ", cubes=" + _cubes + ", calories=" + _calories + ", price="+ _price + "]";
    }// end of method toString 
}// end of class Chocolate