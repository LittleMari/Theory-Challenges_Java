
import java.util.Scanner;

/*
[BEGINNER] Is it a vowel.

Ask to the user for a String. If the String is a vowel (a, e, i, o, u) show the message “It is a vowel”, otherwise show “It is NOT a vowel”.

If the user enters more than one character, show an error informing that this is not possible.

Example of execution:

Please, enter a String:
i
It is a vowel

Example of execution:

Please, enter a String:
g
It is NOT a vowel

Example of execution:

Please, enter a String:
fa
This is not possible
 */
public class Challenge3_16e {

    public static void main(String[] args) {
        System.out.println("Enter a chracter: ");
        Scanner keyboard = new Scanner(System.in);
        String letter = keyboard.nextLine();
        letter = letter.toLowerCase();

        if (letter.length() >= 2) {
            System.out.println("This is not possible");
        } else if (letter.length() == 0) {
            System.out.println("You have to put something");
        } else {
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("u") || letter.equals("o")) {
                System.out.println("It is a vowel");
            } else {
                System.out.println("It is NOT a vowel");
            }
        }
    }
}
