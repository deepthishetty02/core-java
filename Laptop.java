class Laptop {

    static void name() {
        System.out.println("Laptop Store");
    }

    static void booking(String customerName) {
        System.out.println("Customer Name: " + customerName);
    }

    static int getPrice() {
        return 55000;
    }

    static int totalBill(int price) {
        return price + 2000;
    }

    public static void main(String[] args) {

        Laptop.name();

        Laptop.booking("Rahul");

        int price = Laptop.getPrice();
        System.out.println("Price: " + price);

        int total = Laptop.totalBill(price);
        System.out.println("Total Bill: " + total);
    }
}