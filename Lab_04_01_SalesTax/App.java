public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("The price of your item is $20");
        System.out.println("Sales tax is 5%");
        double itemPrice = 20;
        double salesTax = 0;
        salesTax = itemPrice * .05;
        System.out.println("This is your sales tax: $" + salesTax);
    }
}
