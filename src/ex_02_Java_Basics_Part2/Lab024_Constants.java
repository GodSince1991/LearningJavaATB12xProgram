package ex_02_Java_Basics_Part2;

public class Lab024_Constants {
    public static void main(String[] args) {
       // int a;
        //System.out.println(a); // a is a local variable here and default value of the local variable is not assigned by JVM
        //local variable must be initialized before using


       // final int b = 10; //final value of the variable cannot be changed
        //b = b+1; // is not allowed due to the assignment of final value to the variable.
        //b = 11; // even though if we modify and try to get out put, ERROR: "java: cannot assign a value to final variable b"
        //System.out.println(b);

        final float PI = 3.14f;
        //PI = 90 // cannot be modified once we assign final value to the variable
        final float PI2 = 3.15f;
        final float PI3 = 3.16f;
        System.out.println(PI3);

        /* Constant is something that its value cannot be changed.
        If you want to make something constant then you have to use 'final' keyword
         */


    }
}
