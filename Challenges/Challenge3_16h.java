
import java.util.Scanner;

/*
h.Changing to uppercase a vowel in a sentence.

Ask for a sentence (phrase) to the user.

Ask for a vowel to the user (store it as an String).

Show the same sentence but with the vowel entered by the user in uppercase.

Tip: to convert a chart to an String you can use (in this way, you can compare a character with an String):

char letra = 'a';
String letraString = String.valueOf(letra);

Example of execution:

Enter a sentence:
En un lugar de la Mancha
Enter a vowel:
a
En un lugAr de lA MAnchA

 */
public class Challenge3_16h {

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        System.out.println("Enter a vowel: ");
        String vowel = keyboard.nextLine();
        String textChanged = "";
        String textUpper = text.toUpperCase();
        vowel = vowel.toLowerCase();
        if ((vowel.equals("a")) || (vowel.equals("e")) || (vowel.equals("i")) || (vowel.equals("o")) || (vowel.equals("u"))) {
            for (int i = 0; i <= text.length() - 1; i++) {
                String chari = String.valueOf(text.charAt(i));
                if (vowel.equals(chari)) {
                    textChanged = textChanged + textUpper.charAt(i);
                } else {
                    textChanged = textChanged + text.charAt(i);
                }
            }
            System.out.println(textChanged);
        } else {
            System.out.println("You have to put only a vowel");
        }
    }
}
