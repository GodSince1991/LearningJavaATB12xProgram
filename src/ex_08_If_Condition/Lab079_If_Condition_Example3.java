package ex_08_If_Condition;

public class Lab079_If_Condition_Example3 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]); // values are in program arguments
        if (age > 25){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");
        }

    }
}
