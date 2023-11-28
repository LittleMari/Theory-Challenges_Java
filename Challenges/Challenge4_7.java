/*
Create a class named "Challenge4_7.java".

WITHOUT using the “for” statement, create a program to calculate the “factorial” of an integer number.

You have to use "recursion", that is when a function call to itself.

Notes: The “factorial” of an integer number consists in multiplying all the decreasing integer numbers starting by the number up to the number 1. For example, the factorial of 5 (which is written as 5!) is:

5! = 5 x 4 x 3 x 2 x 1 = 120

For example, the factorial of 7 is:

7! = 7 x 6 x 5 x 4 x 3 x 2 x 1 = 5040

 */

public class Challenge4_7 {

    public static void main(String[] args) {
        System.out.println("The factorial number is "+ factorial(5));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
