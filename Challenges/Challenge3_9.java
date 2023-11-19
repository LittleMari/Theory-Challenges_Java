
import java.util.Scanner;

/*
Create a class named "Challenge3_9.java".

By using the “while” statement, make a program which stores in a variable a secret number between 1 and 10. 
The program will ask to the user a number to guess the secret number. Each time the user enters a number, 
the program have to indicate if the number entered by the user is smaller than, equal to ,
greater than the secret number or if the user has guessed the right number (in this case, the program should finish).
 */
public class Challenge3_9 {
    public static void main(String[] args) {
        System.out.print("Try to know what is my number: ");
        Scanner keyboard = new Scanner(System.in);
        int a = 0;
        int random_int = (int)Math.floor(Math.random() * (10) + 1);
        while (a != random_int){
            a = keyboard.nextInt();
            if (a == random_int){
                System.out.println("You did it!");}
            else if(a>=11 || a<=0){
                System.out.println("You have to introduce a number between 1 and 10");}
            else if(a < random_int){
                System.out.println("Your number is smaller than mine. Try again ");}
            else if(a > random_int){
                System.out.println("Your number is bigger than mine. Try again ");}            
            }
        }        
    }

