
import java.util.Scanner;

/*
o.[ADVANCED] “Goya chicken”.

In “Goya Chicken” shop we can buy nuggets in packages of 4, 7 or 10 units.

Ask to the user for a number of nuggets and tell if it is possible to buy this exact number of nuggets at “Goya Chicken”.

For example, we can buy 27 nuggets (2 packages of 10 and one of 7), but it is not possible to buy 13 nuggets exactly.
 */
public class Challenge3_16o {

    public static void main(String[] args) {
        System.out.println("How many nuggets do you want? ");
        Scanner keyboard = new Scanner(System.in);
        int numberNuggets = keyboard.nextInt();
        boolean posible = false;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i * 10 <= numberNuggets; i++) {
            for (int j = 0; j * 7 <= numberNuggets; j++) {
                for (int k = 0; k * 4 <= numberNuggets; k++) {
                    if (i * 10 + j * 7 + k * 4 == numberNuggets) {
                        a = i;
                        b = j;
                        c = k;
                        posible = true;
                    }
                }
            }
        }
        if (!posible) {
            System.out.println("It's imposible to buy " + numberNuggets + " exactly.");
        } else {
            System.out.println(a + " packages of 10, " + b + " packages of 7 and " + c + " packages of 4.");
        }
    }
}
