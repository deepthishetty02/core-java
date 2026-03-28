class DMart {

    public static int getPrice(String item, int quantity) {

        if (item == "Rice" && quantity == 1) {
            return 60;
        } else if (item == "Milk" && quantity == 1) {
            return 50;
        } else if (item == "Sugar" && quantity == 1) {
            return 45;
        } else if (item == "Oil" && quantity == 1) {
            return 120;
        } else {
            return 0;
        }
    }
}