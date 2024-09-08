// Omar Mohamdy, omm228@lehigh.edu
// CSE07 Arithmetic Calculations
// Lab assignment 02

public class ArithmeticCalculations {
   public static void main(String[] args) {
// number of pairs of pants
int numPants = 3;
// cost per pair of pants
double pantsPrice = 34.98;
// number of sweatshirts
int numShirts = 2;
// cost per shirt
double shirtPrice = 24.99;
// number of belts
int numBelts = 1;
// cost per belt
double beltPrice = 33.99;
// the tax rate
 double paSalesTax = 0.06;
// 1. calculate total before tax
double totalCostBeforeTax = (numPants * pantsPrice) + (numShirts * shirtPrice) + (numBelts * beltPrice);
// 2. Calculate total sales tax
double totalSalesTax = totalCostBeforeTax * paSalesTax;
// 3. Calculate total cost after tax
double totalCostAfterTax = totalCostBeforeTax + totalSalesTax;
// Display the totals
System.out.printf("Total cost before tax: $%.2f%n", totalCostBeforeTax);
System.out.printf("Total sales tax: $%.2f%n", totalSalesTax);
System.out.printf("Total cost after tax: $%.2f%n", totalCostAfterTax);
 }
}
