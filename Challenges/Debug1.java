/*
a.      Debug1.java.

A program to classify 2 numbers. Follow the instructions in the “System.out.println” to fix it.

 */
public class Debug1 {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        
        if (numero2 > 0) {
            System.out.println("numero2 es positivo");
        }
        if (numero1 <= numero2) {
            System.out.println("numero1 no es mayor que numero2");
        }
        if (numero1 < 0 && numero2 < 0) {
            System.out.println("tanto numero1 como numero2 son negativos");
        }
        if (numero1 == 13 || numero2 == 13) {
            System.out.println("numero1 es trece o numero2 es trece");
        }

    }
    
}
