class ZeptoRunner {

    public static void main(String[] args) {
    int price = 0;
       price = Zepto.checkItem("Oil");
        System.out.println("Price for one item : " + price);
        int totalPrice = Zepto.checkItem("Oil", price, 6);
        System.out.println("Total Price : " + totalPrice);

    }
}