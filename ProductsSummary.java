class ProductsSummary{
public static void main(String[]args){
String productNames;
int totalProducts;
double totalValue;
char warehouseSection;
boolean isStockAvailable;
productNames="Laptop,Mouse";
totalProducts=200;
totalValue=150000.75;
warehouseSection='A';
isStockAvailable=true;
System.out.println("Products: "+productNames);
System.out.println("Total Products: "+totalProducts);
System.out.println("Total Value: "+totalValue);
System.out.println("Section: "+warehouseSection);
System.out.println("Stock Available: "+isStockAvailable);
productNames="Tablet,Keyboard";
totalProducts=180;
totalValue=125000.50;
warehouseSection='B';
isStockAvailable=false;
System.out.println("----After Change----");
System.out.println("Products: "+productNames);
System.out.println("Total Products: "+totalProducts);
System.out.println("Total Value: "+totalValue);
System.out.println("Section: "+warehouseSection);
System.out.println("Stock Available: "+isStockAvailable);
}
}