public class Demo 
{int real,img;

    public Demo(int r,int i) 
    {
        real=r;img=i;
    }

    public Demo(Demo a,Demo b) 
    {
        real=a.real+b.real;
        img=a.img+b.img;
    }
    public void show()
    {
        System.out.println(real+"+"+img+"i");
    }

    public static void main(String[] args) {
        Demo ob1 =new Demo(2, 3);
        Demo ob2=new Demo(4, 7);
        Demo ob3=new Demo(ob2, ob2) ;
        ob3.show();
    }
    

}
