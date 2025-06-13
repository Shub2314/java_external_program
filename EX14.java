import java.awt.*;
public class EX14 extends Frame
{
    public EX14()  
    {
        MenuBar bar=new MenuBar();
        setMenuBar(bar);

        Menu color=new Menu("colors");
        bar.add(color);

        MenuItem red=new MenuItem("Red");
        color.add(red);

        MenuItem black=new MenuItem("Black");
        color.add(black);
        black.setEnabled(false);

        MenuItem green=new MenuItem("Green");
        color.add(green);
       
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
       new EX14();
    }
}
