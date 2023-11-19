/*
Create a class named "Challenge3_8.java".

a) By using the keyboard, ask for a number to the user. Paint on screen a triangle with this number of rows:

Number of rows:
7

#
##
###
####
#####
######
#######

b) Invert the triangle:

Number of rows:
7

#######
######
#####
####
###
##
#

c) (OPTIONAL-ADVANCED) Convert the triangle into a pyramid.

Number of rows:
7

      #
     ###
    #####
   #######
  #########
 ###########
#############

D) (OPTIONAL-ADVANCED) Rotate the pyramid (notice that you have to ask for columns instead rows now).

Number of columns:
7

#
##
###
####
#####
######
#######
######
#####
####
###
##
#
 */
import java.util.Scanner;

public class Challenge3_8 {

    public static void main(String[] args) {
        //a)
        System.out.println("Introduzca cuántas lineas quiere para el triángulo: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        for (int x = 0; x < a; x++) {
            System.out.print("\n");
            for (int j = 0; j <= x; j++) {
                System.out.print("#");
            }
        }
        System.out.print("\n");

        //b)
        System.out.println("Introduzca cuántas lineas quiere para el triángulo invertido: ");
        Scanner keyboard2 = new Scanner(System.in);
        int b = keyboard2.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.print("\n");
            for (int k = b; k > i; k--) {
                System.out.print("#");
            }
        }
        System.out.print("\n");

        //c
        System.out.println("Introduzca cuántas lineas quiere para la pirámide: ");
        Scanner keyboard3 = new Scanner(System.in);
        int c = keyboard3.nextInt();
        for (int p = 0; p < c; p++) {
            System.out.print("\n");
            for (int q = c; q > p; q--) {
                System.out.print(" ");
            }
            for (int r = 0; r <= p * 2; r++) {
                System.out.print("#");
            }
        }
        System.out.print("\n");

        //d)
        System.out.println("Introduzca cuántas lineas quiere para la pirámide de lado: ");
        Scanner keyboard4 = new Scanner(System.in);
        int d = keyboard4.nextInt();
        for (int l = 0; l < d; l++) {
            System.out.print("\n");
            for (int m = 0; m <= l; m++) {
                System.out.print("#");
            }
        }
        for (int n = 0; n <= d; n++) {
            System.out.print("\n");
            for (int o = d; o >= n; o--) {
                System.out.print("#");
            }
        }
    }
}
