/*
Create an array with some elements.

Create an empty array with the same number of elements and duplicate the first array in the second one.

Use the function created in 5.3 to show the elements of the second array.

b)

Instead of duplicating the array, reverse the elements in the array. For example, if our first array has the following elements:

1, 5, 3, 4, 9

The second array should have the same elements but in the reverse order:

9, 4, 3, 5, 1
 */
public class Challenge5_6 {

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 8, 5, 3, 6, 9, 7, 7, 5, 6};
        int[] arrayNumbers2 = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers2[i] = arrayNumbers[arrayNumbers.length - i - 1];
        }
        Challenge5_3.printArray(arrayNumbers2); 
    }
}
