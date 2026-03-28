class Restaurant {

    public static void main(String[] args) {

        System.out.println("Welcome to Restaurant");
        getRestaurant();

        System.out.println("Add two food prices");
        int One = 250;
        int Two = 150;
        String result = "TOTAL PRICE CALCULATED";

        calculateTotal(One, Two, result);

        System.out.println("What is the service charge?");
        long serviceCharge = getServiceCharge();
        System.out.println(serviceCharge);
    }

    static void getRestaurant() {
        System.out.println("This is Restaurant Service");
    }

    static void calculateTotal(int One, int Two, String result) {
        int total = One + Two;
        System.out.println(total);
        System.out.println(result);
    }

    static long getServiceCharge() {
        long charge = 50;
        return charge;
    }
}