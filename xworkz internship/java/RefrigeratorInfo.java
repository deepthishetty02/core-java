class RefrigeratorInfo {

    static String brand;
    static String model;
    static int price;
    static int capacity;
    static int doors;
    static String color;
    static int warranty;

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

    public static void setCapacity(int cap) {
        capacity = cap;
        System.out.println(capacity);
    }

    public static void setDoors(int doorCount) {
        doors = doorCount;
        System.out.println(doors);
    }

    public static void setColor(String fridgeColor) {
        color = fridgeColor;
        System.out.println(color);
    }

    public static void setWarranty(int years) {
        warranty = years;
        System.out.println(warranty);
    }
}