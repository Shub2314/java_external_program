class A extends Thread 
{
    public void run()
    {
    for(int i =0; i<=20; i++)
    {
        System.out.println("A send messages :"+i);
    }
    }
}
class B extends Thread 
{
    public void run()
    {
    for(int i =0; i<=20; i++)
    {
        System.out.println("B send messages :"+i);
    }
    }
}
class C extends Thread 
{
    public void run()
    {
    for(int i =0; i<=20; i++)
    {
        System.out.println("c send messages :"+i);
    }
    }
}
public class EX10 
{
    public static void main(String[] args) 
    {
        A a =new A();
        B b =new B();
        C c=new C();
        a.start();
        b.start();
        c.start();
    }    
}