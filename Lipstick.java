class Lipstick {

    static void name() {
        System.out.println("Lipstick Store");
    }

    static void booking(String customerName) {
        System.out.println("Customer Name: " + customerName);
    }

    static int getPrice() {
        return 350;
    }

    static int totalBill(int price) {
        return price + 30;
    }

    public static void main(String[] args) {

        Lipstick.name();

        Lipstick.booking("Ananya");

        int price = Lipstick.getPrice();
        System.out.println("Price: " + price);

        int total = Lipstick.totalBill(price);
        System.out.println("Total Bill: " + total);
    }
}