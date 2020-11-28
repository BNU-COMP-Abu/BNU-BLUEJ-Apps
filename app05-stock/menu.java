
/**
 * Write a description of class menu here.
 *
 * @author Abu Ahmed
 * @version 22011615
 */
public class menu
{
    
    private static InputReader reader= new InputReader();
    /**
     * Display all choices and make sure that
     */
    public static String getMenuChoice(String [] choices)
    {
        boolean isValid = false;
        String choice = null;
        
        while(!isValid)
        {
            printChoices(choices);
           
            choice = reader.getInput();
            choice = choice.toLowerCase();
            
            isValid = checkIsValid(choices, choice);
        }
        return choice;
    }
    
    private static boolean checkIsValid(String [] choices,String choice)
    {
        for(String validChoice : choices)
        {
            validChoice = validChoice.toLowerCase();
            if(validChoice.startsWith(choice))
                return true;
        }
        System.out.println("Invalid Menu choice");
        return false;
    }
    
    private static void printChoices(String [] choices)
    {
        System.out.println("Enter the first word of your choices are \n");
        
        for(String choice: choices)
        {
            System.out.println("   " + choice);
        }
    }
}
