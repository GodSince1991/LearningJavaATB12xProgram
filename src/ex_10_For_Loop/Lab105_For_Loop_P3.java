package ex_10_For_Loop;

public class Lab105_For_Loop_P3 {
    public static void main(String[] args) {

        for (int i = -1; i > -10 ; i--) {
            System.out.println(i);
        }

        int i = 10; //we can initialize outside the for statement like this
        for (; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
