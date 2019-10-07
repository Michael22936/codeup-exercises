import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter something: ");

        String userInput = input.nextLine();

        System.out.print("You Entered: ");

        System.out.println(userInput);

        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " This is a number");
        }else{
            System.out.println(userInput + " is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
