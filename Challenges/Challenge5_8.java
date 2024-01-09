/*
Create an array with some elements.

Look for the elements that are duplicated in the array.

For example, if the array has the following values:

1,4,3,5,7,3,9,4

The program should say:

The number 4 is duplicated.

The number 3 is duplicated.

 */
public class Challenge5_8 {

    public static void main(String[] args) {
        int[] arrayNumbers = {9, 1, 1, 8, 5, 3, 6, -3, 7, 5, 6, 8, 9};
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] == arrayNumbers[j]) {
                    System.out.println("The number " + arrayNumbers[i] + " is duplicated");
                }
            }
        }
    }
}
