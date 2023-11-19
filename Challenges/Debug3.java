/*
c.      Debug3.java.

Ask to the user for the name of 2 persons and store them into variables.

Then you have to print “coincidence” if the names of both persons start by the same letter or if they finish by the same letter. 
In any other case, print “there is NO coincidence”.

Example of execution:

Enter the name of person 1:
Emilio
Enter the name of person 2:
Eugenia
coincidence

Example of execution:

Enter the name of person 1:
Emilio
Enter the name of person 2:
Fernando
coincidence

Example of execution:

Enter the name of person 1:
Emilio
Enter the name of person 2:
Felipe
there is NO coincidence

 */

import java.util.Scanner;

public class Debug3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el primer nombre:");
        String nombre1 = keyboard.nextLine();
        System.out.println("Introduce el segundo nombre:");
        String nombre2 = keyboard.nextLine();
        char inicial1 = nombre1.charAt(0);
        char inicial2 = nombre2.charAt(0);
        int longitud1 = nombre1.length();
        int longitud2 = nombre2.length();
        char final1 = nombre1.charAt(longitud1 - 1);
        char final2 = nombre2.charAt(longitud2 - 1);
        if (inicial1 == inicial2 || final1 == final2) {
            System.out.println("Coincidence");
        } else {
            System.out.println("There is NO coincidence");
        }
    }
}
