
import java.util.Scanner;

/*
Create a new function to ask to the user for an integer number (introduced by keyboard). The function should return the value introduced by the user. 
Call the function twice (2 times) to get 2 integer values.
Create a second function to calculate the area of a rectangle. Pass to this function, the values that the user have entered by keyboard.
b) Modify the function to enter an integer value to prevent the user from entering negative values.
 */

public class Challenge4_4 {

    public static void main(String[] args) {
        int height = keyboard();
        int width = keyboard();
        System.out.println("The area is: " + area(height, width));
    }

    public static int keyboard() {

        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Introduce a number: ");
            number = keyboard.nextInt();
            if (number < 0){
                System.out.println("You have to introduce a positive number");
            }
        } while (number < 0);
        return number;
    }

    public static int area(int heigth, int width) {
        return heigth * width;
    }
}
