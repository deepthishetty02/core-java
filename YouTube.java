class YouTube {

    String channelName;
    String category;
    int subscribers;
    long channelId;
    boolean monetized;

    public YouTube(String p1, String p2, int p3, long p4, boolean p5) {
        channelName = p1;
        category = p2;
        subscribers = p3;
        channelId = p4;
        monetized = p5;
    }

    public void display() {
        System.out.println(channelName);
        System.out.println(category);
        System.out.println(subscribers);
        System.out.println(channelId);
        System.out.println(monetized);
        System.out.println("------------");
    }
}