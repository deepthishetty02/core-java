class Meesho {

    Meesho() {
        this("Dress");
        System.out.println("0 argument constructor");
    }

    Meesho(String item) {
        this(item, 1);
        System.out.println("1 argument constructor");
    }

    Meesho(String item, int quantity) {
        this(item, quantity, 800);
        System.out.println("2 argument constructor");
    }

    Meesho(String item, int quantity, int price) {
        this(item, quantity, price, "COD");
        System.out.println("3 argument constructor");
    }

    Meesho(String item, int quantity, int price, String mode) {
        System.out.println("Item : " + item);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Mode : " + mode);
        System.out.println("-----------");
    }
}