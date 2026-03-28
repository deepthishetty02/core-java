class Amazon {

    
    static String productName = "Laptop";
    static int productId = 1001;
    static double price = 55000.0;
    static String category = "Electronics";
    static String seller = "Amazon Seller";

    public static void main(String[] args) {

        
        String productName = "Mobile";
        int productId = 2002;
        double price = 25000.0;
        String category = "Gadgets";
        String seller = "Cloud Retail";

        
        System.out.println("----- Static Variables -----");
        System.out.println("Product Name: " + Amazon.productName);
        System.out.println("Product ID: " + Amazon.productId);
        System.out.println("Price: " + Amazon.price);
        System.out.println("Category: " + Amazon.category);
        System.out.println("Seller: " + Amazon.seller);

        
        System.out.println("----- Local Variables -----");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Seller: " + seller);
    }
}