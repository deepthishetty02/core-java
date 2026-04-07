class Handbag{
 static void openBag(){
          System.out.println("Bag opened");
          checkBrand("Lavie");
}
static void checkBrand(String brand) {
         System.out.println("Brand: " + brand);
    	int code = getCode();
          System.out.println("Bag Code: " + code);
}
static int getCode()
 {
       return 909;
  }
}

