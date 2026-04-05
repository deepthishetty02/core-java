class Facebook {

    String userName;
    String email;
    int friendsCount;
    long accountId;
    boolean isActive;

    public Facebook(String p1, String p2, int p3, long p4, boolean p5) {
        userName = p1;
        email = p2;
        friendsCount = p3;
        accountId = p4;
        isActive = p5;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(email);
        System.out.println(friendsCount);
        System.out.println(accountId);
        System.out.println(isActive);
        System.out.println("------------");
    }
}