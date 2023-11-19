
import java.util.Scanner;

/*
g.Extracting a phone number.

The phone number of a company has the next format: prefix-number-extension, where prefix is the country code (i.e. +34), 
and the extension can have between 2 and 4 digits. For example, this would be a number +34-968256541-33.

Write a program asking for a phone number with this format and show on screen the phone without the prefix and the extension.

Example of execution:

Enter a phone number:
+34-968123456-789
The number without extension is:
968123456
 */
public class Challenge3_16g {

    public static void main(String[] args) {
        System.out.println("Enter a phone number: ");
        Scanner keyboard = new Scanner(System.in);
        String number = keyboard.nextLine();
        int inicialGuion = number.indexOf("-");
        String numberWithoutprefix = number.substring(inicialGuion + 1);
        int secondGuion = numberWithoutprefix.indexOf("-");
        String finalNumber = numberWithoutprefix.substring(0, secondGuion);
        System.out.println(finalNumber);
    }
}
