
import java.util.Scanner;

/*
m.Is it a prime number?

Ask for a number to the user and tell if it is a “prime number” or not.
 */
public class Challenge3_16m {

    public static void main(String[] args) {
        System.out.println("Put a number: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        boolean primo = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                primo = false;
            }
        }
        if (number == 1) {
            System.out.println("It's a prime number");
        } else if (number == 0) {
            System.out.println("0 is not defined.");
        } else if (primo) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
    }

}
