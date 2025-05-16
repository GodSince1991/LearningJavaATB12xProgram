package ex_02_Java_Basics_Part2;

public class Lab023_printF {
    public static void main(String[] args) {
        int a = 10;
       // System.out.println(a);
       // System.out.printf("Your variable is %d" , a); // here %d replaces the data assigned to the variable a
        // %d ---> used for int, byte, long, short data types
        // %s ---> used for string
        // %f ---> used for float and double
        // %b ---> used for boolean

        int b = 20;
        System.out.printf("%d + %d", a, b);
        System.out.println();
        System.out.printf("a value is %d, b value is %d", a, b);
        System.out.println();
        System.out.printf("your value a: %d, your value b: %d", a,b);
        System.out.println();
        System.out.printf("a = %d, b = %d", a, b);
        System.out.println();
        System.out.println("a = " + a + ", b = " + b); // we can use println as well to print the same line a = 10, b = 20
        // but it is a bit complicated. Hence, we need to use printf.
    }
}
