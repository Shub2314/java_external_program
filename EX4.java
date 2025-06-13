import java.util.*;
public class EX4 
{
     public static void main(String[] args) 
    {
        Vector<String> vec= new Vector<>();
        //add method
        vec.add("A");
        vec.add("B");
        vec.add("C");
        vec.add("D");
        System.out.println("After Using Add method :"+vec);

        //get method
        System.out.println("After Using Get method :"+vec.get(0));

        //remove method
        vec.remove(3);
        System.out.println("After Using Remove method :"+vec);

        //size method
        System.out.println("After Using Size method :"+vec.size());

        //set method
        vec.set(1,"D");
        System.out.println("After Using Set method :"+vec);

        //Clear method
        vec.clear();
        System.out.println("After Using Clear method :"+vec);
    }
}
