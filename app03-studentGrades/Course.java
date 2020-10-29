
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
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int averageMark;
    
    private Grades grade;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String code)
    {
      this.title = title; 
      this.code = code;
      
      createModules();
      module1 = new Module("Programming Concepts","CO452");
      //todo add the others 
    }
    
    
    public void createModules()
    {
        module1 = new Module("programming Concepts", "CO452");
        module2 = new Module("Computing", "CO454");
        module3 = new Module("Global business", "BM454");
        module4 = new Module("Principles of Mangement", "BM232");
    }
    
    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
          module1 = module;   
        }
        else if(moduleNo == 2)
        {
            module2 = module;
        }
        else if(moduleNo == 3)
        {
            module3 = module;
        }
        else if(moduleNo == 4)
        {
            module4 = module;
        }
        else
        {
          System.out.print("Invalid module!!!");
        }
    }
    
    public void awardMark(int mark, int moduleNo)
    {
        if (moduleNo == 1)
        {
            module1.awardMark(mark);
        }
        if (moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        if (moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        if (moduleNo == 4)
        {
            module4.awardMark(mark);
        }
    }
    
    public void calculateFinalMark()
    {
        averageMark = module1.getMark() + module2.getMark() +         
            module3.getMark() + module4.getMark(); 
        averageMark = averageMark / 4;
    }
    
    public void calculateGrade()
    {
        if(averageMark >= 0 & averageMark < 40)
        {
            grade = Grades.F;
        }
        if (averageMark >= 40 & averageMark < 49)
        {
            grade = Grades.D;
        }
        if (averageMark >= 50 & averageMark < 59)
        {
            grade = Grades.C;
        }
        if (averageMark >= 60 & averageMark < 69)
        {
            grade = Grades.B;
        }
        if (averageMark >= 70 & averageMark < 100)
        {
            grade = Grades.A;
        }
    }
    
    public void print ()
    {
        System.out.println("course " + title + " code " + code );
        module1.print();
        module2.print();
        module3.print();
        module4.print();
        
        System.out.println("Final Mark = " + averageMark); 
        System.out.println("Final Mark = " + grade); 
    }
}