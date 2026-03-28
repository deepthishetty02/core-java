class FaceWash {

    static String brand = "Himalaya";
    static int quantity = 100;
    static double price = 180.50;
    static String skinType = "Oily";
    static String fragrance = "Neem";

    public static void main(String[] args) {

        String brand = "Garnier";
        int quantity = 150;
        double price = 220.75;
        String skinType = "Dry";
        String fragrance = "Lemon";

        System.out.println("----- Static Variables -----");
        System.out.println("Brand: " + FaceWash.brand);
        System.out.println("Quantity: " + FaceWash.quantity);
        System.out.println("Price: " + FaceWash.price);
        System.out.println("Skin Type: " + FaceWash.skinType);
        System.out.println("Fragrance: " + FaceWash.fragrance);

        System.out.println("----- Local Variables -----");
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Fragrance: " + fragrance);
    }
}