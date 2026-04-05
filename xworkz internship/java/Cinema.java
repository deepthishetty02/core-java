class Cinema {

    public static void main(String[] args) {

        System.out.println("Welcome to Cinema");
        getCinema();

        System.out.println("Add two ticket prices");
        int ticketPrice1 = 200;
        int ticketPrice2 = 250;
        String message = "TOTAL TICKET PRICE";

        calculateTickets(ticketPrice1, ticketPrice2, message);

        System.out.println("What is the popcorn price?");
        long popcornPrice = getPopcornPrice();
        System.out.println(popcornPrice);
    }

    static void getCinema() {
        System.out.println("This is Cinema Booking");
    }

    static void calculateTickets(int ticketPrice1, int ticketPrice2, String message) {
        int total = ticketPrice1 + ticketPrice2;
        System.out.println(total);
        System.out.println(message);
    }

    static long getPopcornPrice() {
        long price = 120;
        return price;
    }
}