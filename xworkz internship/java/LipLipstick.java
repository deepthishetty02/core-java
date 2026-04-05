class LipLipstick{

static String checkLipstick(String brand, int price){

System.out.println("Checking lipstick details");

if(price < 500){
System.out.println("Lipstick brand : " + brand);
System.out.println("Lipstick price is affordable");
}

if(price >= 300){
System.out.println("This lipstick is popular in market");
}
else{
System.out.println("This lipstick is less popular");
}

return brand;

}

}