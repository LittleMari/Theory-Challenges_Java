
import java.util.Scanner;

/*
Create a class named "Challenge3_12.java".

Store in a variable the text introduced by the user by using the keyboard.

Say if the value of this variable is composed only by uppercase letters, by lowercase letters or by a mix of both of them.
 */
public class Challenge3_12 {

    public static void main(String[] args) {
        System.out.print("Put a text: ");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        if (text.toLowerCase().equals(text.toUpperCase())) {
            System.out.println("Your text is numbers or special chracters");
        } else if ((text.equals(text.toLowerCase()))) {
            System.out.println("It's in lowercase");
        } else if (text.equals(text.toUpperCase())) {
            System.out.println("It's in uppercase");
        } else {
            System.out.println("It's a mix");
        }
    }
}
