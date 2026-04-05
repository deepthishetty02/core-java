class KFCRunner {

    public static void main(String[] args) {

        int price = KFC.getPrice("Chicken Bucket", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = KFC.getPrice("Zinger Burger", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = KFC.getPrice("Popcorn Chicken", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = KFC.getPrice("French Fries", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

    }
}