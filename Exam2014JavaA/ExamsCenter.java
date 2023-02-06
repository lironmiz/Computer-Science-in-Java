/**
 * ExamsCenter.java
 * the class reprsents a ExamsCenter
 * Author: liron mizrhai
 */
public class ExamsCenter
{
    private final int MAX_EXAMS = 100;
    
    private Exam[] _center;
    private int _noOfExams;
    
    /**
     * constractor of the class ExamCenter 
     * @param: None
     * @return: None
     */
    public ExamsCenter()
    {
        _center = new Exam[MAX_EXAMS];
        _noOfExams = 0;
    }// end of method ExamsCenter 
    /**
     * method return true if we added exam to the array of exams otherwise false 
     * @param: Exam ex
     * @return: boolean 
     */
    public boolean addExam(Exam ex)
    {
        if( _noOfExams > 99)
        {
            return false;
        }
        _center[_noOfExams] = ex;
        _noOfExams++; // 1
        return true;
    }// end of method addExam
    /**
     * method return the number of exams between two given dates
     * @param: Date d1, Date d2
     * @return: int 
     */
    public int howManyExamsBetweenDates(Date d1, Date d2)
    {
        int numOfExams = 0;
        Date DateEarlier = d1.before(d2) ? d1 : d2;
        for(int i = 0; i < _noOfExams; i++)
        {
            Exam curr = _center[i];
            if(curr.getDate().after(d1) && curr.getDate().before(d2))
            {
                numOfExams++;
            }
            else if(curr.getDate().equals(d1) || curr.getDate().equals(d2))
            {
                numOfExams++;
            }
        }
        return numOfExams;
    }// end of method howManyExamsBetweenDates
    /**
     * method return the most Popular Date
     * @param: None
     * @return: Date 
     */
    public Date mostPopularDate()
    {
        int[] ExamsInDate = new int[_noOfExams];
        for(int i = 0; i < _noOfExams; i++)
        {
            Date currDate = _center[i].getDate();
            ExamsInDate[i] = howManyExamsBetweenDates(currDate, currDate);
        }
        int max = -1;
        int maxIndex = 0;
        for(int i = 0; i < ExamsInDate.length; i++)
        {
            if(ExamsInDate[i] > max)
            {
                max = ExamsInDate[i];
                maxIndex = i;
            }
        }
        return _center[maxIndex].getDate();
    }// end of method mostPopularDate
    /**
     * method delete all the exams that there name is equal to given courseName
     * @param: String courseName
     * @return: None
     */
    public void deleteExams(String courseName)
    {
        int preNumOfExams = _noOfExams;
        for(int i = 0; i < _noOfExams; i++)
        {
            if(_center[i].getCourse().equals(courseName))
            {
                _noOfExams--;
                _center[i] = null;
            }
        }
        
        for(int j = 0; j < preNumOfExams; j++)
        {
            if(_center[j] == null)
            {
                for( int k = j + 1; k < preNumOfExams; k++)
                {
                    if(_center[k] != null)
                    {
                        _center[j] = _center[k];
                        _center[k] = null;
                        break;
                    }
                }
            }
        }
    }// end of methd deleteExams
}// end of class ExamCenter 
