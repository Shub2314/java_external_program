

class EX6 
{
    int real, imag;
    EX6(int r, int i) 
    { 
        real = r; imag = i; 
    }

    EX6(EX6 a, EX6 b) 
    {
        real = a.real + b.real;
        imag = a.imag + b.imag;
    }

    void show() 
    {
        System.out.println(real + " + " + imag + "i");
    }
    public static void main(String[] args) 
    {
        EX6 c1 = new EX6(1, 2); 
        System.out.print("no1 :");
        c1.show();
        EX6 c2 = new EX6(5, 8);
        System.out.print("no2 :");
        c2.show();
        EX6 c3=new EX6(c1, c2);
        System.out.print("sum :");
        c3.show();  
    }
}
