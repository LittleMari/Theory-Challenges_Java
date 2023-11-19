
import java.util.Scanner;

/*
r.[ADVANCED] “Odd” number triangle.

Ask to the user for a number of rows.

Write a program to show a triangle like the following (this is if the user enters the number 5):

Odd triangle
1
31
531
7531
97531
1197531
 */
public class Challenge3_16r {

    public static void main(String[] args) {
        System.out.println("Put a number of rows: ");
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        for (int i = 1; i <= rows; i++) {
            System.out.print("\n");
            for (int j = i*2 -1; j >= 1; j = j - 2) {
                System.out.print(j);
            }
        }
    }
}
