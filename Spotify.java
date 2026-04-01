class Spotify {

    String songName;
    String artistName;
    int duration;
    long songId;
    boolean isDownloaded;

    public Spotify(String p1, String p2, int p3, long p4, boolean p5) {
        songName = p1;
        artistName = p2;
        duration = p3;
        songId = p4;
        isDownloaded = p5;
    }

    public void display() {
        System.out.println(songName);
        System.out.println(artistName);
        System.out.println(duration);
        System.out.println(songId);
        System.out.println(isDownloaded);
        System.out.println("------------");
    }
}