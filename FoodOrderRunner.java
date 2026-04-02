class FoodOrderRunner {

    public static void main(String[] args) {

        FoodOrder f1 = new FoodOrder("Pizza");
        f1.display();

        FoodOrder f2 = new FoodOrder("Burger", 2);
        f2.display();

        FoodOrder f3 = new FoodOrder("Pasta", 3, 450.5);
        f3.display();

    }
}