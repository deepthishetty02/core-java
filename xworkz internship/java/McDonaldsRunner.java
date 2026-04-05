class McDonaldsRunner {

    public static void main(String[] args) {

        int price = McDonalds.getPrice("McAloo Tikki", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = McDonalds.getPrice("McChicken Burger", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = McDonalds.getPrice("Fries", 2);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = McDonalds.getPrice("Coke", 1);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

        price = McDonalds.getPrice("Veg Wrap", 2);
        if (price == 0) {
            System.out.println("Item not found");
        } else {
            System.out.println(price);
        }

    }
}