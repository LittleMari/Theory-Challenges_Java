
import java.util.Scanner;

/*
n.[BEGINNER] Number of times that a letter is in a sentence.

Ask to the user for a sentence (phrase).

Ask to the user for a letter.

Tell the number of times that this letter is in the sentence.

Tip: to convert a chart to an String you can use (in this way, you can compare a character with an String):

char letra = 'a';
String letraString = String.valueOf(letra);

Example of execution:

Enter a sentence:
Hola caracola
Enter a letter:
a
The number of times that the letter is in the sentence is:
4
 */
public class Challenge3_16n {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner keyboard = new Scanner (System.in);
        String sentence = keyboard.nextLine();
        System.out.println("Enter a letter: ");
        String letter = keyboard.nextLine();
        sentence = sentence.toLowerCase();
        letter = letter.toLowerCase();
        int contador = 0;
        for (int i = 0; i < sentence.length(); i++){
            String letterInSentence = String.valueOf(sentence.charAt(i));
            if (letterInSentence.equals(letter)){
                contador = contador + 1;
        }
        }
        System.out.println("The number of times that the letter is in the sentence is: " + contador);
    }
}
