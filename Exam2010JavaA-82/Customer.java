
public class Customer
{
    private long _id;
    private String _firstName;
    private String _familyName;
    /**
     * constructor of the class Customer 
     * @param: long id, String first, String family 
     * @return: None
     */
    public Customer(long id, String first, String family)
    {
        _id = id;
        _firstName = first;
        _familyName = family;
    }// end of method 
    /**
     * copy constructor of the class Customer 
     * @param: Customer other 
     * @return: None
     */
    public Customer(Customer other)
    {
        _id = other._id;
        _firstName = other._firstName;
        _familyName = other._familyName;
    }// end of method customer 
    /**
     * method return customer id 
     * @param: None
     * @return: long 
     */
    public long getId()
    {
        return _id;
    }// end of method getId
    /**
     * method return customer first name 
     * @param: None
     * @return: String 
     */
    public String getFirstName()
    {
        return new String(_firstName);
    }// end of method getFirstName 
    /**
     * method return customer family name 
     * @param: None
     * @return: String 
     */
    public String getFamilyName()
    {
        return new String(_familyName);
    }// end of method getFamilyName
    /**
     * method set the id of the customer
     * @param: long idToSet
     * @return: None 
     */
    public void setId( long idToSet)
    {
        _id = idToSet;
    }// end of method setId
    /**
     * method set the first name of the customer
     * @param: String s
     * @return: None 
     */
    public void setFirstName(String s)
    {
        _firstName = s;
    }// end of method setFirstName
    /**
     * method set the family name of the customer
     * @param: String s
     * @return: None 
     */
    public void setFamilytName(String s)
    {
        _familyName = s;
    }// end of method setFirstName
    /**
     * method return true if given customer is equals 
     * @param: Customer c
     * @return: boolean 
     */
    public boolean equals(Customer c)
    {
        if(c._id == _id && c._firstName.equals(_firstName) && c._familyName.equals(_familyName))
        {
            return true;
        }
        return false;
    }// end of method equlas 
}// end of class Customer
