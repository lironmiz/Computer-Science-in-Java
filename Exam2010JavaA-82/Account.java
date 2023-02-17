
public class Account
{
    private static final int FEE = 3;
    
    private long _accountNum;
    private Customer _customer;
    private double _balance;
    private double _interest;
    /**
     * constructor of the class Account
     * @param: long num, Customer c, double interest
     * @return: None
     */
    public Account(long num, Customer c, double interest)
    {
        _accountNum = num;
        _customer = c;
        _balance = 0;
        _interest = interest;
    }// end of method Account 
    /**
     * method return account number 
     * @param: None
     * @return:  long 
     */
    public long getAccountNum()
    {
        return _accountNum;
    }// end of method accountNum
    /**
     * method return the customer of the account
     * @param: None
     * @return: Customer
     */
    public Customer getCustomer()
    {
        return new Customer(_customer);
    }// end of method getCustomer 
    /**
     * method return the balance of the account
     * @param: None
     * @return: double 
     */
    public double getBalance()
    {
        return _balance;
    }// end of method getBalance
     /**
     * method return the interest of the account 
     * @param: None
     * @return: double 
     */
    public double getInterest()
    {
        return _interest;
    }// end of method getinterest
    /**
     * method set new interest value to account 
     * @param: double interestToSet
     * @return: None 
     */
    public void setInterest(double interestToSet)
    {
        _interest = interestToSet;
    }// end of method setInterest
    /**
     * method set the balance of the account 
     * @param: double amount
     * @return: None 
     */
    public void deposit(double amount)
    {
        _balance = amount;
    }// end of method doposit 
    /**
     * method set the new balance after withdraw 
     * @param: double amount
     * @return: None 
     */
    public void withdraw(double amount)
    {
        _balance = _balance - amount;
    }// end of method withdraw
    /**
     * method add the interest to current balance 
     * @param: None
     * @param: None 
     */
    public void addInterest()
    {
        _balance = _balance + _interest * _balance;
    }// end of method addInterest
}// end of class Account
