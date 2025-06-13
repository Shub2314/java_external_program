import javax.swing.*;
public class EX21 extends JFrame
{
    public EX21()
    {
        JTextArea t=new JTextArea(10,10);
        t.setText("ahjggsgjhgsg .\n".repeat(10));
        JScrollPane s= new JScrollPane(t);
        add(s);
        setSize(100,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    public static void main(String[] args) 
    {
        new EX21();
    }
}

