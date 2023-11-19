/*
b.      Debug2.java.

By using the “while” statement, make a program which stores in a variable a secret number between 1 and 10. 
The program will ask to the user a number to guess the secret number. Each time the user enters a number,
the program have to indicate if the number entered by the user is smaller than, equal to ,
greater than the secret number or if the user has guessed the right number (in this case, the program should finish).

 */

import java.util.Scanner;

public class Debug2 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = 7;
        int respuesta = 0;
        while (respuesta != secretNumber) {
            System.out.println("Introduzca un número:");
            respuesta = keyboard.nextInt();
            if (respuesta < secretNumber) {
                System.out.println("El número que buscamos es mayor");
            } else if (respuesta > secretNumber) {
                System.out.println("El número que buscamos es menor");
            } else {
                System.out.println("Has acertado");
            }
        }
    }
}
