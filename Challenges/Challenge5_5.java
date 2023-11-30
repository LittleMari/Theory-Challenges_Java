/*
Create a function that check if a number exists in an array and tells the position of the element or -1 if the element doesn’t exists in the array.

For example, if we have an array composed by the elements 1, 8, 5, 3, 6, 9

If we look for the number 5 it should say:

The number 5 is in the position 2.

If we look for the number 7 it should say:

The number 7 is in the position -1.
 */
public class Challenge5_5 {

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 8, 5, 3, 6, 9};
        int number = 6;
        System.out.println("The number " + number + " is in the position " + positionArray(arrayNumbers, number));
    }

    public static int positionArray(int[] array, int number) {
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                position = i;
            }
        }
        return position;
    }
}