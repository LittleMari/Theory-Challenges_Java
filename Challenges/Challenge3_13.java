
import java.util.Scanner;

/*
Create a class named "Challenge3_13.java".

Store in a variable the text introduced by the user by using the keyboard.

The program should say if the variable contains the word “hello” or not.
 */
public class Challenge3_13 {
    public static void main(String[] args) {
        System.out.print("Put a text: ");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        text = text.toLowerCase(); // Considero que para este ejercicio es importante no distinguir de mayusculas y minusculas
        if (text.indexOf("hello") != -1){
            System.out.println("Yes, 'Hello' is in the text");
        } else{
            System.out.println("No, text doesn't contains 'Hello'");
        }
    }
}
