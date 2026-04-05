class McDonalds {

    public static int getPrice(String name, int size) {

        if (name == "McAloo Tikki" && size == 1) {
            return 50;
        } else if (name == "McChicken Burger" && size == 1) {
            return 120;
        } else if (name == "Fries" && size == 2) {
            return 140;
        } else if (name == "Coke" && size == 1) {
            return 60;
        } else if (name == "Veg Wrap" && size == 2) {
            return 180;
        } else {
            return 0;
        }
    }
}