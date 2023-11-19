/*
Create a new function to calculate the “net price” of an item (price with taxes).
The function should receive the “gross price” (price before taxes) calculate the final price with a 21% of taxes. Write what the final price would be.

Call to the functions 3 times with different prices.

b) Add to the price the shipment cost. If the final price is lower than 50, you should add 8€ of shipment cost, otherwise the shipment cost it is free.

c) Modify the function to receive a new parameter to indicate if the product is in the category of “super-reduced” VAT (4%), “reduced” (10%) or general (21%).
 */
public class Challenge4_3 {

    public static void main(String[] args) {
        netPrice(10, 's');
        netPrice(6, 'r');
        netPrice(50, 'g');
    }

    public static void netPrice(double itemWithOutTaxes, char category) {
        double vat = 0;
        if (category == 's') {
            vat = 1.04;
        } else if (category == 'r') {
            vat = 1.1;
        } else {
            vat = 1.21;
        }
                double itemWithTaxes = itemWithOutTaxes * vat;
                
        if (itemWithTaxes < 50) {
            itemWithTaxes += 8;
        }
        System.out.println(itemWithTaxes);
    }
}
