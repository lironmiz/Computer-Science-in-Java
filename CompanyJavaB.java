
/**
 * Company for rent cars
 * @author liron mizrahi
 */
public class Company
{
    // instance variables - RentNode linkedlist
    private RentNode _rent;

    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        // initialise instance variables
        _rent = null;
    }
    
    public boolean addRent(String name, Car car, Date pickDate, Date returnDate)
    {
        Rent rent = new Rent(name, car, pickDate, returnDate);
        RentNode rentNode = new RentNode(rent);
        RentNode head = _rent;
        if(head == null)
        {
            head = rentNode;
        }
        
        while(head != null)
        {
            if(head.getRent().equals(rent))
            {
                return false;
            }
            if(head.getNext() == null)
            {
                head.setNext(rentNode);
                return true;
            }
            if(head.getNext().getRent().getPickDate().after(pickDate)){
                
                RentNode next = head.getNext();
                rentNode.setNext(next);
                head.setNext(rentNode);
                return true;
            }
            if(head.getNext().getRent().getPickDate().equals(pickDate))
            {
                if(head.getNext().getRent().howManyDays() < rent.howManyDays())
                {
                    RentNode next = head.getNext();
                    rentNode.setNext(next);
                    head.setNext(rentNode);
                    return true;
                }
            }
            
            head = head.getNext();
        }
        
        return true;
    }
    
    public boolean removeRent(Date d)
    {
        RentNode head = _rent;
        if(head == null)
        {
            return false;
        }
        if(head.getRent().getReturnDate().equals(d))
        {
            head = null;
            return true;
        }
        while(head.getNext() != null)
        {
            if(head.getNext().getRent().getReturnDate().equals(d))
            {
                head.setNext(head.getNext().getNext());
                return true;
            }
            head = head.getNext();
        }
        return false;
    }
    
    public int getNumOfRents()
    {
        int count = 1;
        RentNode head = _rent;
        while(head != null)
        {
            count++;
            head = head.getNext();
        }
        return count;
    }
    public int getSumOfPrices()
    {
        int sum = 0;
        RentNode head = _rent;
        while(head != null)
        {
            sum = head.getRent().getPrice();
            head = head.getNext();
        }
        return sum;
    }
    
    public int getSumOfDays()
    {
        int sum = 0;
        RentNode head = _rent;
        while(head != null)
        {
            sum = head.getRent().howManyDays();
            head = head.getNext();
        }
        return sum;
    }
    public int averageRent()
    {
        int sumDays = getSumOfDays();
        if(sumDays == 0)
        {
            return 0;
        }
        int sumPrices = getSumOfPrices();
        return sumPrices/sumDays;
    }
    private Date getLatestReturnDate()
    {
        RentNode head = _rent;
        if(head == null)
        {
            return null;
        }
        Date latestDate = head.getRent().getReturnDate();
        Date temp = null;
        while(head != null)
        {
            temp = head.getRent().getReturnDate();
            if(temp.after(latestDate))
            {
                latestDate = temp;
            }
            head = head.getNext();
        }
        return latestDate;
    }
    public Car lastCarRent()
    {
        Date latestReturnDate = getLatestReturnDate();
        if(latestReturnDate == null)
        {
            return null;
        }
        RentNode head = _rent;
        
        while(head != null)
        {
            if(head.getRent().getReturnDate().equals(latestReturnDate))
            {
                return head.getRent().getCar();
            }
            head = head.getNext();
        }
        return null;
    }
    private int getLongestRent()
    {
        RentNode head = _rent;
        if(head == null)
        {
            return 0;
        }
        int maxDays = head.getRent().howManyDays();
        int temp = 0;
        while(head != null){
            temp = head.getRent().howManyDays();
            if(temp > maxDays)
            {
                maxDays = temp;
            }
            head = head.getNext();
        }
        return maxDays;
    }
    public Rent longestRent()
    {
        int maxDays = getLongestRent();
        if(maxDays == 0)
        {
            return null;
        }
        RentNode head = _rent;
        
        while(head != null)
        {
            if(head.getRent().howManyDays() == maxDays)
            {
                return head.getRent();
            }
            head = head.getNext();
        }
        return null;
    }
    public char mostCommonRate()
    {
        RentNode head = _rent;
        if(head == null)
        {
            return 'N';
        }
        int[] sumPopularity = new int[4];
        for(int i = 0; i < sumPopularity.length; i++)
        {
            sumPopularity[i] = 0;
        }
        while(head != null)
        {
            char type = head.getRent().getCar().getType();
            if(type == 'A')
            {
                sumPopularity[0]++;
            }
            else if(type == 'B')
            {
                sumPopularity[1]++;
            }
            else if(type == 'C')
            {
                sumPopularity[2]++;
            }
            else
            {
                sumPopularity[3]++;
            }
            head = head.getNext();
        }
        int max = Math.max(sumPopularity[0], Math.max(sumPopularity[1],Math.max(sumPopularity[2],sumPopularity[3])));
        for(int i = sumPopularity.length - 1; i >= 0; i++)
        {
            if(sumPopularity[i] == max)
            {
                if(i == 0)
                {
                    return 'A';
                }
                if(i == 1)
                {
                    return 'B';
                }
                if(i == 2)
                {
                    return 'C';
                }
                if(i == 3)
                {
                    return 'D';
                }
            }
        }
        return 'N';
    }
    /**
     * check if company includes in the rent list on the same order
     * @param company (Company)
     * @return boolean (true/false)
     */
    public boolean includes(Company company)
    {
        RentNode list = company.getRentList();
        if(list == null)
        {
            return true;
        }
        if(_rent == null)
        {
            return false;
        }
        RentNode head = _rent;
        while(head != null)
        {
            if(head.getRent().equals(list.getRent()))
            {
                list = list.getNext();
                if(list == null){
                    return true;
                }
            }
            head = head.getNext();
        }
        return false;
    }
    public void merge(Company company)
    {
        
        if(_rent== null)
        {
            _rent = company.getRentList();
            return;
        }
        
        if(company == null || company.getRentList() == null)
        {
            return;
        }
        
        RentNode otherHead = company.getRentList();
        
        while(otherHead != null)
        {
            company.addRent(otherHead.getRent());
            otherHead = otherHead.getNext();
        }
    }
    
    public String toString()
    {      
        if(_rent == null)
        {
            return "The company has 0 rents.";
        }
        int length = getNumOfRents();
        String companyInfo = "The company has " + length + " rents:\n";
        RentNode head = _rent;
        while(head != null)
        {
            companyInfo = companyInfo + head.getRent().toString() + "\n";
            head = head.getNext();
        }
        return companyInfo;
    }
}
