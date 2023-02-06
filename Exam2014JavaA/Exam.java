/**
 * Exam.java
 * the class reprsents a Exam
 * Author: liron mizrhai
 */
public class Exam
{
    private String _course;
    private Date _date;
    private int _noOfStudents;
    
    /**
     * constractor of the class Exam
     * @param: String courseName, int day, int month, int year, int numOfStudents
     * @return: None
     */
    public Exam(String courseName, int day, int month, int year, int numOfStudents)
    {
        _course = courseName;
        Date date = new Date(day, month, year);
        _date = new Date(date);
        int _noOfStudents = numOfStudents;
    }// end of method Exam
    /**
     * copy constractor of the class Exam
     * @param: Exam other
     * @return: None
     */
    public Exam(Exam other)
    {
        _course = other._course;
        _date = new Date(other._date);
        _noOfStudents = other._noOfStudents;
    }// end of method Exam
    /**
     * method the return the date
     * @param: None
     * @return: Date
     */
    public Date getDate()
    {
        return _date;
    }// end of method getDate()
    /**
     * method return the exam name 
     * @param: None
     * @return: String
     */
    public String getCourse()
    {
        return _course;
    }// end of method getCourse
    /**
     * method return the number of students
     * @param: None
     * @return: int 
     */
    public int getNumOfStudents()
    {
        return _noOfStudents;
    }// end of method getNumOfStudents
    /**
     * method return true if the given name is equal to exam name and false otherwise
     * @param: String name
     * @return: boolean 
     */
    public boolean sameCourse(String name)
    {
        return _course.equals(name);
    }// end of method sameCourse
    /**
     * method return true if given date same as _date and false otherwise
     * @param: Date date 
     * @return: boolean
     */
    public boolean sameDate(Date date)
    {
        return _date.equals(date);
    }// end of method sameDate
    /**
     * method return true if the name is valid
     * @param: None
     * @return: boolean
     */
    public boolean isValidName()
    {
        if(_course.matches("[a-zA-Z]+"))
        {
            for(int i = 0; i < _course.length(); i++)
            {
                if(!Character.isLowerCase(_course.charAt(i)))
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }// end of method isValidName
}// end of class Exam
