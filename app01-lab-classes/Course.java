
/**
 * Write a description of class Course here.
 *
 * @author (Abu Ahmed)
 * @version 0.1
 */
public class Course
{
   
    private String title;
     
    private String code;
    
 

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
      this.title = title; 
      this.code = code;
    }
    
    public void print ()
    {
        System.out.println("course " + title + " code " + code );
    }
}
