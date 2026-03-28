class Camera {

    static String brand = "Canon";
    static int megapixel = 24;
    static double price = 55000.75;
    static String type = "DSLR";
    static String color = "Black";

    public static void main(String[] args) {

        String brand = "Nikon";
        int megapixel = 32;
        double price = 72000.50;
        String type = "Mirrorless";
        String color = "Grey";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + Camera.brand);
        System.out.println("Megapixel: " + Camera.megapixel);
        System.out.println("Price: " + Camera.price);
        System.out.println("Type: " + Camera.type);
        System.out.println("Color: " + Camera.color);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Megapixel: " + megapixel);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
}