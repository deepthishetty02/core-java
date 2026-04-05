class PhonePay {

    String transactionId;
    String receiverName;
    int amount;

    public PhonePay() {
    }

    public PhonePay(String transactionId, String receiverName, int amount) {
        this.transactionId = transactionId;
        this.receiverName = receiverName;
        this.amount = amount;
    }

    public void display() {
        System.out.println(transactionId);
        System.out.println(receiverName);
        System.out.println(amount);
        System.out.println("-------------------");
    }
}