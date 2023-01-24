/**
 * Course.java
 * the class reprsents a course
 * Author: liron mizrhai
 */
public class Course
{
      private String _courseName;
      private int _numOfStudents;
      private Clsrm _courseClsrm;
      /**
      * constractor of the class course 
      * @param: String courseName, int numOfStudents 
      * @retrurn: None
      */
      public Course(String courseName, int numOfStudents)
      {
          _courseName = courseName;
          if( numOfStudents > -1)
          {
              _numOfStudents = numOfStudents;
          }
          else 
          {
              _numOfStudents = -1;    
          }
          _courseClsrm = null;
      }// end of method Course 
      /**
      * the method return the num of students in the course
      * @param: None
      * @retrurn: int 
      */
      public int getNumOfStudents()
      {
          return _numOfStudents;
      }// end of method getNumOfStudents
      /**
      * the method return name of the course 
      * @param: None
      * @retrurn: String
      */
      public String getCourseName()
      {
          return _courseName;
      }// end of method getCourseName
      /**
      * the method return the clsrm of the course
      * @param: None
      * @retrurn: Clsrm (null)
      */
      public Clsrm getClsrm()
      {
          if(_courseClsrm == null)
          {
              return null;
          }
          return _courseClsrm;
      }// end of method getClsrm
      /**
      * the method set the clsrm of the course
      * @param: Clsrm cls
      * @retrurn: None
      */
      public void setClsrm(Clsrm cls)
      {
          if(_numOfStudents <= cls.getClassPlaces() && cls.getAvailable())
          {
              _courseClsrm = new Clsrm(cls);
              cls.setAvilable(false);
          }
      }// end of method setClsrm
      /**
      * the method return if the course is suitable for handicapped
      * @param: boolean handi
      * @retrurn: boolean
      */
      public boolean clsrmSuitable(boolean handi)
      {
          if(!handi)
          {
              return true;
          }
          else if(_courseClsrm == null)
          {
              return false;
          }
          else if(handi && _courseClsrm.handicappedSuitable())
          {
              return true;
          }
          return false;
      }// end of method clsrmSuitable 
      /**
      * the method return if the class is morePopular 
      * class is more popular if the number of students in the course is higher
      * @param: Course c
      * @retrurn: boolean
      */
      public boolean morePopular(Course c)
      {
          if(_numOfStudents > c._numOfStudents)
          {
              return true;
          }
          return false;
      }// end of method morePopular
}// end of class Course 
