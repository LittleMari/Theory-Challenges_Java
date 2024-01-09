/*
Create an array with some elements.

Look for the maximum and minimum elements in the array:

For example, if the array is:

1, -7, 3, 9, 15

The program should say:

The maximum value is 15

The minimum value is -7
 */
public class Challenge5_7 {

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 8, 5, 3, 6, 9, 7, 5, 6};
        int minimum = arrayNumbers[0];
        int maximum = arrayNumbers[0];
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maximum) {
                maximum = arrayNumbers[i];
            }
            if (arrayNumbers[i] < minimum) {
                minimum = arrayNumbers[i];
            }
        }
        System.out.println("The maximun value is " + maximum);
        System.out.println("The minimun value is " + minimum);
    }
}
