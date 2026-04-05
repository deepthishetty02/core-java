class Amazon {

    Amazon() {
        this("Mobile");
        System.out.println("0 argument constructor");
    }

    Amazon(String product) {
        this(product, 1);
        System.out.println("1 argument constructor");
    }

    Amazon(String product, int quantity) {
        this(product, quantity, 15000);
        System.out.println("2 argument constructor");
    }

    Amazon(String product, int quantity, int price) {
        this(product, quantity, price, "Online");
        System.out.println("3 argument constructor");
    }

    Amazon(String product, int quantity, int price, String mode) {
        System.out.println("Product : " + product);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Mode : " + mode);
        System.out.println("-----------");
    }
}