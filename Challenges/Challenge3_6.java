
import java.util.Scanner;

/*
Create a class named "Challenge3_6.java".

By using the “for” statement, create a program to calculate the “factorial” of an integer number.

Notes: The “factorial” of an integer number consists in multiplying all the decreasing integer numbers starting by the number up to the number 1. For example, the factorial of 5 (which is written as 5!) is:

5! = 5 x 4 x 3 x 2 x 1 = 120

For example, the factorial of 7 is:

7! = 7 x 6 x 5 x 4 x 3 x 2 x 1 = 5040
 */
public class Challenge3_6 {
    public static void main(String[] args) {
        System.out.println("Give me a number for do his refactorial: ");
        Scanner keyboard = new Scanner(System.in);
        long a = keyboard.nextInt();
        long b = 1;
        System.out.print(a+"!= ");
        for (long i=a ;i>=1; i--){
            b = (i*b);
            if (i==1){
            System.out.print(i + " = " + b);}    
            else{
            System.out.print(i + "x");}      
        }
    }
}
