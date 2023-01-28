
//*******************************************************
// Company.java 
// the class represent a Company using linked list 
// Author: liron mizrahi
//*******************************************************
public class Company
{
    private RentNode _rent;

    /**
     * constuctor of the class Company 
     * @parm None
     * @return None
     */
    public Company()
    {
        // initialise instance variables
        _rent = null;
    }// end of method Company
    /**
     * method add a rent to the linked list 
     * @parm String name, Car car, Date pickDate, Date returnDate
     * @return boolean
     */
    public boolean addRent(String name, Car car, Date pickDate, Date returnDate)
    {
        Rent rent = new Rent(name, car, pickDate, returnDate);
        RentNode rentNode = new RentNode(rent);
        RentNode head = new RentNode(_rent);
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
            if(head.getNext().getRent().getPickDate().after(pickDate))
            {
                RentNode next = head.getNext();
                rentNode.setNext(next);
                head.setNext(rentNode);
                return true;
            }
            if(head.getNext().getRent().equals(rent))
            {
                return false;
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
    }// end of method addRent
    /**
     * method remove rent from the linked list  
     * @parm Date d
     * @return boolean
     */
    public boolean removeRent(Date d)
    {
        RentNode head = new RentNode(_rent);
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
    }// end of method removeRent
    /**
     * method return the num of rents in the linked list   
     * @parm None
     * @return int 
     */
    public int getNumOfRents()
    {
        int count = 0;
        RentNode head = new RentNode(_rent);
        while(head != null)
        {
            count++;
            head = head.getNext();
        }
        return count;
    }// end of method getNumOfRents 
    /**
     * method return the total sum of prices   
     * @parm None
     * @return int 
     */
    public int getSumOfPrices()
    {
        int sum = 0;
        RentNode head = new RentNode(_rent);
        while(head != null)
        {
            sum += head.getRent().getPrice();
            head = head.getNext();
        }
        return sum;
    }// end of method getSumOfPrices
    /**
     * method return the total sum of days    
     * @parm None
     * @return int 
     */
    public int getSumOfDays()
    {
        int sum = 0;
        RentNode head = new RentNode(_rent);
        while(head != null)
        {
            sum += head.getRent().howManyDays();
            head = head.getNext();
        }
        return sum;
    }// end of method getSumOfDays
    /**
     * method return the length of the averageRent 
     * @parm None
     * @return int 
     */
    public int averageRent()
    {
        int sumDays = getSumOfDays();
        if(sumDays == 0)
        {
            return 0;
        }
        int sumPrices = getSumOfPrices();
        return sumPrices / sumDays;
    }// end of method averageRent
    /**
     * method return the latest return date
     * @parm None
     * @return Date 
     */
    private Date getLatestReturnDate()
    {
        RentNode head = new RentNode(_rent);
        if(head == null)
        {
            return null;
        }
        Date latestDate = new Date (head.getRent().getReturnDate());
        Date temp = null;
        while(head != null)
        {
            temp = new Date (head.getRent().getReturnDate());
            if(temp.after(latestDate))
            {
                latestDate = temp;
            }
            head = head.getNext();
        }
        return latestDate;
    }// end of method getLatestReturnDate
    /**
     * method return the latest return date
     * @parm None
     * @return Car  
     */
    public Car lastCarRent()
    {
        Date latestReturnDate = getLatestReturnDate();
        if(latestReturnDate == null)
        {
            return null;
        }
        RentNode head = new RentNode(_rent);
        while(head != null)
        {
            if(head.getRent().getReturnDate().equals(latestReturnDate))
            {
                return head.getRent().getCar();
            }
            head = head.getNext();
        }
        return null;
    }// end of method lastCarRent
    /**
     * method return the longest rent days
     * @parm None
     * @return int
     */
    private int getLongestRent()
    {
        RentNode head = new RentNode(_rent);
        if(head == null)
        {
            return 0;
        }
        int maxDays = head.getRent().howManyDays();
        int temp = 0;
        while(head != null)
        {
            temp = head.getRent().howManyDays();
            if(temp > maxDays)
            {
                maxDays = temp;
            }
            head = head.getNext();
        }
        return maxDays;
    }// end of method getLongestRent
    /**
     * method return the rent with the longest days
     * @parm None
     * @return Rent
     */
    public Rent longestRent()
    {
        int maxDays = getLongestRent();
        if(maxDays == 0)
        {
            return null;
        }
        RentNode head = new RentNode(_rent);

        while(head != null)
        {
            if(head.getRent().howManyDays() == maxDays)
            {
                return head.getRent();
            }
            head = head.getNext();
        }
        return null;
    }// end of method longestRent
    /**
     * method return the most common rate between the rents in the linked list 
     * @parm None
     * @return char 
     */
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
            if(type == 'A'){
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
            else if(type == 'D')
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
    }// end of method mostCommonRate
    /**
     * method return RentNode at given index
     * @parm int index
     * @return RentNode
     */
    private RentNode get(int index)
    {
        if(index < 0 || index >= getNumOfRents())
        {
            throw new IndexOutOfBoundsException();
        }
        RentNode temp = new RentNode(_rent);
        for(int i = 0; i < index; i++)
        {
            temp = temp.getNext();
        }
        return temp;
    }// end of method get 
    /**
     * method return true if all the rent in the other rent list is includes in the exists rent list otherwise she return false 
     * @parm RentNode other 
     * @return boolean
     */
    public boolean includes(Company other)
    {
        if(getNumOfRents() > other.getNumOfRents())
        {
            return false;
        }
        RentNode temp = new RentNode(_rent);
        for(int i = 0; i <= other.getNumOfRents() - getNumOfRents(); i++)
        {
            boolean included = true;
            for(int j = 0; j < getNumOfRents(); j++)
            {
                if(!other.get(i+j).getRent().equals(temp.get(j).getRent()))
                {
                    included = false;
                    break;
                }
            }
            if(included)
            {
                return true;
            }
        }
        return false;
    }// end of method includs 
    /**
     * method merge the rents list 
     * @parm Company other
     * @return None
     */
    public void merge(Company other)
    {
        if(!includes(other))
        {
            for(int i = 0; i < other.getNumOfRents(); i++)
            {
                addRent(other.get(i).getRent().getName(),other.get(i).getRent().getCar(), other.get(i).getRent().getPickDate(), other.get(i).getRent().getReturnDate());
            }
        }
    }// end of method merge 
    /**
     * method which ensures that there are no overlaps between rental records In the list represented in the Company class 
     * @parm Company other
     * @return None
     */
    public void unifyRents()
    {
        RentNode temp = new RentNode(_rent);
        for(int i = 0; i < getNumOfRents(); i++)
        {
            for(int j = 0; j < getNumOfRents(); i++)
            {
                _rent.get(i).setRent(temp.get(i).getRent().overlap(temp.get(j).getRent()));
            }
        }
    }// end of method unifyRents 
    /**
     * method return the rents data as string
     * @parm None
     * @return String
     */
    public String toString()
    {
        if(_rent == null)
        {
            return "The company has 0 rents.";
        }
        String s = "The company has " + getNumOfRents() + " rents. \n";
        RentNode printRent = new RentNode(_rent);
        while(printRent != null)
        {
            s += printRent.getRent().toString() + "\n";
            printRent = printRent.getNext();
        }
        return s;
    }// end of method toString
}// end of class Company
