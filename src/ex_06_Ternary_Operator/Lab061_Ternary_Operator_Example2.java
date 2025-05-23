package ex_06_Ternary_Operator;

public class Lab061_Ternary_Operator_Example2 {
    public static void main(String[] args) {

        int number = 5;
        String result = number > 0 ? "positive" : "negative";
        // int result = number > 0 ? "positive" : "negative"; this shows error as the output is string type and data type is integer
        System.out.println(result);
    }
}
