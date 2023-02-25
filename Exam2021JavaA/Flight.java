/**
 * flight.java
 * the class reprsents flight
 * Author: liron mizrhai
 */
public class Flight
{
    public static final int MAX_CAPACITY = 250;
    
    private String _origin;
    private String _destination; 
    private Time _depatureTime;
    private int _flightDuration;
    private int _noOfPassengers;
    private boolean _ifFull;
    /**
     * constructor of the class Flight
     * @param: String origin, String des, int hour, int minute, int flightDuration, int passangerNumber
     * @return: None
     */
    public Flight(String origin, String des, int hour, int minute, int flightDuration, int passangerNumber)
    {
        _origin = origin;
        _destination = des;
        _depatureTime  = new Time(hour, minute);
        _flightDuration = flightDuration;
        _noOfPassengers = passangerNumber;
        if(passangerNumber < 250)
        {
            _ifFull =  false;
        }
        else
        {
            _ifFull = true;
        }
    }// end of method Flight    
    /**
     * copy constructor of the class Flight
     * @param: Time other 
     * @return: None 
     */
    public Flight(Flight other)
    {
        _origin = other._origin;
        _destination = other._destination;
        _depatureTime = new Time(other._depatureTime);
        _noOfPassengers = other._noOfPassengers;
        if(other._noOfPassengers < 250)
        {
            _ifFull =  false;
        }
        else
        {
            _ifFull = true;
        }
    }// end of method Flight
    // private Time _depatureTime;
    public void setDepatureTime(Time depatureTimeToSet)
    {
        _depatureTime = new Time(depatureTimeToSet);
    }
    /**
     * method return the depatrueTime 
     * @param: None
     * @return: Time 
     */
    public Time getDepatureTime()
    {
        return _depatureTime;
    }// end of method getDepatureTime
    /**
     * return the arrival time of the flight
     * @param: None 
     * @return: Time 
     */
    public Time getArrivalTime()
    {
        return _depatureTime.addMinutes(_flightDuration);
    }// end of method getArrivalTime
    /**
     * method return the origin of the flight
     * @param: None
     * @return: String
     */
    public String getOrigin()
    {
        return _origin;
    }// end of method getOrigin
    /**
     * method return the destination of the flight
     * @param: None
     * @return: String
     */
    public String getDestination()
    {
        return _destination;
    }// end of method getDestination
    /**
     * method return true if numbers of passengers is valid otherwise false
     * @param: int
     * @return: boolean
     */
    public boolean addPassengers(int num)
    {
        if(_ifFull)
        {
            return false;
        }
        int newPassengersCount = _noOfPassengers + num;
        if(newPassengersCount > MAX_CAPACITY)
        {
            return false;
        }
        else if (newPassengersCount == MAX_CAPACITY)
        {
            _ifFull = true;
            return true;
        }
        return true;
    }// end of method addPassengers
}// end of class Flight 
