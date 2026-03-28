class TVRunner {

    public static void main(String[] args) {

        System.out.println(TV.brandName);

        String brand = TV.getBrandName();
        System.out.println(brand);

        int size = TV.getScreenSize();
        System.out.println(size);

        boolean smart = TV.getIsSmart();
        System.out.println(smart);

        double price = TV.getPrice();
        System.out.println(price);

        char rating = TV.getEnergyRating();
        System.out.println(rating);

        long model = TV.getModelNumber();
        System.out.println(model);

        float weight = TV.getWeight();
        System.out.println(weight);

    }

}