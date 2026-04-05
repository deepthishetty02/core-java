class Yahoo {

    String mailId;
    String subject;
    int inboxCount;

    public Yahoo() {
    }

    public Yahoo(String mailId, String subject, int inboxCount) {
        this.mailId = mailId;
        this.subject = subject;
        this.inboxCount = inboxCount;
    }

    public void display() {
        System.out.println(mailId);
        System.out.println(subject);
        System.out.println(inboxCount);
        System.out.println("-------------------");
    }
}