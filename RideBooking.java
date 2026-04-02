class RideBooking {

    String pickupLocation;
    String dropLocation;
    double fare;

    public RideBooking(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public RideBooking(String pickupLocation, String dropLocation) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    public RideBooking(String pickupLocation, String dropLocation, double fare) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.fare = fare;
    }

    void display() {
        System.out.println(pickupLocation);
        System.out.println(dropLocation);
        System.out.println(fare);
        System.out.println("********");
    }
}