public class EX11 
{
    public static void main(String[] args) 
    {
        int var1 = 10;
        int var2 = 0;
        try 
        {
            int result = var1 / var2; 
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("You cannot divide by zero");
        } 
        finally 
        {
            System.out.println("End");
        }
    }
}
