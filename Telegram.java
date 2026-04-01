class Telegram {

    String userName;
    String phoneNumber;
    int groupsJoined;
    long userId;
    boolean isPremium;

    public Telegram(String p1, String p2, int p3, long p4, boolean p5) {
        userName = p1;
        phoneNumber = p2;
        groupsJoined = p3;
        userId = p4;
        isPremium = p5;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(phoneNumber);
        System.out.println(groupsJoined);
        System.out.println(userId);
        System.out.println(isPremium);
        System.out.println("------------");
    }
}