class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println(accountHolder);
        System.out.println(accountNumber);
        System.out.println(balance);
        System.out.println("-----");
    }
} 
