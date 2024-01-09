
import java.util.Arrays;

/*
Create an array with some elements. Investigate the Java Arrays predefined functions to solve these exercises. To do that, write in Net Beans “Arrays.”
and the list of functions will appear with a little documentation about how to use them.

a)

Write on screen all the elements of an array.

b)

See if two arrays has the same elements.

c)

Order the elements of an array.

For example, if the array is:

1, 4, 3, 7, 2, 9

The result should be:

1, 2, 3, 4, 7, 9

d)

Create two arrays with the same number of elements. Look for the element which is not equal in the same position of the other array.

For example if the arrays are:

Array1: 1, 3, 5, 7, 9

Array2: 1, 3, 4, 7, 9

The program should say:

The element in position 2 is not equal

e)

Create an empty array of integers. Fill the array with the number 32.
 */
public class Challenge5_10 {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 8, 5, 9, 4, 7, 2, 3};
        int[] arrayOfNumbers2 = {1, 8, 5, 5, 4, 7, 2};
        //a
        String newArray = Arrays.toString(arrayOfNumbers);
        System.out.println(newArray);

        //b
        int newArray2 = Arrays.compare(arrayOfNumbers, arrayOfNumbers2);
        System.out.println(newArray2);

        //c
        Arrays.sort(arrayOfNumbers);
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }

        //d
        if (Arrays.equals(arrayOfNumbers, arrayOfNumbers2)) {
            System.out.println("The arrays are equals");
        } else {
            boolean itsEqual= true;
            for (int i=0; i< arrayOfNumbers.length; i++){
                if (arrayOfNumbers[i] != arrayOfNumbers2[i]){
                    itsEqual= false;
                }
            }
            if (!itsEqual){
                System.out.println("");
            }
        }
    }
}
