
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
    
    
    public void print ()
    {
        System.out.println("course " + title + " code " + code );
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
}
