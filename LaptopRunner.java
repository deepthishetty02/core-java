class LaptopRunner {

    public static void main(String[] args) {

        System.out.println(Laptop.brandName);

        String brand = Laptop.getBrandName();
        System.out.println(brand);

        int ram = Laptop.getRam();
        System.out.println(ram);

        boolean ssd = Laptop.getIsSSD();
        System.out.println(ssd);

        double price = Laptop.getPrice();
        System.out.println(price);

        char grade = Laptop.getGrade();
        System.out.println(grade);

        long serial = Laptop.getSerialNumber();
        System.out.println(serial);

        float weight = Laptop.getWeight();
        System.out.println(weight);

    }

}