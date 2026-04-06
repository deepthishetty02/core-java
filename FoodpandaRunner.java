class FoodpandaRunner {
public static void main(String[] args) {
      int price = 0;

        price = Foodpanda.checkDish("Momos");
        System.out.println("Cost per dish : " + price);

        int totalPrice = Foodpanda.checkDish("Momos", price, 5);
        System.out.println("Total bill amount : " + totalPrice);
    }
}