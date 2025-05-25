package ex_10_For_Loop;

public class Lab110_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue; //skips all the even numbers
            }
            System.out.println("Odd -> " + i);
        }
    }
}
