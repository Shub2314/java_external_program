import java.util.Scanner;
public class EX19 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in words : ");
        String input = sc.nextLine();
        switch (input) 
        {
            case "one":
                System.out.println("You selected ONE.");
                break;
            case "two":
                System.out.println("You selected TWO.");
                break;
            case "three":
                System.out.println("You selected THREE.");
                break;
            case "four":
                System.out.println("You selected FOUR.");
                break;
            case "five":
                System.out.println("You selected FIVE.");
                break;
            case "six":
                System.out.println("You selected SIX.");
                break;
            case "seven":
                System.out.println("You selected SEVEN.");
                break;
            case "eight":
                System.out.println("You selected EIGHT.");
                break;
            case "nine":
                System.out.println("You selected NINE.");
                break;
            case "ten":
                System.out.println("You selected TEN.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
