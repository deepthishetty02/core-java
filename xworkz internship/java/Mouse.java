class Mouse {

    String brand;
    String type;
    int price;

    public Mouse() {
    }

    public Mouse(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void display() {
        System.out.println(brand);
        System.out.println(type);
        System.out.println(price);
        System.out.println("-------------------");
    }
}