class ShoeRunner {
    public static void main(String[] args) {

        Shoe s1 = new Shoe();
        s1.brand = "Nike";
        s1.type = "Sports";
        s1.size = 9;
        s1.price = 4999;
        s1.color = "Black";
        s1.isAvailable = true;
        s1.rating = 4.5;

        Shoe s2 = new Shoe();
        s2.brand = "Adidas";
        s2.type = "Running";
        s2.size = 8;
        s2.price = 3999;
        s2.color = "White";
        s2.isAvailable = true;
        s2.rating = 4.3;

        Shoe s3 = new Shoe();
        s3.brand = "Puma";
        s3.type = "Casual";
        s3.size = 7;
        s3.price = 2999;
        s3.color = "Blue";
        s3.isAvailable = false;
        s3.rating = 4.2;

        Shoe s4 = new Shoe();
        s4.brand = "Reebok";
        s4.type = "Training";
        s4.size = 10;
        s4.price = 4599;
        s4.color = "Gray";
        s4.isAvailable = true;
        s4.rating = 4.4;

        Shoe s5 = new Shoe();
        s5.brand = "Skechers";
        s5.type = "Walking";
        s5.size = 9;
        s5.price = 5499;
        s5.color = "Red";
        s5.isAvailable = false;
        s5.rating = 4.6;

        System.out.println("Shoe 1");
        System.out.println(s1.brand);
        System.out.println(s1.type);
        System.out.println(s1.size);
        System.out.println(s1.price);
        System.out.println(s1.color);
        System.out.println(s1.isAvailable);
        System.out.println(s1.rating);

        System.out.println("Shoe 2");
        System.out.println(s2.brand);
        System.out.println(s2.type);
        System.out.println(s2.size);
        System.out.println(s2.price);
        System.out.println(s2.color);
        System.out.println(s2.isAvailable);
        System.out.println(s2.rating);

        System.out.println("Shoe 3");
        System.out.println(s3.brand);
        System.out.println(s3.type);
        System.out.println(s3.size);
        System.out.println(s3.price);
        System.out.println(s3.color);
        System.out.println(s3.isAvailable);
        System.out.println(s3.rating);

        System.out.println("Shoe 4");
        System.out.println(s4.brand);
        System.out.println(s4.type);
        System.out.println(s4.size);
        System.out.println(s4.price);
        System.out.println(s4.color);
        System.out.println(s4.isAvailable);
        System.out.println(s4.rating);

        System.out.println("Shoe 5");
        System.out.println(s5.brand);
        System.out.println(s5.type);
        System.out.println(s5.size);
        System.out.println(s5.price);
        System.out.println(s5.color);
        System.out.println(s5.isAvailable);
        System.out.println(s5.rating);
    }
}