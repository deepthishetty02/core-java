class Netflix {

    Netflix() {
        this("Basic");
        System.out.println("0 argument constructor");
    }

    Netflix(String plan) {
        this(plan, 1);
        System.out.println("1 argument constructor");
    }

    Netflix(String plan, int screens) {
        this(plan, screens, 499);
        System.out.println("2 argument constructor");
    }

    Netflix(String plan, int screens, int price) {
        this(plan, screens, price, "Monthly");
        System.out.println("3 argument constructor");
    }

    Netflix(String plan, int screens, int price, String duration) {
        System.out.println("Plan : " + plan);
        System.out.println("Screens : " + screens);
        System.out.println("Price : " + price);
        System.out.println("Duration : " + duration);
        System.out.println("-----------");
    }
}