public class Ex3 
{
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("shubham");
        System.out.println("Original string    : "+sb);

        //append method
        sb.append("jadhav");
        System.out.println("before using append method    : "+sb);

        //insert method
        sb.insert(7," ");
        System.out.println("After using insert method    : "+sb);

        //delete method
        sb.delete(8,15);
        System.out.println("After using delete method    : "+sb);

        //chartAt method
        System.out.println("After using charAt method    : "+sb.charAt(0));

        //deletechartAt method
        sb.deleteCharAt(0);
        System.out.println("After using delete charAt method    : "+sb);
    }
}
