package ex_11_While;

public class Lab117_While_Check {
    public static void main(String[] args) {

        int i = 0;
        while (i < 0) {
            System.out.println(i); // no output as the conditions has failed.
            i++;
        }
    }
}
