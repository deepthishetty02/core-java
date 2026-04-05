class SkinSerum{

static long checkSerumStock(String serumBrand, long quantity){

System.out.println("Checking serum stock in the store");

if(quantity > 50){
System.out.println("Serum brand available : " + serumBrand);
System.out.println("Stock is sufficient in the shop");
}

if(quantity > 20){
System.out.println("Serum demand is high in the market");
}
else{
System.out.println("Serum demand is low currently");
}

return quantity;

}

}