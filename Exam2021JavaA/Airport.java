/**
 * Airport.java
 * the class reprsents airport 
 * Author: liron mizrhai
 */
public class Airport
{
    public static final int MAX_FLIGHTS = 200;

    public Flight[] _flightsSchedule;
    public int _noOfFlight;

    /**
     * method return the first flight from given place
     * @param: String place
     * @return: Time 
     */
    public Time firstFlightFromPlace(String place)
    {
        Flight[] flightsFromPlace = new Flight[MAX_FLIGHTS];
        int noOfFlightFromPlace = 0;
        int index = 0;
        for(int i = 0; i < _noOfFlight; i++)
        {
            if(_flightsSchedule[i].getOrigin().equals(place))
            {
                flightsFromPlace[index] = _flightsSchedule[i];
                index++;
            }
        }
        if(flightsFromPlace.length == 1)
        {
            flightsFromPlace[0].getDepatureTime();
        }
        else if(flightsFromPlace.length > 1)
        {
            Time TimeOfFirstFlightFromPlace = flightsFromPlace[0].getDepatureTime();
            for(int i = 1; i < noOfFlightFromPlace; i++)
            {
                if(flightsFromPlace[i].getDepatureTime().before(TimeOfFirstFlightFromPlace))
                {
                    TimeOfFirstFlightFromPlace = flightsFromPlace[i].getDepatureTime();
                }
            }
            if(TimeOfFirstFlightFromPlace != null)
            {
                return TimeOfFirstFlightFromPlace;
            }
            else
            {
                return null;
            } 
        }
        return null;
    }// end of method firstFlightFromPlace
    /**
     * method return the most popular destination
     * @param: None
     * @return String 
     * 
     */
    public String mostPopularDestination()
    {
        if(_noOfFlight == 0)
        {
            return null;
        }
        int popCount = 0;
        int count = 0;
        
        String popDes = null;
        String tempDes;
        for(int i = 0; i < _noOfFlight; i++)
        {
            tempDes = _flightsSchedule[i].getDestination();
            count = 0;
            for(int j = 0; j < _noOfFlight; j++)
            {
                if(tempDes.equals(_flightsSchedule[j].getDestination()))
                {
                    count++;
                }
            }
            if(count > popCount)
            {
                popCount = count;
                popDes = tempDes;
            }
        }
        return popDes;
    }// end of method mostPopularDestination
}// end of class Airport
