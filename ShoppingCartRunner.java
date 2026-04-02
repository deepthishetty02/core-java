class ShoppingCartRunner {

    public static void main(String[] args) {

        ShoppingCart s1 = new ShoppingCart("Shoes");
        s1.display();

        ShoppingCart s2 = new ShoppingCart("Bag", 2);
        s2.display();

        ShoppingCart s3 = new ShoppingCart("Watch", 1, 1999.99);
        s3.display();

    }
}