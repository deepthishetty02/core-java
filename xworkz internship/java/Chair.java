class Chair {

    static String brand = "Nilkamal";
    static int height = 4;
    static double price = 2500.50;
    static String material = "Plastic";
    static String color = "Red";

    public static void main(String[] args) {

        String brand = "Cello";
        int height = 3;
        double price = 1800.75;
        String material = "Wood";
        String color = "Black";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + Chair.brand);
        System.out.println("Height: " + Chair.height);
        System.out.println("Price: " + Chair.price);
        System.out.println("Material: " + Chair.material);
        System.out.println("Color: " + Chair.color);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Height: " + height);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}