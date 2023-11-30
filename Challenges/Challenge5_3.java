/*
Create an array with 7 elements.

Create a function to show all the elements on screen by using the loop for (use both ways of looping with for seen on class).
 */
public class Challenge5_3 {

    public static void main(String[] args) {
        int numbers[] = {1, 3, 4, 2, 5, 3, 4};
        printArray(numbers);
        printArray2(numbers);
    }

    public static void printArray(int list[]) {

        for (int i : list) {
            System.out.println(i);
        }
    }

    public static void printArray2(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
