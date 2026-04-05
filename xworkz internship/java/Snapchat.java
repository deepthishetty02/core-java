class Snapchat {

    String userName;
    String snapId;
    int snapScore;
    long accountId;
    boolean isVerified;

    public Snapchat(String p1, String p2, int p3, long p4, boolean p5) {
        userName = p1;
        snapId = p2;
        snapScore = p3;
        accountId = p4;
        isVerified = p5;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(snapId);
        System.out.println(snapScore);
        System.out.println(accountId);
        System.out.println(isVerified);
        System.out.println("------------");
    }
}