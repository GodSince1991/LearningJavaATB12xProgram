package ex_05_TypeCasting;

public class Lab058_TypeCasting_Example {
    public static void main(String[] args) {

        long phone_no = 9876543210l;
        // short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s); // 5866
    }
}
