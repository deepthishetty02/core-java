class SpotifyRunner {
    public static void main(String[] args) {

        Spotify obj1 = new Spotify("Song1", "Artist1", 210, 1010101010L, true);
        obj1.display();

        Spotify obj2 = new Spotify("Song2", "Artist2", 180, 2020202020L, false);
        obj2.display();

        Spotify obj3 = new Spotify("Song3", "Artist3", 240, 3030303030L, true);
        obj3.display();

        Spotify obj4 = new Spotify("Song4", "Artist4", 200, 4040404040L, false);
        obj4.display();

        Spotify obj5 = new Spotify("Song5", "Artist5", 300, 5050505050L, true);
        obj5.display();

        Spotify obj6 = new Spotify("Song6", "Artist6", 150, 6060606060L, false);
        obj6.display();

        Spotify obj7 = new Spotify("Song7", "Artist7", 260, 7070707070L, true);
        obj7.display();
    }
}