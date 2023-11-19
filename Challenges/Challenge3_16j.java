
import java.util.Scanner;

/*
j.[ADVANCED] Shopping list.

The user have to introduce by keyboard the list of products in a shopping list separated by commas.

Show each product in a different line.

Example of execution:

Enter the shopping list:
bananas,tomato,chocolate,pizza
Shopping list with each product in different line:
bananas
tomato
chocolate
pizza
 */
public class Challenge3_16j {

    public static void main(String[] args) {
        System.out.println("Enter the shopping list: ");
        Scanner keyboard = new Scanner(System.in);
        String list = keyboard.nextLine();
        System.out.println("Shopping list with each product in different line:");
        while (list.indexOf(',') != -1) {
            int indexComa = list.indexOf(',');
            String elemento = list.substring(0, indexComa);
            System.out.println(elemento);
            list = list.substring(indexComa + 1);
        }
        System.out.println(list);
    }
}
