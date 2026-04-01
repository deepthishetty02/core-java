class NetflixRunner {
    public static void main(String[] args) {

        Netflix obj1 = new Netflix("Show1", "Drama", 10, 9090909090L, true);
        obj1.display();

        Netflix obj2 = new Netflix("Show2", "Comedy", 8, 8080808080L, false);
        obj2.display();

        Netflix obj3 = new Netflix("Show3", "Action", 12, 7070707070L, true);
        obj3.display();

        Netflix obj4 = new Netflix("Show4", "Horror", 6, 6060606060L, false);
        obj4.display();

        Netflix obj5 = new Netflix("Show5", "Thriller", 9, 5050505050L, true);
        obj5.display();

        Netflix obj6 = new Netflix("Show6", "Romance", 7, 4040404040L, false);
        obj6.display();

        Netflix obj7 = new Netflix("Show7", "Sci-Fi", 11, 3030303030L, true);
        obj7.display();
    }
}