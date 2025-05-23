package ex_08_If_Condition;

public class Lab077_If_Condiion_Example {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]); //values are added using CLI (Command line method i.e. in edit configurations
        if(age > 18){
            System.out.println("You can vote!");
        }else {
            System.out.println("You can't vote!");
        }

    }
}
