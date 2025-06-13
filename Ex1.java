import java.util.*;
public class Ex1 
{
   public static void main(String[] args) 
    {    
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number   : ");
        int no=input.nextInt();

        if(no<=9 && no>0)
        {
                 System.out.println("one digit number");
        }

        if(no<=99 && no>9)
        {
                 System.out.println("two digit number");
        }

        if(no<=999 && no>99)
        {
                 System.out.println("three digit number");
        }

        if(no<=9999 && no>999)
        {
                 System.out.println("four digit number");
        }
        if(no>9999)
        {
            System.out.println("number is more then four digit ");
        }
    }
}
