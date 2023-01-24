/**
 * College.java
 * the class reprsents a College
 * Author : liron mizrhai
 */
public class College
{
    public final static int NUM_OF_COURSES_OR_CLSRM = 20;
    private Course[] _courses;
    private Clsrm[] _clsrms;
    /**
     * the methd return the most popular course in the college
     * @param: None
     * @return: Course
     */
    public Course mostPopular()
    {
        int index = 0;
        for(int i = 1; i < _courses.length; i++)// 4
        {
            if(_courses[i].getNumOfStudents() > _courses[index].getNumOfStudents())
            {
                index = i;
            }
        }
        return _courses[index];
    }// end of method mostPopular
    /**
     * the method return the beggest clsss in the college
     * @param: None
     * @return: Clsrm
     */
    public Clsrm biggestClsrm()
    {
        int index = 0;
        for(int i = 1; i < _clsrms.length; i++)
        {
            if(_clsrms[i].getClassPlaces() > _clsrms[index].getClassPlaces())
            {
                index = i;
            }
        }
        return _clsrms[index];
    }// end of method biggestClsrm
    /**
     * the method return how many clsrms are suitable for handicapped people
     * @param: None
     * @return: int
     */
    public int howManyHandi()
    {
        int num = 0;
        for(int i = 0; i < _clsrms.length; i++)
        {
            if(_clsrms[i].handicappedSuitable() && _clsrms[i].getAvailable())
            {
                num++;
            }
        }
        return num;
    }// end of method howManyHandi
    /**
     * the method return how many clsrms are suitable for handicapped people
     * @param: None
     * @return: int
     */
    public int howManyOnTopFloor()
    {
        int biggestFloor = getBiggestFloor();
        int numTopFloor = 0;
        for(int i = 0; i < _clsrms.length; i++)
        {
             if(_clsrms[i].getFloorNumber() == biggestFloor)
             {
                 numTopFloor++;
             }
        }
        return numTopFloor;
    }// end of method howManyOnTopFloor
    
    private int getBiggestFloor()
    {
        int index = 0;
        for(int i = 1; i < _clsrms.length; i++)
        {
            if(_clsrms[i].isHigher(_clsrms[index]))
            {
                index = i;
            }
        }
        return _clsrms[index].getFloorNumber();
    }// end of method getBiggestFloor
    
}// end of class College
