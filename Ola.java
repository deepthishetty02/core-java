class Ola {

    Ola() {
        this("Auto");
        System.out.println("0 argument constructor");
    }

    Ola(String vehicle) {
        this(vehicle, 3);
        System.out.println("1 argument constructor");
    }

    Ola(String vehicle, int distance) {
        this(vehicle, distance, 100);
        System.out.println("2 argument constructor");
    }

    Ola(String vehicle, int distance, int fare) {
        this(vehicle, distance, fare, "Online");
        System.out.println("3 argument constructor");
    }

    Ola(String vehicle, int distance, int fare, String mode) {
        System.out.println("Vehicle : " + vehicle);
        System.out.println("Distance : " + distance);
        System.out.println("Fare : " + fare);
        System.out.println("Mode : " + mode);
        System.out.println("-----------");
    }
}