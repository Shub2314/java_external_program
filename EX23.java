import java.awt.*;
import  javax.swing.*;
public class EX23 extends JFrame
{
   JButton b1,b2,b3,b4,b5;
    public EX23() 
    {
        b1=new JButton("North");
        b2=new JButton("South");
        b3=new JButton("East");
        b4=new JButton("West");
        b5=new JButton("Center");
        
        setLayout(new BorderLayout(3,5));
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
                new EX23(); 
    }
    
}
