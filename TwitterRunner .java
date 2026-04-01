class TwitterRunner {
    public static void main(String[] args) {

        Twitter obj1 = new Twitter("Deepu", "@deepu123", 1500, 1010101010L, true);
        obj1.display();

        Twitter obj2 = new Twitter("Anu", "@anu_life", 800, 2020202020L, false);
        obj2.display();

        Twitter obj3 = new Twitter("mihul", "@mihul_official", 3200, 3030303030L, true);
        obj3.display();

        Twitter obj4 = new Twitter("Meena", "@meena_style", 1200, 4040404040L, false);
        obj4.display();

        Twitter obj5 = new Twitter("Kiran", "@kiran_tech", 2700, 5050505050L, true);
        obj5.display();

        Twitter obj6 = new Twitter("Vijay", "@vijay_music", 4100, 6060606060L, true);
        obj6.display();

        Twitter obj7 = new Twitter("Gundi", "@gundi_fun", 950, 7070707070L, false);
        obj7.display();

    }
}