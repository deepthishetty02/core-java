class FanRunner {

    public static void main(String[] args) {

        System.out.println(Fan.brandName);

        String brand = Fan.getBrandName();
        System.out.println(brand);

        int speed = Fan.getSpeed();
        System.out.println(speed);

        boolean on = Fan.getIsOn();
        System.out.println(on);

        double price = Fan.getPrice();
        System.out.println(price);

        char rating = Fan.getRating();
        System.out.println(rating);

        long model = Fan.getModelNumber();
        System.out.println(model);

        float power = Fan.getPower();
        System.out.println(power);

    }

}