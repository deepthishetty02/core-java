class KFC {

    public static int getPrice(String name, int quantity) {

        if (name == "Chicken Bucket" && quantity == 1) {
            return 500;
        } else if (name == "Zinger Burger" && quantity == 1) {
            return 180;
        } else if (name == "Popcorn Chicken" && quantity == 1) {
            return 150;
        } else if (name == "French Fries" && quantity == 1) {
            return 100;
        } else {
            return 0;
        }
    }
}