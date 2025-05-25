package Tasks;

import java.util.Scanner;

public class Task_5_Factorial_Of_a_Number {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int fact = 1;
//        if( n == 0){
//            fact = 1;
//        }
//
//        if(n > Integer.MAX_VALUE){ // if(n > 2147483647){
//            System.out.println("I can't handle the number > Max of Int");
//        }
//
//
//        for (int i = 1; i <= n ; i++) {
//            fact = fact*i;
//        }
//
//        System.out.println(fact);
//    }
//}
        Scanner scanner = new Scanner(System.in);
        //Read input from user
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        // Factorial is only defined for non-negative integers
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int fact = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        // Output the result
        System.out.println("Factorial of " + n + " is: " + fact);


    }
}