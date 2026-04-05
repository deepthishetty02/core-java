class Bank {

    public static void main(String[] args) {

        System.out.println("Welcome to Bank");
        getBank();

        System.out.println("Add two deposit amounts");
        int savingsAmount = 5000;
        int fixedDeposit = 7000;
        String result = "TOTAL DEPOSIT";

        calculateDeposit(savingsAmount, fixedDeposit, result);

        System.out.println("What is the minimum balance?");
        long minBalance = getMinimumBalance();
        System.out.println(minBalance);
    }

    static void getBank() {
        System.out.println("This is Bank Service");
    }

    static void calculateDeposit(int savingsAmount, int fixedDeposit, String result) {
        int total = savingsAmount + fixedDeposit;
        System.out.println(total);
        System.out.println(result);
    }

    static long getMinimumBalance() {
        long balance = 1000;
        return balance;
    }
}