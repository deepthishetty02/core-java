class Dominos {

    public static int getPrice(String name, int size) {

        if (name == "Margherita" && size == 1) {
            return 150;
        } else if (name == "Farmhouse" && size == 2) {
            return 300;
        } else if (name == "Peppy Paneer" && size == 1) {
            return 250;
        } else if (name == "Veg Extravaganza" && size == 2) {
            return 350;
        } else {
            return 0;
        }
    }
}