/**
 * Traveler.java
 * The class reprsents a Traveler
 * Author liron mizrahi
 */
public class Traveler
{
    Passport _passport;
    boolean _isPayed;
    /**
     * constructor of the class Traveler 
     * @param  Passport passport, boolean isPayed
     * @return: None
     */       
    public Traveler(Passport passport,  boolean isPayed)
    {
        _passport = new Passport(passport);
        _isPayed = isPayed;
    }// end of method Traveler 
    /**
    * return true if the travels passport is valid and he payed the trip otherwise the method return false
    * @param  Date travelDate
    * @return: boolean
    */    
    public boolean checkTravel(Date travelDate)
    {
        return  (isPayed() && _passport.isValid(travelDate));
    }// end of method checkTravel
    /** 
     * returns true if the traveler has already paid for the trip
     * @param: None
     * @return boolean
     */  
    public boolean isPayed()
    {
        return _isPayed;
    }// end of method isPayed
    /** 
     * Pay for the trip 
     * @param: None
     * @return None
     */      
    public void pay()
    {
        _isPayed = true;
    }// end of method pay
    /**
     * method return string that represents Traveler data
     * @param: None
     * @return: String
     */
    public String toString()
    {
        return _passport.toString();
    }// end of method toString
}// end of class Passport
