package ex_06_Ternary_Operator;

public class Lab066_TO_Age_Classification {
    public static void main(String[] args) {

        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        String user_input = args[2]; // in the arguments these are the values: 35 17 68 20
        System.out.println(user_input instanceof String); //true
        System.out.println(user_input); //prints the values given in the arguments

        int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "pramod"
        System.out.println(age);

        String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);

    }
}
