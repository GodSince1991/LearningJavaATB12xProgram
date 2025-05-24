package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch_Example3_InterviewQ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
        // in case the user gives the input 3 then, the program runs. But nothing is printed as output.

    }
}
