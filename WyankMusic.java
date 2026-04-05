class WyankMusic {

    WyankMusic() {
        this("Free");
        System.out.println("0 argument constructor");
    }

    WyankMusic(String plan) {
        this(plan, 1);
        System.out.println("1 argument constructor");
    }

    WyankMusic(String plan, int devices) {
        this(plan, devices, 119);
        System.out.println("2 argument constructor");
    }

    WyankMusic(String plan, int devices, int price) {
        this(plan, devices, price, "Monthly");
        System.out.println("3 argument constructor");
    }

    WyankMusic(String plan, int devices, int price, String duration) {
        System.out.println("Plan : " + plan);
        System.out.println("Devices : " + devices);
        System.out.println("Price : " + price);
        System.out.println("Duration : " + duration);
        System.out.println("-----------");
    }
}