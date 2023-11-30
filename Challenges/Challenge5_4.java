/*
Generate a random number between 1 and 7. Create a function that returns the day of the week in letter (corresponding 1 to Monday and 7 to Sunday).

Show on screen: Today is 5 corresponding to Friday.

To make it easier, create an array with the names of the days of the week: Monday, Tuesday…

Once you have the number from 1 to 7, pick from the array the right day of the week.
 */
public class Challenge5_4 {

    public static void main(String[] args) {
        dayOfWeek(random1to7());
    }

    public static int random1to7() {
        int randomn = (int) (Math.random() * (7) + 1);
        return randomn;
    }

    public static void dayOfWeek(int number) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String day = daysOfWeek[number - 1];
        System.out.println("Today is " + number + " corresponding to " + day);
    }
}
