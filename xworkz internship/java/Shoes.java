class Shoes {

    static void name() {
        System.out.println("Shoes Shop");
    }

    static void booking(String customerName) {
        System.out.println("Customer Name: " + customerName);
    }

    static int getPrice() {
        return 1200;
    }

    static int totalBill(int price) {
        return price + 100;
    }

    public static void main(String[] args) {

        Shoes.name();

        Shoes.booking("Riya");

        int price = Shoes.getPrice();
        System.out.println("Price: " + price);

        int total = Shoes.totalBill(price);
        System.out.println("Total Bill: " + total);
    }
}