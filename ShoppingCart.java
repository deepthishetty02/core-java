class ShoppingCart {

    String itemName;
    int quantity;
    double totalPrice;

    public ShoppingCart(String itemName) {
        this.itemName = itemName;
    }

    public ShoppingCart(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public ShoppingCart(String itemName, int quantity, double totalPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(quantity);
        System.out.println(totalPrice);
        System.out.println("------");
    }
}
 
