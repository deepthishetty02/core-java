class Uber {

    Uber() {
        this("Mini");
        System.out.println("0 argument constructor");
    }

    Uber(String cabType) {
        this(cabType, 5);
        System.out.println("1 argument constructor");
    }

    Uber(String cabType, int distance) {
        this(cabType, distance, 200);
        System.out.println("2 argument constructor");
    }

    Uber(String cabType, int distance, int fare) {
        this(cabType, distance, fare, "Cash");
        System.out.println("3 argument constructor");
    }

    Uber(String cabType, int distance, int fare, String payment) {
        System.out.println("CabType : " + cabType);
        System.out.println("Distance : " + distance);
        System.out.println("Fare : " + fare);
        System.out.println("Payment : " + payment);
        System.out.println("-----------");
    }
}