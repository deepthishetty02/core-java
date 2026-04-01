class Zomato {

    String restaurantName;
    String foodType;
    int deliveryTime;

    public Zomato() {
    }

    public Zomato(String restaurantName, String foodType, int deliveryTime) {
        this.restaurantName = restaurantName;
        this.foodType = foodType;
        this.deliveryTime = deliveryTime;
    }

    public void display() {
        System.out.println(restaurantName);
        System.out.println(foodType);
        System.out.println(deliveryTime);
        System.out.println("-------------------");
    }
}