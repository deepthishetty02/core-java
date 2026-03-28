class DominosRunner {

    public static void main(String[] args) {

        int price = Dominos.getPrice("Margherita", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = Dominos.getPrice("Farmhouse", 2);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = Dominos.getPrice("Peppy Paneer", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = Dominos.getPrice("Veg Extravaganza", 2);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

    }
}