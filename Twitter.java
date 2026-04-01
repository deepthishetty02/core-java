class Twitter {

    String userName;
    String handle;
    int followers;
    long tweetId;
    boolean verified;

    public Twitter(String p1, String p2, int p3, long p4, boolean p5) {
        userName = p1;
        handle = p2;
        followers = p3;
        tweetId = p4;
        verified = p5;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(handle);
        System.out.println(followers);
        System.out.println(tweetId);
        System.out.println(verified);
        System.out.println("------------");
    }
}