class FlipkartRunner {
    public static void main(String[] args) {

        Flipkart obj1 = new Flipkart("TV", "Seller1", 5, 1212121212L, true);
        obj1.display();

        Flipkart obj2 = new Flipkart("Mobile", "Seller2", 4, 2323232323L, false);
        obj2.display();

        Flipkart obj3 = new Flipkart("Laptop", "Seller3", 5, 3434343434L, true);
        obj3.display();

        Flipkart obj4 = new Flipkart("Chair", "Seller4", 3, 4545454545L, false);
        obj4.display();

        Flipkart obj5 = new Flipkart("Table", "Seller5", 4, 5656565656L, true);
        obj5.display();

        Flipkart obj6 = new Flipkart("Fan", "Seller6", 5, 6767676767L, false);
        obj6.display();

        Flipkart obj7 = new Flipkart("AC", "Seller7", 4, 7878787878L, true);
        obj7.display();
    }
}