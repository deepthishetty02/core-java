class Amazon {

    String productName;
    String category;
    int quantity;
    long orderId;
    boolean isDelivered;

    public Amazon(String p1, String p2, int p3, long p4, boolean p5) {
        productName = p1;
        category = p2;
        quantity = p3;
        orderId = p4;
        isDelivered = p5;
    }

    public void display() {
        System.out.println(productName);
        System.out.println(category);
        System.out.println(quantity);
        System.out.println(orderId);
        System.out.println(isDelivered);
        System.out.println("------------");
    }
}