class FoodOrder {

    String itemName;
    int quantity;
    double price;

    public FoodOrder(String itemName) {
        this.itemName = itemName;
    }

    public FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public FoodOrder(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println("******");
    }
}