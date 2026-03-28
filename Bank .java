class Bank {

    static String bankName = "SBI";
    static int branches = 1200;
    static double interestRate = 6.5;
    static boolean loanFacility = true;
    static char category = 'A';

    public static void main(String[] args) {

        String bankName = "HDFC";
        int branches = 800;
        double interestRate = 7.2;
        boolean loanFacility = false;
        char category = 'B';

        System.out.println("---- Static Variables ----");
        System.out.println("Bank Name: " + Bank.bankName);
        System.out.println("Branches: " + Bank.branches);
        System.out.println("Interest Rate: " + Bank.interestRate);
        System.out.println("Loan Facility: " + Bank.loanFacility);
        System.out.println("Category: " + Bank.category);

        System.out.println("---- Local Variables ----");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branches: " + branches);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Loan Facility: " + loanFacility);
        System.out.println("Category: " + category);
    }
}