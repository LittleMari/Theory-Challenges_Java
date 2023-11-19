
import java.util.Scanner;

/*
q.Which one is the greatest.

Read positive numbers by the keyboard until the user enters a non positive number.

Tell which one of them was the greatest.
 */
public class Challenge3_16q {

    public static void main(String[] args) {
        System.out.println("Put your numbers: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int greatest = 0;
        while (number >= 0) {
                if (number > greatest){
                    greatest = number;
                }
                number = keyboard.nextInt();
        }
        System.out.println("The greatest is " + greatest);
    }
}
