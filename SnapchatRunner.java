class SnapchatRunner {
    public static void main(String[] args) {

        Snapchat obj1 = new Snapchat("Deepu", "deepu_snap", 1200, 1111222233L, true);
        obj1.display();

        Snapchat obj2 = new Snapchat("Anu", "anu_snap", 800, 2222333344L, false);
        obj2.display();

        Snapchat obj3 = new Snapchat("Meena", "meena_snap", 950, 3333444455L, true);
        obj3.display();

        Snapchat obj4 = new Snapchat("Kiran", "kiran_snap", 700, 4444555566L, false);
        obj4.display();

        Snapchat obj5 = new Snapchat("Vijay", "vijay_snap", 1500, 5555666677L, true);
        obj5.display();

        Snapchat obj6 = new Snapchat("Gundi", "gundi_snap", 600, 6666777788L, false);
        obj6.display();

        Snapchat obj7 = new Snapchat("Varshini", "varshini_snap", 1100, 7777888899L, true);
        obj7.display();
    }
}