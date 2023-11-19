
import java.util.Scanner;

/*
Create a class named "Challenge3_11.java".

Store in a variable the text introduced by the user by using the keyboard.

Print this text in uppercase, lowercase and say how many characters does the text have.
 */
public class Challenge3_11 {
    public static void main(String[] args) {
        System.out.print("Put a text: ");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        System.out.println("Uppercase text: " + text.toUpperCase());
        System.out.println("Lowercase text: " + text.toLowerCase());
        System.out.println("Number of characters: " + text.length());
    }
}
