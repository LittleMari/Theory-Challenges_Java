/*
a) Create a new Java class called "Challenge2_2.java" and create the following variables by choosing the most appropriated data type (assign a value to each one):

A variable to store the radius of the Earth.
A variable to store the height of a person.
A variable to store if the lights are on or off.
A variable to store the size of a T-shirt (S, M, L or XL).
A variable to store the maximum PI decimals possible.
A variable to store one million.
A variable to store one trillion.
A variable to store a password.
b) Show this variables on your computer screen.
*/
public class Challenge2_2 {

    public static void main(String args[]) {
        short earthRadius =  6371;
        float heightPerson = 60.4f;
        boolean lights = true;
        String size = "XL";
        char sizeChar = 'S';
        double piNumber = 3.1415926535897932384626433832795028841971693993751058209;
        int oneMillion = 1000000;
        long oneTrillion = 1000000000000l;
        String password = "A23bf9s7c";
        System.out.println("This is the earth radius: " + earthRadius);
        System.out.println("This is the height of a person: " + heightPerson);
        System.out.println("Are the lights on ?" + lights);
        System.out.println("This are sizes of a T-shirt: " + size + " and " + sizeChar);
        System.out.println("This is a decimal number: " + piNumber);
        System.out.println("This is one million number: " + oneMillion);
        System.out.println("This is one trillion number: " + oneTrillion);
        System.out.println("This is a password: " + password);      
    }
}
