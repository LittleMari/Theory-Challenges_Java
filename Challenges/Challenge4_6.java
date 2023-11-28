
import java.util.Scanner;

/*
We are going to calculate how much paint is needed to paint a wall.

First we have to do is to create a function to calculate the area of the wall with a supplied width and height. Once we know the area,
we have to pass this area to a second function which calculates the litres of paint needed for this area supposing we need 4 litres of paint for each square metre.
 */

public class Challenge4_6 {
    public static void main(String[] args) {
        System.out.println("Put the width of your wall: ");
        int width = keyboard();
        System.out.println("Put the heigth of your wall: ");
        int heigth = keyboard();
        System.out.println("The litres you need are: " + litres(area(width, heigth)));
    }

    public static int area(int width, int height) {
        int area = width * height;
        return area;
    }

    public static int litres(int area) {
        int litres = area * 4;
        return litres;
    }

    public static int keyboard() {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        return number;
    }
}