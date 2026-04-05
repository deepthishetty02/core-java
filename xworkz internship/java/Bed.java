class Bed {

    static String brand = "SleepWell";
    static int size = 6;
    static double price = 15000.50;
    static String material = "Wood";
    static String color = "Brown";

    public static void main(String[] args) {

        String brand = "WakeFit";
        int size = 5;
        double price = 12000.75;
        String material = "Metal";
        String color = "Black";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + Bed.brand);
        System.out.println("Size: " + Bed.size);
        System.out.println("Price: " + Bed.price);
        System.out.println("Material: " + Bed.material);
        System.out.println("Color: " + Bed.color);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}