import java.util.*;
public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for number A and B
        System.out.print("Enter the Number A   : ");
        int A = input.nextInt();

        System.out.print("Enter the Number B   : ");
        int B = input.nextInt();

        // 1. Integer toString(int i)
        System.out.println("Integer toString of A: " + Integer.toString(A));

        // 2. Integer toHexString(int i)
        System.out.println("Hexadecimal of A: " + Integer.toHexString(A));

        // 3. Integer toBinaryString(int i)
        System.out.println("Binary representation of A: " + Integer.toBinaryString(A));

        // 4. Integer toOctalString(int i)
        System.out.println("Octal representation of A: " + Integer.toOctalString(A));

        // 5. Integer.MAX_VALUE
        System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);

        // 6. Integer.MIN_VALUE
        System.out.println("Minimum value of Integer: " + Integer.MIN_VALUE);


        // 8. Integer.compareTo(Integer anotherInteger)
        Integer integerA = Integer.valueOf(68);
        Integer integerB = Integer.valueOf(78);
        System.out.println("Compare A and B using compareTo: " + integerA.compareTo(integerB));

        // 9. Integer.equals(Object obj)
        System.out.println("Is A equal to B using equals method: " + integerA.equals(integerB));

        // 10. Integer.reverse(int i)
        System.out.println("Reverse bits of A: " + Integer.reverse(A));

        // 12. Integer.byteValue()
        System.out.println("Byte value of A: " + integerA.byteValue());

        // 13. Integer.shortValue()
        System.out.println("Short value of A: " + integerA.shortValue());

        // 14. Integer.longValue()
        System.out.println("Long value of A: " + integerA.longValue());

        // 15. Integer.floatValue()
        System.out.println("Float value of A: " + integerA.floatValue());

        // 16. Integer.doubleValue()
        System.out.println("Double value of A: " + integerA.doubleValue());

    }
}
