import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter something: ");

        //what the person enters into the comand line
        String userInput = input.nextLine();

        System.out.print("You Entered: ");

        System.out.println("\"" + userInput + "\"");

        //see if the users input is a number or not
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " This is a number");
        }else{
            System.out.println(userInput + " is not a number");
        }

        //flippes the casing of the text
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        //reverses the order of what the user entered
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
