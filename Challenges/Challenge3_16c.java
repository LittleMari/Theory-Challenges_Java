
import java.util.Scanner;

/*
  Starting or ending by the same letter?.

Ask to the user for the name of 2 persons and store them into variables.

Then you have to print “coincidence” if the names of both persons start by the same letter or if they finish by the same letter.
In any other case, print “there is NO coincidence”.

Example of execution:

Enter the name of person 1:
Emilio
Enter the name of person 2:
Eugenia
coincidence

Example of execution:

Enter the name of person 1:
Emilio
Enter the name of person 2:
Fernando
coincidence

Example of execution:

Enter the name of person 1:
Emilio
Enter the name of person 2:
Felipe
there is NO coincidence
 */
public class Challenge3_16c {
    public static void main(String[] args) {
        System.out.println("Put the name of person 1: ");
        Scanner keyboard = new Scanner(System.in);
        String name1 = keyboard.nextLine();
        System.out.println("Put the name of person 2: ");
        String name2 = keyboard.nextLine();
        
        if((name1.toLowerCase().charAt(0) == name2.toLowerCase().charAt(0)) || (name1.toLowerCase().charAt(name1.length()-1) == name2.toLowerCase().charAt(name2.length()-1))){
            System.out.println("Coincidence");
        }else{
            System.out.println("There is NO coincidence");
        }
    }
}
