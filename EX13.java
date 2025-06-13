import java.awt.*;
public class EX13 extends Frame 
{
    public EX13() 
    {
        // 1 Frame setup
        setSize(500, 500);
        setTitle("Frame");
        setLayout(null); 
        setVisible(true);

        // 2 Label
        Label L = new Label("Label");
        L.setBounds(50, 50, 100, 30);
        add(L); 

        // 3 Button
        Button B = new Button("Button");
        B.setBounds(50, 100, 100, 30);
        add(B);

        // 4 TextField
        TextField TX = new TextField("TextField");
        TX.setBounds(50, 150, 150, 30);
        add(TX);

        // 5 TextArea
        TextArea TA = new TextArea("TextArea ".repeat(3));
        TA.setBounds(50, 200, 200, 60);
        add(TA);

        // 6 Checkboxes
        Checkbox Ch1 = new Checkbox("ch1", true);
        Ch1.setBounds(50, 280, 100, 30);
        add(Ch1);
        Checkbox Ch2 = new Checkbox("ch2", false);
        Ch2.setBounds(50, 320, 100, 30);
        add(Ch2);

        // 7 Choice
        Choice co = new Choice();
        co.add("one");
        co.add("two");
        co.add("three");
        co.setBounds(50, 360, 100, 30);
        add(co);

        // 8 List
        List li = new List();
        li.add("item 1");
        li.add("item 2");
        li.add("item 3");
        li.setBounds(50, 400, 100, 60);
        add(li);

       // 9 MenuBar
       MenuBar bar=new MenuBar();
       setMenuBar(bar);
       Menu f=new Menu("file");
       Menu e=new Menu("exit");
       bar.add(f);
       bar.add(e);
    }
    public static void main(String[] args) 
    {
        new EX13();
    }
}
