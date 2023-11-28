/*
Create an empty array with space for 5 numbers.

Assign a value to each element of the array.

Show on screen all the elements of an array.
 */
public class Challenge5_2 {

    public static void main(String[] args) {
        int numbers[] = new int[5];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 6;
        numbers[3] = 7;
        numbers[4] = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
