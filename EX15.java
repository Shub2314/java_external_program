import java.awt.GridLayout;
import javax.swing.*;
public class EX15 extends JFrame 
{
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;;
    public EX15() 
    {
        // Create buttons
        b1 = new JButton("A");
        b2 = new JButton("B");
        b3 = new JButton("C");
        b4 = new JButton("D");
        b5 = new JButton("E");
        b6 = new JButton("F");
        b7 = new JButton("G");
        b8 = new JButton("H");
        b9 = new JButton("I");
        b10 = new JButton("J");

        // Set layout
        setLayout(new GridLayout(5, 5)); 

        // Add buttons to frame
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);

        // Frame settings
        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
        new EX15(); 
    }
}
