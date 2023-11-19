
import java.util.Scanner;

/*
Create a class named "Challenge3_2.java".

At the beginning read from keyword two numbers and store them into variables.

Now fill the appropriate conditions in the “if statements” to make this program work:
 */
public class Challenge3_2 {
    // Read two numbers and put them into variables in here
    public static void main(String[] args) {  
        System.out.println("Introduzca el primer número: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Introduzca el segundo número: ");
        Scanner keyboard2 = new Scanner(System.in);
        int b = keyboard2.nextInt();
        if(b >= 0) {
        System.out.println("numero2 es positivo");
        }

        if(b >= a) {
            System.out.println ("numero1 no es mayor que numero2");
        }

        if(a < 0 && b < 0) {
            System.out.println ("tanto numero1 como numero2 son negativos");
        }

        if(a == 13 || b == 13) {
            System.out.println ("numero1 es trece o numero2 es trece");
        }
    }
}
