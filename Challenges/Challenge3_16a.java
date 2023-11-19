
import java.util.Scanner;

/*
a.      [BEGINNER] Calculating the daily salary of a worker.

Ask to the user for the number of working hours during the day and the cost per hour.

Show the corresponding payment for this day.
 */
public class Challenge3_16a {
    public static void main(String[] args) {
        System.out.println("Put your hours working: ");
        Scanner keyboard = new Scanner(System.in);
        Integer hours = keyboard.nextInt();
        System.out.print("Put your cost per hour in €: ");
        Scanner keyboard2 = new Scanner(System.in);
        Integer cost = keyboard2.nextInt();
        
        System.out.println("Your payment is " + (hours * cost) + "€");
    }
}
