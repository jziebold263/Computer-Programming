public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Your credit card has a balance of $5000");
        System.out.println("You will need to pay an intrest rate of 17% each month ");
        double balance = 5000;
        double intrestRate = 0;
        double intrestTotal = 0;
        intrestRate = balance * .17;
        System.out.println("This is your intrest cost after the first month: $" +intrestRate);
        intrestTotal = balance * .17 + intrestRate;
        System.out.println("this is your intrest cost after the first 2 months" + intrestTotal);
    }
}
