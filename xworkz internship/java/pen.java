class Pen {

    static String brand = "Reynolds";
    static int price = 10;
    static double length = 14.5;
    static String inkColor = "Blue";
    static String type = "Ball";

    public static void main(String[] args) {

        String brand = "Cello";
        int price = 20;
        double length = 15.0;
        String inkColor = "Black";
        String type = "Gel";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + Pen.brand);
        System.out.println("Price: " + Pen.price);
        System.out.println("Length: " + Pen.length);
        System.out.println("Ink Color: " + Pen.inkColor);
        System.out.println("Type: " + Pen.type);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Type: " + type);
    }
}