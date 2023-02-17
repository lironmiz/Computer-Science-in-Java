
public class Bank
{
    private static final int MAX_ACCOUNTS = 1000;
    private static final double POSITIVE_INTEREST  = 0.005;
    private static final double NEGATIVE_INTEREST = 0.007;
    
    public Account[] _bank;
    public int _noOfAccounts; // 4
    /**
     * constructor of the class Bank
     * @param: None
     * @return: None
     */
    public Bank()
    {
        _bank = new Account[MAX_ACCOUNTS];
        _noOfAccounts = 0;
    }// end of method Bank
    /**
     * method return true if she add account to the bank array succsfuly otherwise false
     * @param: String first, String family, long id, long accNum
     * @return: boolean 
     */
    public boolean addAccount(String first, String family, long id, long accNum)
    {
        // base case managment
        Customer customerCurr = new Customer(id, first, family);
        if(_noOfAccounts == 0)
        {
            _bank[0] = new Account(accNum, customerCurr, POSITIVE_INTEREST);
            _noOfAccounts++;
            return true;
        }
        if(_noOfAccounts == MAX_ACCOUNTS)
        {
            return false;
        }
        _bank[_noOfAccounts] = new Account(accNum, customerCurr, POSITIVE_INTEREST);
        _noOfAccounts++;
        return true;
    }// end of method addAccount
    /**
     * method return the number of accounts there is to given customer
     * @param: Customer c
     * @return: int 
     */
    public int accountCustomer(Customer c)
    {
        int numberAccounts = 0;
        for(int i = 0; i < _noOfAccounts; i++)
        {
            if(_bank[i].getCustomer().equals(c))
            {
                numberAccounts++;
            }
        }
        return numberAccounts;
    }// end of method accountCustomer
    /**
     * methed the return the wealthyest Customer in the bank
     * @param: None
     * @return: Customer
     */
    public Customer wealthy()
    {
        if(_noOfAccounts == 1)
        {
            return _bank[0].getCustomer();
        }
        double heightBalance =_bank[0].getBalance();
        int indexWealthyest = 0;
        for(int i = 1; i < _noOfAccounts; i++)
        {
            if(_bank[i].getBalance() > heightBalance)
            {
                heightBalance = _bank[i].getBalance();
                indexWealthyest = i;
            }
        }
        return _bank[indexWealthyest].getCustomer();
    }// end of method wealthyest
    /**
     * methed set the interest in all the accounts
     * @param: None
     * @return: None 
     */
    public void setInterestInAccounts()
    {
        for(int i = 0; i < _noOfAccounts; i++)
        {
              if(_bank[i].getBalance() > 0)
              {
                  double currBalance = _bank[i].getBalance();
                  double updatedBalance = currBalance + currBalance *  POSITIVE_INTEREST;
                  _bank[i].deposit(updatedBalance);
              }
              else if( _bank[i].getBalance() != 0)
              {
                  double currBalance = _bank[i].getBalance();
                  double updatedBalance = currBalance + currBalance *  NEGATIVE_INTEREST;
                  _bank[i].deposit(updatedBalance);
              }
        }
    }// end of method setInterestInAccounts
    
}// end of class Bank
