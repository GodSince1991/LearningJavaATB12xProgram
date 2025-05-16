package ex_03_Literals;

public class Lab032_Char_Literals {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a to z, ~!@#$%^&*()_+ char can be anything
        System.out.println(c1);

        // char c = "A"; // "" == String ---> Bunch of characters

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space

        //Escape Char

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b'; // not used in automation
        char carriage_return = '\r'; // not used in automation

        System.out.println("JAGANKAMBALI");
        System.out.println("JAGAN"+new_line+"KAMBALI");
        System.out.println("JAGAN"+tab_line+"KAMBALI");
        System.out.println("JAGAN"+back_space+"KAMBALI"); // back_space will delete one character. Here N from JAGAN is deleted
        System.out.println(" ------------- ");
        System.out.println("JAGAN is old"+carriage_return+"KAMBALI"); // deletes more than a word
        System.out.println("JAGAN is"+carriage_return+"KAMBALI"); // deletes more than a word

        char c10 = 'A';

        // ASCII. (limited numbers) - A ---> 65
        // All characters have a assigned values as oer ASCII standards
        // Other language like hindi, chinese characters have Unicode created by jave people

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smiley = '\u1f60'; // :)
        System.out.println(my_laugh_smiley);




    }
}
