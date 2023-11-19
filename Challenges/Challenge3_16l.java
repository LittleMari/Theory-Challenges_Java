
import java.util.Scanner;

/*
l.[BEGINNER] Print odd numbers.

Ask for a positive number to the user and print all “odd” numbers (1,3,5,7,…) from 1 to the number separated by commas.
 */
public class Challenge3_16l {

    public static void main(String[] args) {
        System.out.println("Put a positive number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("Odd numbers from 1 to your number: ");
        for (int i = 1; i != number +1; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
