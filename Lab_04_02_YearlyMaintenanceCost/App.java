public class App {
    public static void main(String[] args) throws Exception {
        int fallCost = 200;
        int winterCost = 150;
        int springCost = 100;
        int summerCost = 375;
        int totalCost = 0;
        System.out.println("The maintenance cost for the fall season was: $" + fallCost);
        System.out.println("The maintenance cost for the winter season was: $" + winterCost);
        System.out.println("The maintenance cost for the spring season was: $" + springCost);
        System.out.println("The maintenance cost for the summer season was: $" + summerCost);
        totalCost = fallCost + winterCost + springCost + summerCost;
        System.out.println("This is your yearly maintenance cost: $" + totalCost);
    }
}
