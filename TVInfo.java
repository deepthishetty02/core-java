class TVInfo{

    static String brand;
    static String model;
    static int price;
    static int size;
    static int warranty;
    static String type;
    static String color;

    public static void setBrand(String brandName) {
        brand = brandName;
        System.out.println(brand);
    }

    public static void setModel(String modelName) {
        model = modelName;
        System.out.println(model);
    }

    public static void setPrice(int cost) {
        price = cost;
        System.out.println(price);
    }

    public static void setSize(int tvSize) {
        size = tvSize;
        System.out.println(size);
    }

    public static void setWarranty(int years) {
        warranty = years;
        System.out.println(warranty);
    }

    public static void setType(String tvType) {
        type = tvType;
        System.out.println(type);
    }

    public static void setColor(String tvColor) {
        color = tvColor;
        System.out.println(color);
    }
}