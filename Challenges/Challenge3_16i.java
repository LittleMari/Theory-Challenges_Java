
import java.util.Scanner;

/*
i.[BEGINNER] Number of euros and number of decimals.

Write a program which store in a String the price in euros with 2 decimals entered by the user.

Print in screen the number of euros and the number of decimals.

Example of execution:

Enter a price in euros:
137.22
The number of euros is:
137
The number of cents is:
22
 */
public class Challenge3_16i {

    public static void main(String[] args) {
        System.out.println("Enter a price in euros: ");
        Scanner keyboard = new Scanner(System.in);
        String price = keyboard.nextLine();
        int indexPoint = price.indexOf(".");
        String euros = "";
        String cents = "";
        for (int i = 0; i < indexPoint; i++) {
            euros = euros + price.charAt(i);
        }
        for (int j = indexPoint + 1; j < price.length(); j++) {
            cents = cents + price.charAt(j);
        }
        System.out.println("The number of euros is: " + euros);
        System.out.println("The number of cents is: " + cents);
    }
}
