/*
Create a class named "Challenge3_7.java".

a) Show the numbers from 1 to 100 that which are multiple of 4 (4, 8, 12, 16…).

b) Modify the previous exercise to show the multiples of 4 that are not multiple of 5.);
 */
public class Challenge3_7 {
    public static void main(String[] args) {
        //a)
        for (int a=1; a<=100;a++){
            if (a%4 == 0){
                System.out.println(a);
            }
        }
        //b)
        for (int a=1; a<=100;a++){
            if (a%4 == 0 && a%5!=0){
                System.out.println(a);
            }
        }       
    }
}
