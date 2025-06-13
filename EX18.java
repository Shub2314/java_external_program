// Interface A
interface A 
{
    void displayA();
}
// Class B implements A
class B implements A {
    public void displayA() 
    {
        System.out.println("This is A");
    }

    void displayB() 
    {
        System.out.println("This is B");
    }
}
// Class C
class C {
    void displayC() 
    {
        System.out.println("This is C");
    }
}

// Class D extends B and uses C
class D extends B 
{
    C objC = new C();  

    void displayD() 
    {
        System.out.println("This is D");
    }

    void displayAll() 
    {
        displayA();     // from interface A via B
        displayB();     // from B
        objC.displayC(); // from C
        displayD();     // from D
    }
}
// Main class
public class EX18 {
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.displayAll();
    }
}
