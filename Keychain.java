class Keychain{
static void openLock(){
       System.out.println("Lock opened");
         checkWeight(1500L);
}
static void checkWeight(long weight){
    System.out.println("Weight: " + weight);
           int num = getNumber();
           System.out.println("Keychain Number: " + num);
 }
  static int getNumber()
  {    
    return 333;
       }
}


