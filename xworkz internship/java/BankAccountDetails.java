class BankAccountDetails{

    static String bankName = "SBI";
    static String branchName = "Mandya";
    static int IFSCCode = 123456;

    public static void main(String[] args){

        String accountHolder = "Deepu";
        int accountNumber = 987654;
        double balance = 25000.75;

        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("IFSC Code: " + IFSCCode);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}