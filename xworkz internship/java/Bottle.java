class Bottle {

    static String brand = "Milton";
    static int capacity = 1;
    static double price = 350.50;
    static String material = "Steel";
    static String color = "Silver";

    public static void main(String[] args) {

        String brand = "Cello";
        int capacity = 2;
        double price = 450.75;
        String material = "Plastic";
        String color = "Blue";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + Bottle.brand);
        System.out.println("Capacity: " + Bottle.capacity);
        System.out.println("Price: " + Bottle.price);
        System.out.println("Material: " + Bottle.material);
        System.out.println("Color: " + Bottle.color);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}