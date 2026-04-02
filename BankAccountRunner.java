class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Deepu");
        b1.display();

        BankAccount b2 = new BankAccount("Anu", 12345);
        b2.display();

        BankAccount b3 = new BankAccount("Meena", 67890, 5000.75);
        b3.display();

    }
}