class RideBookingRunner {

    public static void main(String[] args) {

        RideBooking r1 = new RideBooking("Home");
        r1.display();

        RideBooking r2 = new RideBooking("Home", "College");
        r2.display();

        RideBooking r3 = new RideBooking("Office", "Mall", 250.5);
        r3.display();

    }
}