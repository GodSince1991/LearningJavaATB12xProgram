package ex_02_Java_Basics_Part2;

public class Lab014_Variables {
    public static void main(String[] args) {

        // how to create a variable?
        //we need a "data type variable_name = variable_value

        byte age = 65;
        // let's understand the above code
        // byte ---> data type, which is type of container we are using.
        // age ---> variable name / identifier
        // = ---> Assignment Operator
        // 65 ---> Variable Value / literal
// short age = 65 is also valid. But memory will be waster as short can store more value where as byte can store from -128 to 127

        age = 66;
        System.out.println(age); // output will always the latest value assigned

    }
}
