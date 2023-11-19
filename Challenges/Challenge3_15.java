
import java.util.Scanner;

/*
Create a class named "Challenge3_15.java".

Store in a variable the text introduced by the user by using the keyboard.

The program should say whether this text is a palindrome or not.

A palindrome is a text which can be read in the same way from left to right than from right to left.

An example of a simple palindrome is:

level

More complex palindrome are:

La ruta nos aporto otro paso natural

Was it a car or a cat I saw
 */
public class Challenge3_15 {

    public static void main(String[] args) {
        System.out.print("Put a text: ");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        text = text.toLowerCase();
        String textoSinEspacios = "";
        String textoAlReves = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                textoSinEspacios = textoSinEspacios + text.charAt(i);
                textoAlReves = text.charAt(i) + textoAlReves;
            }
        }
        if (textoSinEspacios.equals(textoAlReves)) {
            System.out.println("Your text is a palindrome");
        } else {
            System.out.println("Your text is not a palindrome");
        }
    }
}
