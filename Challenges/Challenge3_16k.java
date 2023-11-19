
import java.util.Scanner;

/*
k.Asking for a password.

Store in a variable a secret password.

Ask to the user for the password and print if the password entered is right or not.

Repeat the program until de password is ok.

Modify the program to not having into account lowercase and uppercase characters.

Example of execution (if the password is “myCatHarry”):

Enter the password:
hello
Wrong password
Enter the password:
mycatharry
Wrong password
Enter the password:
myCatHarry
Right password

Example of execution (if the password is “myCatHarry”)  and we are ignoring lower and uppercase letters:

Enter the password:
hello
Wrong password
Enter the password:
mycatharry
Right password
 */
public class Challenge3_16k {
    public static void main(String[] args) {
        String password = "mylittledog";
        System.out.println("Enter the password:");
        Scanner keyboard = new Scanner(System.in);
        String passwordInsert = keyboard.nextLine();
        passwordInsert = passwordInsert.toLowerCase();
        while (!(password.equals(passwordInsert))){
            System.out.println("Wrong password");
            System.out.println("Enter the password:");
            passwordInsert = keyboard.nextLine();  
            passwordInsert = passwordInsert.toLowerCase();
        }System.out.println("Rigth password");
    }
}
