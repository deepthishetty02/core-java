class Netflix {

    String showName;
    String genre;
    int episodes;
    long showId;
    boolean isTrending;

    public Netflix(String p1, String p2, int p3, long p4, boolean p5) {
        showName = p1;
        genre = p2;
        episodes = p3;
        showId = p4;
        isTrending = p5;
    }

    public void display() {
        System.out.println(showName);
        System.out.println(genre);
        System.out.println(episodes);
        System.out.println(showId);
        System.out.println(isTrending);
        System.out.println("------------");
    }
}