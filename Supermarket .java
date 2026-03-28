class Supermarket {

    public static void main(String[] args) {

        System.out.println("Welcome to Supermarket");
        getSupermarket();

        System.out.println("Add two product prices");
        int ricePrice = 80;
        int oilPrice = 150;
        String message = "TOTAL BILL";

        calculateBill(ricePrice, oilPrice, message);

        System.out.println("What is the bag price?");
        long bagPrice = getBagPrice();
        System.out.println(bagPrice);
    }

    static void getSupermarket() {
        System.out.println("This is Supermarket Service");
    }

    static void calculateBill(int ricePrice, int oilPrice, String message) {
        int total = ricePrice + oilPrice;
        System.out.println(total);
        System.out.println(message);
    }

    static long getBagPrice() {
        long price = 10;
        return price;
    }
}