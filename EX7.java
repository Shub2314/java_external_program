 class A
{
    void m1()
   {
             System.out.println("i am Grand father");
   }
}
class B extends A
{
    void m2()
   {
             System.out.println("i am father");
   }
}
class C extends B
{
    void m3()
   {
             System.out.println("i am son");
   }
}

public class EX7 
{
    public static void main(String[] args) 
    {
        C ob=new C();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}
