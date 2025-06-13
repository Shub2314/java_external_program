import java.awt.event.*;
import javax.swing.*;
public class EX16 extends JFrame implements ActionListener 
{
     JTextField textField;
     JButton button;
     JLabel label;
    public EX16() 
    {
        // Create components
        label = new JLabel("Enter text and click the button:");
        label.setBounds(50, 50, 50, 30);
        textField = new JTextField();
        textField.setBounds(50, 100, 50, 30);
        button = new JButton("Submit");
        button.setBounds(50, 150, 50, 30);
        // Add ActionListener to Button
        button.addActionListener(this);
        // Set up JFrame properties
        add(label);
        add(textField);
        add(button);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        label.setText("You entered: " + textField.getText());
    }
    public static void main(String[] args) 
    {
        new EX16();
    }
}
