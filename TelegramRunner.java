class TelegramRunner {
    public static void main(String[] args) {

        Telegram obj1 = new Telegram("Deepu", "9876543210", 15, 1010101010L, true);
        obj1.display();

        Telegram obj2 = new Telegram("Anu", "9123456780", 8, 2020202020L, false);
        obj2.display();

        Telegram obj3 = new Telegram("Meena", "9012345678", 20, 3030303030L, true);
        obj3.display();

        Telegram obj4 = new Telegram("Kiran", "9988776655", 12, 4040404040L, false);
        obj4.display();

        Telegram obj5 = new Telegram("Vijay", "9090909090", 25, 5050505050L, true);
        obj5.display();

        Telegram obj6 = new Telegram("Gundi", "9345678123", 10, 6060606060L, false);
        obj6.display();

        Telegram obj7 = new Telegram("Varshini", "9786453210", 18, 7070707070L, true);
        obj7.display();
    }
}