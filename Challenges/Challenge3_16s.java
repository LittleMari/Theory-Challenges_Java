
import java.util.Scanner;

/*
s.[ADVANCED] Counting numbers in book sections.

Create a program that allows to the user to enter titles of books.

The program should finish when the user enters the string “*” (asterisk).

Each time that the user enters a slash “/” we consider that a section has finished and the program have to tell how many number digits (from 0 to 9) appeared in the titles of the books on this section.

Finally the program has to tell how many sections it has processed.

Example of execution:
Book: Los 3 mosqueteros
Book: Historia de 2 ciudades
Book: /
Section Finished. 2 number digits appeared.
Book: 20000 leguas de viaje submarino
Book: El señor de los anillos
Book: /
Section Finished. 5 number digits appeared.
Book: 20 años después
Book: *
End. 2 sections were processed
Fin. Se leyeron 2 líneas completas.
 */
public class Challenge3_16s {

    public static void main(String[] args) {
        String book = "";
        int numberOfNumbers = 0;
        int numberOfSections = 0;
        while (!book.equals("*")) {
            System.out.print("Book: ");
            Scanner keyboard = new Scanner(System.in);
            book = keyboard.nextLine();
            for (int i = 0; i <= book.length() - 1; i++) {
                for (int j = 0; j <= 9; j++) {
                    if (String.valueOf(book.charAt(i)).equals(String.valueOf(j))) {
                        numberOfNumbers = numberOfNumbers + 1;
                    }
                }
            }
            if (book.equals("/")) {
                System.out.print("Section Finished. " + numberOfNumbers + " number digits appeared.\n");
                numberOfSections = numberOfSections + 1;
                numberOfNumbers = 0;
            }
        }
        System.out.println("End. " + (numberOfSections) + " sections were processed.");
    }
}
