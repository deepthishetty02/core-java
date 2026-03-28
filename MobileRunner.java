class MobileRunner {

    public static void main(String[] args) {

        System.out.println(Mobile.brandName);

        String brand = Mobile.getBrandName();
        System.out.println(brand);

        int storage = Mobile.getStorage();
        System.out.println(storage);

        boolean is5g = Mobile.getIs5G();
        System.out.println(is5g);

        double price = Mobile.getPrice();
        System.out.println(price);

        char rating = Mobile.getRating();
        System.out.println(rating);

        long imei = Mobile.getImeiNumber();
        System.out.println(imei);

        float weight = Mobile.getWeight();
        System.out.println(weight);

    }

}