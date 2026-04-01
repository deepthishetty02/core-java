class Flipkart {

    String itemName;
    String sellerName;
    int rating;
    long orderNumber;
    boolean isReturnable;

    public Flipkart(String p1, String p2, int p3, long p4, boolean p5) {
        itemName = p1;
        sellerName = p2;
        rating = p3;
        orderNumber = p4;
        isReturnable = p5;
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(sellerName);
        System.out.println(rating);
        System.out.println(orderNumber);
        System.out.println(isReturnable);
        System.out.println("------------");
    }
}