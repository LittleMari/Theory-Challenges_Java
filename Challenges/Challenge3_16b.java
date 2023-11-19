
import java.util.Scanner;

/*
b.     Comparing 3 numbers.

Read 3 numbers by the keyboard. Tell which number is the greater.
 */
public class Challenge3_16b {

    public static void main(String[] args) {
        System.out.println("Put your first number: ");
        Scanner keyboard = new Scanner(System.in);
        Integer number1 = keyboard.nextInt();
        System.out.println("Put your second number: ");
        Integer number2 = keyboard.nextInt();
        System.out.println("Put your third number: ");
        Integer number3 = keyboard.nextInt();
        int greater = 0;
        if (number1 < number2 && number3 < number2) {
            greater = number2;
        } else if (number1 > number3){
            greater = number1;
        }else{
            greater = number3;
        }
        System.out.println("The greater number is " + greater);
    }
}
