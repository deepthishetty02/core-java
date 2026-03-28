class Airlines {

    public static void main(String[] args) {

        System.out.println("Welcome to Airlines");
        getAirlines();

        System.out.println("Calculate total ticket price");
        int ticket1 = 4500;
        int ticket2 = 5500;
        String status = "BOOKING SUCCESS";

        calculateTotal(ticket1, ticket2, status);

        System.out.println("What is the baggage limit?");
        long baggageLimit = getBaggageLimit();
        System.out.println(baggageLimit);

        System.out.println("Thank You");
    }

    static void getAirlines() {
        System.out.println("This is Airlines Service");
    }

    static void calculateTotal(int price1, int price2, String message) {
        int total = price1 + price2;
        System.out.println(total);
        System.out.println(message);
    }

    static long getBaggageLimit() {
        long limit = 25;
        return limit;
    }
}