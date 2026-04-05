class FoodDelivery {

    public static void main(String[] args) {

        // 1st --> Declaration
        String customerName;
        String restaurantName;
        double orderAmount;
        int deliveryTime;
        boolean isPaid;

        // 2nd --> Initialization
        customerName = "Ananya";
        restaurantName = "Spice Garden";
        orderAmount = 749.50;
        deliveryTime = 30;
        isPaid = true;

        // Print variables
        System.out.println("Customer Name: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Delivery Time (minutes): " + deliveryTime);
        System.out.println("Payment Done: " + isPaid);

        // Reassign the variables
        customerName = "Arjun";
        restaurantName = "Burger Hub";
        orderAmount = 399.99;
        deliveryTime = 25;
        isPaid = false;

        // Print again
        System.out.println("---- After Changing Values ----");

        System.out.println("Customer Name: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Order Amount: " + orderAmount);
        System.out.println("Delivery Time (minutes): " + deliveryTime);
        System.out.println("Payment Done: " + isPaid);
    }
}