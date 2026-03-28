class ACRunner {

    public static void main(String[] args) {

        System.out.println(AC.brandName);

        String brand = AC.getBrandName();
        System.out.println(brand);

        int ton = AC.getTonnage();
        System.out.println(ton);

        boolean inverter = AC.getIsInverter();
        System.out.println(inverter);

        double price = AC.getPrice();
        System.out.println(price);

        char rating = AC.getRating();
        System.out.println(rating);

        long serial = AC.getSerialNumber();
        System.out.println(serial);

        float power = AC.getPower();
        System.out.println(power);

    }

}