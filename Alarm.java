class Alaram {

    static String brand = "Philips";
    static int volumeLevel = 5;
    static double price = 1200.50;
    static String color = "Black";
    static String type = "Digital";

    public static void main(String[] args) {

        String brand = "Casio";
        int volumeLevel = 8;
        double price = 1500.75;
        String color = "White";
        String type = "Analog";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + Alaram.brand);
        System.out.println("Volume Level: " + Alaram.volumeLevel);
        System.out.println("Price: " + Alaram.price);
        System.out.println("Color: " + Alaram.color);
        System.out.println("Type: " + Alaram.type);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Volume Level: " + volumeLevel);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}