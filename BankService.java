class BankService{

static void bankGreeting(){
System.out.println("Welcome to Bank");
}

static void openAccount(String customerName,String accountType){
System.out.println(customerName+" opened "+accountType+" account");
}

static int generateToken(){
int token = 15;
return token;
}

static int addBalance(int depositOne,int depositTwo){
int totalBalance = depositOne + depositTwo;
return totalBalance;
}

}