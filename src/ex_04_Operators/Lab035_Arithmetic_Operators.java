package ex_04_Operators;

public class Lab035_Arithmetic_Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println("a+b");
        System.out.println(a+b);
        System.out.println(a%b);
        System.out.println(b%a); //in this case the modulus will be 3 as 20 does not go in 3, entire 3 will be the remainder

    }
}
