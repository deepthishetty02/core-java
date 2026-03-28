class Bag {

    public static void main(String[] args) {

        System.out.println("Welcome to Bag Store");
        getBag();

        int schoolBag = 800;
        int travelBag = 1200;
        String result = "TOTAL BAG PRICE";

        calculatePrice(schoolBag, travelBag, result);

        boolean available = isAvailable();
        System.out.println(available);
    }

    static void getBag() {
        System.out.println("This is Bag Store");
    }

    static void calculatePrice(int schoolBag, int travelBag, String result) {
        int total = schoolBag + travelBag;
        System.out.println(total);
        System.out.println(result);
    }

    static boolean isAvailable() {
        boolean stock = true;
        return stock;
    }
}