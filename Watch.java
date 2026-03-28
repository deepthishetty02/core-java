class Watch {

    static void name() {
        System.out.println("Watch Shop");
    }

    static void booking(String customerName) {
        System.out.println("Customer Name: " + customerName);
    }

    static int getPrice() {
        return 2500;
    }

    static int totalBill(int price) {
        return price + 150;
    }

    public static void main(String[] args) {

        Watch.name();

        Watch.booking("Kiran");

        int price = Watch.getPrice();
        System.out.println("Price: " + price);

        int total = Watch.totalBill(price);
        System.out.println("Total Bill: " + total);
    }
}