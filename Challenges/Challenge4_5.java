/*
Create a function to calculate the minimum of two numbers.

Use the function created in the previous challenge to ask for 2 numbers to the user and pass these 2 numbers to the function to calculate the minimum.
 */
public class Challenge4_5 {
    public static void main(String[] args) {
        int number1 = Challenge4_4.keyboard();
        int number2 = Challenge4_4.keyboard();
        System.out.println("The minimum is: " + minimum(number1,number2));
    }
    public static int minimum (int number1, int number2){
        if (number1 < number2){
            return number1;
        } else {
            return number2;
        }
    }
}
