class LipstickRunner {

    public static void main(String[] args) {

        Lipstick app1 = new Lipstick();

        app1.brandName = "Lakme";
        app1.shadeName = "Red Velvet";
        app1.userName = "rahul@123";
        app1.id = 401;
        app1.ownerName = "Rahul";
        app1.isAvailable = true;
        app1.price = 499;


        Lipstick app2 = new Lipstick();

        app2.brandName = "Maybelline";
        app2.shadeName = "Pink Crush";
        app2.userName = "sneha@123";
        app2.id = 402;
        app2.ownerName = "Sneha";
        app2.isAvailable = true;
        app2.price = 599;


        Lipstick app3 = new Lipstick();

        app3.brandName = "MAC";
        app3.shadeName = "Ruby Woo";
        app3.userName = "arjun@123";
        app3.id = 403;
        app3.ownerName = "Arjun";
        app3.isAvailable = false;
        app3.price = 1500;


        Lipstick app4 = new Lipstick();

        app4.brandName = "Nykaa";
        app4.shadeName = "Wine Shot";
        app4.userName = "pooja@123";
        app4.id = 404;
        app4.ownerName = "Pooja";
        app4.isAvailable = true;
        app4.price = 399;


        Lipstick app5 = new Lipstick();

        app5.brandName = "Colorbar";
        app5.shadeName = "Peachy Nude";
        app5.userName = "kiran@123";
        app5.id = 405;
        app5.ownerName = "Kiran";
        app5.isAvailable = false;
        app5.price = 699;


        System.out.println(" **********");
        System.out.println("app1 brandName: " + app1.brandName);
        System.out.println("app1 shadeName: " + app1.shadeName);
        System.out.println("app1 userName :" + app1.userName);
        System.out.println("app1 id : " + app1.id);
        System.out.println("app1 ownerName: " + app1.ownerName);
        System.out.println("app1 isAvailable:" + app1.isAvailable);
        System.out.println("app1 price:" + app1.price);


        System.out.println(" *********");
        System.out.println("app2 brandName: " + app2.brandName);
        System.out.println("app2 shadeName: " + app2.shadeName);
        System.out.println("app2 userName :" + app2.userName);
        System.out.println("app2 id : " + app2.id);
        System.out.println("app2 ownerName: " + app2.ownerName);
        System.out.println("app2 isAvailable:" + app2.isAvailable);
        System.out.println("app2 price:" + app2.price);


        System.out.println(" **********");
        System.out.println("app3 brandName: " + app3.brandName);
        System.out.println("app3 shadeName: " + app3.shadeName);
        System.out.println("app3 userName :" + app3.userName);
        System.out.println("app3 id : " + app3.id);
        System.out.println("app3 ownerName: " + app3.ownerName);
        System.out.println("app3 isAvailable:" + app3.isAvailable);
        System.out.println("app3 price:" + app3.price);


        System.out.println(" **********");
        System.out.println("app4 brandName: " + app4.brandName);
        System.out.println("app4 shadeName: " + app4.shadeName);
        System.out.println("app4 userName :" + app4.userName);
        System.out.println("app4 id : " + app4.id);
        System.out.println("app4 ownerName: " + app4.ownerName);
        System.out.println("app4 isAvailable:" + app4.isAvailable);
        System.out.println("app4 price:" + app4.price);


        System.out.println(" **********");
        System.out.println("app5 brandName: " + app5.brandName);
        System.out.println("app5 shadeName: " + app5.shadeName);
        System.out.println("app5 userName :" + app5.userName);
        System.out.println("app5 id : " + app5.id);
        System.out.println("app5 ownerName: " + app5.ownerName);
        System.out.println("app5 isAvailable:" + app5.isAvailable);
        System.out.println("app5 price:" + app5.price);

    }
}