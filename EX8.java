interface Vehicle 
{
    void start();
    void stop();
}

interface Electric 
{
    void charge();
}

class ElectricCar implements Vehicle, Electric 
{    
    public void start() 
    {
        System.out.println("The electric car has started.");
    }
  
    public void charge() 
    {
        System.out.println("The electric car is charging.");
    }
    
    public void stop() 
    {
        System.out.println("The electric car has stopped.");
    }
}

public class EX8  
{
    public static void main(String[] args) {
        ElectricCar c = new ElectricCar(); 
        c.start();  
        c.charge(); 
        c.stop();   
    }
}