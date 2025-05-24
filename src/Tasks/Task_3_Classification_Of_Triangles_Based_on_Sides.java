package Tasks;

import java.util.Scanner;

public class Task_3_Classification_Of_Triangles_Based_on_Sides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Take input for sides
//        System.out.print("Enter side A: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Enter side B: ");
//        int b = scanner.nextInt();
//
//        System.out.print("Enter side C: ");
//        int c = scanner.nextInt();
//
//        // Check for triangle validity using the triangle inequality theorem
//        if (a + b > c && a + c > b && b + c > a) {
//            // Check for Equilateral
//            if (a == b && b == c) {
//                System.out.println("The triangle is Equilateral.");
//            }
//            // Check for Isosceles
//            else if (a == b || b == c || a == c) {
//                System.out.println("The triangle is Isosceles.");
//            }
//            // If none are equal
//            else {
//                System.out.println("The triangle is Scalene.");
//            }
//        } else {
//            System.out.println("The given sides do not form a valid triangle.");
//        }
//
//        scanner.close();

        System.out.print("Enter side A: ");
        int a = scanner.nextInt();

        System.out.print("Enter side A: ");
        int b = scanner.nextInt();

        System.out.print("Enter side A: ");
        int c = scanner.nextInt();

        if(a==b && b==c) {
            System.out.println("The Triangle is Equilateral Triangle");
        }
            else if(a == b || b == c || a == c){
                System.out.println("The Triangle is Isosceles Triangle");
            }
            else {
            System.out.println("The Triangle is Scalene Triangle");
        }

        }


    }

