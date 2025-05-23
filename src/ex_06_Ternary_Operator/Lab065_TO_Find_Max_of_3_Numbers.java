package ex_06_Ternary_Operator;

public class Lab065_TO_Find_Max_of_3_Numbers {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program
        //
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);

        // here is the breakdown
        /* int = data type
        max = variable name
        (n1 > n2) = condition
        (n1 > n3) ? n1 : n3 = expression1
        ((n2 > n3) ? n2 : n3) = expression2
         */

    }
}
