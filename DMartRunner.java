class DMartRunner {

    public static void main(String[] args) {

        int price = DMart.getPrice("Rice", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = DMart.getPrice("Milk", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = DMart.getPrice("Sugar", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = DMart.getPrice("Oil", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

    }
}