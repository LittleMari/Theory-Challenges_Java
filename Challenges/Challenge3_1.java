
/*
Take the class named "Challenge2_3.java" of the calculator, duplicate it and rename the duplicate as "Challenge3_1.java".

Modify the code to read the two variables from keyboard.

a) Read them as integers.

b) Read them as doubles.
*/
import java.util.Scanner;
//a)
public class Challenge3_1 {

    public static void main(String[] args) {
        System.out.println("Introduzca el primer número: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Introduzca el segundo número: ");
        Scanner keyboard2 = new Scanner(System.in);
        int b = keyboard2.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
/*b)
public class Challenge3_1 {
    
    public static void main (String[] args) {
        System.out.println("Introduzca el primer número: ");
        Scanner keyboard = new Scanner(System.in);
        double a = keyboard.nextDouble();
        System.out.println("Introduzca el segundo número: ");
        Scanner keyboard2 = new Scanner(System.in);
        double b = keyboard2.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

    }
}
*/