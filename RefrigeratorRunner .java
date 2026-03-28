class RefrigeratorRunner{

    public static void main(String[] args) {

        System.out.println(Refrigerator.brandName);

        String brand = Refrigerator.getBrandName();
        System.out.println(brand);

        int cap = Refrigerator.getCapacity();
        System.out.println(cap);

        boolean door = Refrigerator.getIsDoubleDoor();
        System.out.println(door);

        double price = Refrigerator.getPrice();
        System.out.println(price);

        char rating = Refrigerator.getRating();
        System.out.println(rating);

        long model = Refrigerator.getModelNumber();
        System.out.println(model);

        float weight = Refrigerator.getWeight();
        System.out.println(weight);

    }

}