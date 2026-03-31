class LaptopRunner {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.brand = "Dell";
        l1.model = "Inspiron";
        l1.price = 50000;
        l1.color = "Black";
        l1.isAvailable = true;
        l1.ram = 8;
        l1.rating = 4.2;

        Laptop l2 = new Laptop();
        l2.brand = "HP";
        l2.model = "Pavilion";
        l2.price = 60000;
        l2.color = "Silver";
        l2.isAvailable = true;
        l2.ram = 16;
        l2.rating = 4.5;

        Laptop l3 = new Laptop();
        l3.brand = "Lenovo";
        l3.model = "ThinkPad";
        l3.price = 70000;
        l3.color = "Black";
        l3.isAvailable = false;
        l3.ram = 8;
        l3.rating = 4.3;

        Laptop l4 = new Laptop();
        l4.brand = "Apple";
        l4.model = "MacBook Air";
        l4.price = 100000;
        l4.color = "Gray";
        l4.isAvailable = true;
        l4.ram = 8;
        l4.rating = 4.8;

        Laptop l5 = new Laptop();
        l5.brand = "Asus";
        l5.model = "ROG";
        l5.price = 90000;
        l5.color = "Red";
        l5.isAvailable = false;
        l5.ram = 16;
        l5.rating = 4.6;

        System.out.println("Laptop 1");
        System.out.println(l1.brand);
        System.out.println(l1.model);
        System.out.println(l1.price);
        System.out.println(l1.color);
        System.out.println(l1.isAvailable);
        System.out.println(l1.ram);
        System.out.println(l1.rating);

        System.out.println("Laptop 2");
        System.out.println(l2.brand);
        System.out.println(l2.model);
        System.out.println(l2.price);
        System.out.println(l2.color);
        System.out.println(l2.isAvailable);
        System.out.println(l2.ram);
        System.out.println(l2.rating);

        System.out.println("Laptop 3");
        System.out.println(l3.brand);
        System.out.println(l3.model);
        System.out.println(l3.price);
        System.out.println(l3.color);
        System.out.println(l3.isAvailable);
        System.out.println(l3.ram);
        System.out.println(l3.rating);

        System.out.println("Laptop 4");
        System.out.println(l4.brand);
        System.out.println(l4.model);
        System.out.println(l4.price);
        System.out.println(l4.color);
        System.out.println(l4.isAvailable);
        System.out.println(l4.ram);
        System.out.println(l4.rating);

        System.out.println("Laptop 5");
        System.out.println(l5.brand);
        System.out.println(l5.model);
        System.out.println(l5.price);
        System.out.println(l5.color);
        System.out.println(l5.isAvailable);
        System.out.println(l5.ram);
        System.out.println(l5.rating);
    }
}