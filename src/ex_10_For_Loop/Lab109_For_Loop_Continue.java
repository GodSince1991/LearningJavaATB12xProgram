package ex_10_For_Loop;

public class Lab109_For_Loop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 50 ; i++) {
            if(i == 5 ) {
                continue;   // Continue basically acts as skip
            }
            System.out.println(i);
        }

    }
}
