
import java.util.ArrayList;

/*
Create an ArrayList of Strings to store whatever you want and add some elements.

Show the elements contained in the ArrayList.

Insert an element in the third position.

Show the elements contained in the ArrayList.

b)

Show the element in the first position.

c)

Remove the first element in the ArrayList.

Show the elements contained in the ArrayList.

d)

Change the element in the last position by another one.

Show the elements contained in the ArrayList.
 */

public class Challenge5_12 {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList();
        elements.add("Hola");
        elements.add("Hello");
        elements.add("Hi");
        System.out.println(elements);
        elements.add(3, "Hey");
        System.out.println(elements);
        System.out.println(elements.get(0));
        elements.remove(0);
        System.out.println(elements);
        elements.set(elements.size()-1,"Yeih");
        System.out.println(elements);
    }
}
