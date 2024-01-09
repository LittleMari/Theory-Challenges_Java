
import java.util.ArrayList;
import java.util.Collections;

/*
Create an ArrayList of Strings to store programming languages.

Add the following programming languages:

Java
PHP
Python
C++
C#
Kotlin

Show the elements contained in the ArrayList.

Order the elements in the ArrayList.

Show the elements contained in the ArrayList.

b)

Make Java to be the first one.

Show the elements contained in the ArrayList.

c)

Tell what the position of Kotlin is.

d)

Display the languages containing the letter “o”.
 */
public class Challenge5_13 {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList();
        languages.add("Java");
        languages.add("PHP");
        languages.add("Python");
        languages.add("C++");
        languages.add("C#");
        languages.add("Kotlin");
        System.out.println(languages);
        Collections.sort(languages);
        System.out.println(languages);
        //b)
        languages.remove("Java");
        languages.add(0, "Java");
        //c)
        System.out.println(languages.indexOf("Kotlin"));
        //d)
        letterIn(languages);
    }

    public static void letterIn(ArrayList<String> array) {
        for (String language : array) {
            if (language.contains("o")) {
                System.out.println(language);
            }
        }
    }
}
