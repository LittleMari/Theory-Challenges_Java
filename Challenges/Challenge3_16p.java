
import java.util.Scanner;

/*
p.Sum positive numbers.

Read int numbers by keyboard, until the user enters the number 0.

Sum all the positive numbers and show the result.
 */
public class Challenge3_16p {

    public static void main(String[] args) {
        System.out.println("Put your numbers: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        int suma = 0;
        while (number != 0) {
            while (number < 0) {
                System.out.println("Try with a positive number: ");
                number = keyboard.nextInt();
            }
            if (number != 0) {
                suma = suma + number;
                number = keyboard.nextInt();
            }
        }
        System.out.println("La suma de tus numeros es: " + suma);
    }
}
