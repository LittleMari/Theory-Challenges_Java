
import java.util.Scanner;

/*
Create a class named "Challenge3_14.java".

Store in a variable the text introduced by the user by using the keyboard.

Imagine we are going to use this text as a password. We have to say if this password has at least one character in lowercase and one character in uppercase.

b) [OPTIONAL] We have to say if this password has at least one character in lowercase, one character in uppercase and one character which is not a letter (special char, numbers…)
 */
public class Challenge3_14 {
    //a) y b)
    public static void main(String[] args) {
        System.out.print("Put a text: ");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        String textLowerCase = text.toLowerCase();
        String textUpperCase = text.toUpperCase();

        if (text.equals(textLowerCase)) {
            System.out.println("It doesn't contains a Uppercase letter");
        } else {
            System.out.println("It contains a Uppercase letter");
        }
        if (text.equals(textUpperCase)) {
            System.out.println("It doesn't contains a lowercase letter");
        } else {
            System.out.println("It contains a lowercase letter");
        }
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char letterLowerCase = (textLowerCase.charAt(i));
            char letterUpperCase = (textUpperCase.charAt(i));
            if (letterLowerCase == letterUpperCase) {
                index = index + 1;
            }
        }
        if (index != 0) {
            System.out.println("It contains a char or a number");
        } else {
            System.out.println("It doesn't contain a char and a number");
        }
    }
}
