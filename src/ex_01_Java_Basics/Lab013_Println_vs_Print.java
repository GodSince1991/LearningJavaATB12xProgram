package ex_01_Java_Basics;

public class Lab013_Println_vs_Print {
    public static void main(String[] args) {

        System.out.println("Hi"); //new line
        System.out.println("Bye");

        System.out.print("Hi");
        System.out.print("Bye"); //as we did not use ln beside print, both Hi and Bye will show in same line
    }
}
