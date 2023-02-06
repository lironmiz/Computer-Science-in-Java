/**
 * Passport.java
 * The class reprsents a Passport
 * Author liron mizrahi
 */
public class Passport
{
    String _name;
    int _number;
    Date _expiryDate;

    /**
     * constructor of the class Passport
     * @param  String name, int number, Date expiryDate
     * @return: None
     */
    public Passport(String name, int number, Date expiryDate)
    {
        _name = new String(name);
        _number = number;
        _expiryDate = new Date(expiryDate);  
    }// end of method Passport
    /**
     * Copy Constructor of the class Passport
     * @param Passport other
     * @return: None
     */
    public Passport(Passport other)
    {
        _name = new String(other._name);
        _number = other._number;
        _expiryDate = new Date(other._expiryDate);        
    }// end of method passport
    /**
     * method return the name 
     * @param None
     * @return: String
     */        
    public String getName()
    {
        return new String (_name);
    }// end of method getName 
    /**
     * method return the Date
     * @param None
     * @return: Date 
     */
    public Date getExpiryDate()
    {
        return new Date (_expiryDate);
    }// end of method Date 
    /**
     * method set the name 
     * @param nameToSet
     * @return: None
     */
    public void setName(String nameToSet)
    {
        _name = new String(nameToSet);
    }// end of method setName 
    /**
     * method set the expirydate
     * @param Date newExpDate
     * @return: None
     */
    public void setExpiryDate(Date newExpDate)
    {
        _expiryDate =  new Date (newExpDate);
    }// end of method setExpiryDate
     /**
     * method return true if the date is valid 
     * @param Date dateChecked
     * @return: boolean
     */
    public boolean isValid(Date dateChecked)
    {
        if ((_expiryDate.getDay() == dateChecked.getDay()) &&(_expiryDate.getMonth() == dateChecked.getMonth()) && _expiryDate.getYear() == dateChecked.getYear())
        {
            return true;
        }
        else
        {
            return dateChecked.before(getExpiryDate());
        }
    }// end of method isValid
    /**
     * method return string that represents Passport data
     * @param: None
     * @return: String
     */
    public String toString()
    {
        return "Name: " + _name + "\n"  + "Pass. num: " + _number + "\n" + "Exp date: " + _expiryDate;
    }// end of method toString
}// end of class Passport 
