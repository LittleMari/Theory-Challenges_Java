/*
Create an array with some elements.

Look for the BULKIEST elements in the array. An element should be considered a BULKIEST if it is bigger than all the elements at his right.

For example, if the array is:

1, 8, 5, 9, 4, 7, 2

The program should say:

9 is a BULKIEST.

7 is a BULKIEST.

2 is a BULKIEST.
 */
public class Challenge5_9 {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 8, 5, 9, 4, 7, 2};
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            boolean isBulkiest = true;
            for (int j = i + 1; j < (arrayOfNumbers.length - 1); j++) {
                if (arrayOfNumbers[i] < arrayOfNumbers[j]) {
                    isBulkiest = false;
                }
            }
            if (isBulkiest) {
                System.out.println(arrayOfNumbers[i] + " is a BULKIEST");
            }
        }
    }
}
