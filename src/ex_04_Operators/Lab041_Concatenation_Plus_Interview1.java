package ex_04_Operators;

public class Lab041_Concatenation_Plus_Interview1 {
    public static void main(String[] args) {

        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // PramodDutta1010
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name + last_name + (a + b));

        /*BODMAS
        Letter	Meaning	                Example
        B	    Brackets	            (2 + 3) × 4
        O	    Orders(powers, roots)	2² = 4, √16 = 4
        D	    Division	            20 ÷ 4 = 5
        M	    Multiplication	        3 × 2 = 6
        A	    Addition	            5 + 2 = 7
        S	    Subtraction	            9 - 4 = 5
         */

    }
}
