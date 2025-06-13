public class EX20 
{
    // Method to calculate the area of a square
    public int area(int side) 
    {
        return side * side;
    }
    // Method to calculate the area of a rectangle
        public int area(int length, int width) 
    {
        return length * width;
    }
    public static void main(String[] args) 
    {
        EX20 ob=new EX20();
        int square=ob.area(5);
        System.out.println("Area of square: " +square);
        int rectangle=ob.area(6, 4);
        System.out.println("Area of rectangle: " + rectangle); 
    }
}
