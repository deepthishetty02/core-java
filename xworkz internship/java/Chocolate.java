class Chocolate {

    static void name() {
        System.out.println("Chocolate Shop");
    }

    static void booking(String customerName) {
        System.out.println("Customer Name: " + customerName);
    }

    static int getPrice() {
        return 150;
    }

    static int totalBill(int price) {
        return price + 20;
    }

    public static void main(String[] args) {

        Chocolate.name();

        Chocolate.booking("Sneha");

        int price = Chocolate.getPrice();
        System.out.println("Price: " + price);

        int total = Chocolate.totalBill(price);
        System.out.println("Total Bill: " + total);
    }
}