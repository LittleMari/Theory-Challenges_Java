/*
Create a class named "Challenge3_5.java".

a) By using the “for” statement, write the 7 times table (multiplication table).

b) Modify the previous exercise to write all times tables from 1 to 10.
 */


public class Challenge3_5 {
    public static void main(String[] args) {
    //a)
        for (int k = 0; k <= 70; k = k + 7){
            System.out.println(k);
        }
    //b)
        for (int x = 1; x <= 10; x++){
            System.out.println("Esta es la tabla de " + x);
            for (int i = 0; i <= 10 ; i++){
                System.out.println( x + "*" + i + "= " + i*x);
            }   
        }
    }
}   

