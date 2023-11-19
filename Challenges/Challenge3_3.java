
import java.util.Scanner;

/*
Create a class named "Challenge3_3.java".

Create two variables to store two numbers. The user should supply this numbers by using the keyboard.

By using the if..else statements, show a message on screen telling if the first number is smaller than, equal to or greater than the second one.
 */
        
public class Challenge3_3 {
    public static void main(String[] args) {
        System.out.println("Introduzca el primer número: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Introduzca el segundo número: ");
        Scanner keyboard2 = new Scanner(System.in);
        int b = keyboard2.nextInt();
        if (a < b){
            System.out.println("El primer número es menor que el segundo");
        }
        else if (a == b){
            System.out.println(" El primer número es igual al segundo");
        }
        else {
            System.out.println("El primer número es mayor que el segundo");
        }
    }
}
