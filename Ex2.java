public class Ex2 
{
    public static void main(String[] args) 
    {
        System.out.println("1 to 20 using for loop: ");
        for (int i=1;i<=20;i++) 
        {
            System.out.println("i   :"+i);
        }
        System.out.println("end for loop ");

        System.out.println("\n 1 to 20 using while loop: \n");
        int j=1;
        while (j<=20) 
        { 
            System.out.println("j   :"+j);
            j++;
        }
        System.out.println("end while loop ");

        System.out.println("\n 1 to 20 using do - while loop: \n");
        int k=1;
        do 
        { 
            System.out.println("k   :"+k);
            k++;
        } while (k<=20) ;
        System.out.println("end do - while loop ");
    }
}
