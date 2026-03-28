class SuperMarketService{

static void storeWelcome(){
System.out.println("Welcome to Supermarket");
}

static void buyProduct(String customerName,String productName){
System.out.println(customerName+" purchased "+productName);
}

static int billingCounter(){
int counter = 4;
return counter;
}

static int calculateBill(int itemPriceOne,int itemPriceTwo){
int finalBill = itemPriceOne + itemPriceTwo;
return finalBill;
}

}