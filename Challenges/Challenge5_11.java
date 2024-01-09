
import java.util.ArrayList;
import java.util.Scanner;

/*
Create an ArrayList of Strings. 
By using the keyboard, the user should introduce person names until he introduce an empty word. 
Store this person names in the ArrayList.

At the end, show the names contained in the ArrayList.
 */

public class Challenge5_11 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        String name = "0";
        while (!name.equals("")){
            System.out.println("Introduce person name: ");
            Scanner keyboard = new Scanner (System.in);
            name = keyboard.nextLine();   
            if (!name.equals("")){
                names.add(name);
            }
        }
        System.out.println(names);
    }
}
