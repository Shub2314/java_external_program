import java.util.*;
class NoMatchExceptions extends Exception 
{
    public NoMatchExceptions(String s) 
    {
        super(s);
    }    
}
public class EX12 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String pass = "INDIA";
        System.out.print("Enter the pass: ");
        String str = input.nextLine();
        try 
        {
            if (!str.equals(pass)) 
            {
                throw new NoMatchExceptions("Error: Password does not match!");
            } else 
            {
                System.out.println("Done");
            }

        } 
        catch (NoMatchExceptions e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
