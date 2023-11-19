/*
Create a new Java class called "Challenge2_4.java".

Create a variable with a price.

Calculate the 21% of V.A.T.

Print the original price, the V.A.T. calculated and the price with V.A.T.
 */
public class Challenge2_4 {
    public static void main(String[] args) {
        double price = 10;
        double vat = (price * 21)/100 ;
        double priceWithVat = price + vat;
        System.out.println("The price is: " + price + "\nThe VAT is: " + vat + "\nThe price with VAT is: " + priceWithVat);
        
    }
}
