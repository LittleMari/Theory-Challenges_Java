
import java.util.Scanner;

/*
f.Writing the name of a person with lowercase, lowercase and initials in upper.

Ask for the full name of a person.

Write the name in lowercase, in uppercase and with the initial letter of each word in Uppercase.

Example of execution:

Enter the full name of a person:
AITOR Tilla Segura
Minúsculas:
aitor tilla segura
Mayúsculas:

AITOR TILLA SEGURA
Iniciales mayúsculas:
Aitor Tilla Segura
 */
public class Challenge3_16f {

    public static void main(String[] args) {
        System.out.println("Put your full name");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        String textLower = text.toLowerCase();
        String textUpper = text.toUpperCase();
        String textInicials = "";

        for (int i = 0; i < text.length(); i++) {
            if (i == 0) {
                textInicials = textInicials + textUpper.charAt(i);
            } else if (text.charAt(i - 1) != ' ') {
                textInicials = textInicials + textLower.charAt(i);
            } else {
                textInicials = textInicials + textUpper.charAt(i);
            }
        }
        if (textUpper.equals(textLower)) {
            System.out.println("You have to put your name");
        } else {
            System.out.print("Lowercase:\n" + textLower + "\nUppercase:\n" + textUpper + "\nUppercase inicial letter:\n" + textInicials);
        }

    }
}
