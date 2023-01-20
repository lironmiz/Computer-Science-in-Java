/**
 * Company.java
 * the class represent a Company
 * @author (liron mizrhai)
 * @Date (1/7/2023)
 */
public class Company
{
    private Rent[] _rents;
    private int _noOfRents;
    
    // Constant in the class
    final private static int MAX_RENTS_IN_COMPANY = 1000;
    
    /**
    * constuctor of the class Company 
    * @parm None
    * @return None
    */
    public Company() 
    {
        _rents = new Rent[MAX_RENTS_IN_COMPANY];
        _noOfRents = 0;
    }// end of method Company
    /**
    * method add rent in company 
    * @parm Strint nameRenter, Car car, Date pickDate, Date returnDate
    * @return boolean
    */
    public boolean addRent(String nameRenter, Car car, Date pickDate, Date returnDate)
    {
        // if number of rents in the company is 0 than we add it in _rents[0] and increase the num of rents by 1
        if (_noOfRents == 0)
        {
            _rents[0] = new Rent(nameRenter, car, pickDate, returnDate); 
            _noOfRents++;
            return true;
        }
        else if(_noOfRents == MAX_RENTS_IN_COMPANY) // if the number of rents is the max value than we return false 
        {
            return false;
        }
        int index = getInsertDeleteIndex(pickDate, true);
        // make the new rent 
        Rent[] newRents = new Rent[MAX_RENTS_IN_COMPANY];
        int k = 0;
        _noOfRents++;
        // looping the number of rents and add the rent in the appropriate location 
        for (int i = 0; i < _noOfRents + 1; i++)
        {
            if (i == index)
            {
                newRents[i] = new Rent(nameRenter, car, pickDate, returnDate);
            } 
            else
            {
                newRents[i] = _rents[k];
                k++;
            }
        }
        _rents = newRents;
        return true;
    }// end of method addRent
    /**
    * method remove rent from the company 
    * @parm Date d
    * @return boolean
    */
    public boolean removeRent(Date d)
    {
        // if number of rents is zero we return false 
        if (_noOfRents == 0)
        {
            return false;
        }
        // find the index of delete 
        int index = getInsertDeleteIndex(d, false);
        if (index == -1)
        {
            return false;
        }
        // make new rent array in the size of max rents in company
        Rent[] newRents = new Rent[MAX_RENTS_IN_COMPANY];
        int k = 0;
        // loopint the number or rents and make the new rents array without the rent we need to remove
        for (int i = 0; i < _noOfRents; i++)
        {
            if (i == index)
            {
                continue;
            }
            newRents[k++] = _rents[i];
        }
        _rents = newRents;
        _noOfRents--;
        return true;
    }// end of method removeRent
    /**
    * method return the insert or delete index base on flag is pickup 
    * @parm Date date, boolean, isPickup
    * @return int
    */
    private int getInsertDeleteIndex(Date date, boolean isInsert)
    {
        // if flag is true we want the insert index else the delete index
        if (isInsert)
        {
            // loopint from zero to number and rents and check if the date recived as paramater is before the curPickUpDate
            for (int i = 0; i < _noOfRents; i++)
            {
                Date curPickUpDate = _rents[i].getPickDate();
                if (date.before(curPickUpDate))
                {
                    return i;
                }
                else if(date.equals(curPickUpDate))
                {
                    return i + 1;
                }
            }
            return _noOfRents;
        } 
        else
        {
            // looping on number of rents until we find date that equals the current return Date 
            for (int i = 0; i < _noOfRents; i++)
            {
                Date curReturnDate = _rents[i].getReturnDate();
                if (date.equals(curReturnDate))
                {
                    return i;
                }
            }
            return -1; // if we didnt fine the date that equals to cuurent return date we return -1
        }
    }// end of method getInsertDeleteIndex
    /**
    * method return the last car in the rent arr
    * @parm None
    * @return Car
    */
    public Car lastCarRent() 
    {
        // Basic case management
        if (_noOfRents == 0)
        {
            return null;
        } else if (_noOfRents == 1)
        {
            return _rents[0].getCar();
        }
        Rent rent = _rents[0]; 
        // loopint from 1 to number of rents and check if the return date of current rent is after the first rent we init  
        for (int i = 1; i < _noOfRents; i++)
        {
            Rent curRent = _rents[i];
            if (curRent.getReturnDate().after(rent.getReturnDate())) 
            {
                rent = curRent;
            }
        }
        // return the last car rent that the return date to company is the latest
        return rent.getCar();
    }// end of method lastCarRent
    /**
    * method returns the total profit of all periods The rental represented in the list.
    * @parm None
    * @return int
    */
    public int getSumOfPrices()
    {
        int sum = 0;
        for (int i = 0; i < _noOfRents; i++)
        {
            sum += _rents[i].getPrice();
        }
        return sum;
    } // end of method getSumOfPrices
    /**
    * method returns the total rental days of the company
    * @parm None
    * @return int
    */
    public int getSumOfDays() 
    {
        int days = 0;
        for (int i = 0; i < _noOfRents; i++)
        {
            days += _rents[i].howManyDays();
        }
        return days;
    }// end of method getSumOfDays
    /**
    * method returns the average rent days 
    * @parm None
    * @return int
    */
    public double averageRent()
    {
        if (_noOfRents == 0)
        {
            return 0;
        }
        return ((double) getSumOfDays() / (double) _noOfRents);
    }// end of method averageRent
    /**
    * method returns the most common rate of all the cars
    * @parm None
    * @return char
    */
    public char mostCommonRate()
    {
        // Basic case management
        if (_noOfRents == 0)
        {
            return 'N';
        } else if (_noOfRents == 1)
        {
            return _rents[0].getCar().getType();
        }
        // Creating an array of counters
        char[] rates = { 'A', 'B', 'C', 'D' };
        int[] frequencies = new int[rates.length];
        for(int i = 0; i < rates.lenght; i++)
        {
            frequencies[i] = 0;
        }
        // loopint all the rent and using switch case and increases the value in the array appropriate for the current car type
        for (int i = 0; i < _noOfRents; i++)
        {
            switch (_rents[i].getCar().getType())
            {
                case 'A':
                    frequencies[0] += 1;
                    break;
                case 'B':
                    frequencies[1] += 1;
                    break;
                case 'C':
                    frequencies[2] += 1;
                    break;
                case 'D':
                    frequencies[3] += 1;
                    break;
                default:
                    break;
            }
        }
        int max = -1;
        int maxIndexOne = -1;
        int maxIndexTwo = -1;
        // Go through all the members of your array and check which one is the one
        // with the largest value, and if there is more than one, then save 
        // it in the second index
        for (int i = 0; i < frequencies.length; i++)
        {
            if (frequencies[i] > max)
            {
                max = frequencies[i];
                maxIndexOne = i;
            } 
            else if (max != 0 && frequencies[i] == max)
            {
                maxIndexTwo = i;
            }
        }
        // return the most common rate base on the frequencies array
        if (rates[maxIndexOne] > rates[maxIndexTwo])
        {
            return rates[maxIndexOne];
        }
        else
        {
            return rates[maxIndexTwo];
        }
    }// end of method  mostCommonRate
    /**
    * method returns the rental where the number of rental days is maximum 
    * @parm None
    * @return Rent
    */
    public Rent longestRent()
    {
        // Handling the case where the number of rentals is zero
        if (_noOfRents == 0)
        {
            return null;
        }
        int max = _rents[0].howManyDays();
        int indexLongest = 0;
        for (int i = 1; i < _noOfRents; i++)
        {
           if(_rents[i].howManyDays() > max)
           {
               max = _rents[i].howManyDays();
               indexLongest = i;
           }
        }
        return _rents[indexLongest];
    }// end of method longestRent
    /**
    * method returns the rent data as string 
    * @parm None
    * @return String
    */
    public String toString()
    {
        // Base case treatment
        if (_noOfRents == 0)
        {
            return "The company has 0 rents.";
        }
        String str = "";
        // Add the initial sentence to the string
        str += "The company has " + _noOfRents + " rents:\n";
        // loopint the number of rents and add to the final string the current rent toString method and if he is no the last so also we go down a line
        for (int i = 0; i < _noOfRents; i++)
        {
            str += _rents[i].toString();
            if (i == _noOfRents - 1)
            {
                str += "\n";
            }
        }
        return str;
    }// end of method toString
}// end of class Company
