class Reliance{

public static void main(String[] args){

String[] essentials={"Rice","Dal","Oil","Salt","Sugar","Tea","Coffee","Milk","Curd","Butter","Cheese","Flour","Spices","Honey","Ghee"};
String[] fashion={"Shirt","Pant","Tshirt","Jeans","Kurti","Saree","Jacket","Shorts","Skirt","Blazer","Sweater","Top","Leggings","Dress","Dupatta"};
String[] gadgets={"TV","Mobile","Laptop","Fan","Iron","Mixer","Grinder","AC","Fridge","Washer","Speaker","Mouse","Keyboard","Charger","Light"};
String[] beauty={"Soap","Shampoo","FaceWash","Cream","Lotion","Perfume","Powder","Lipstick","Kajal","Serum","Sunscreen","FacePack","Deo","Gel","Oil"};
String[] snacks={"Chips","Biscuits","Cake","Bread","Rusk","Noodles","Pasta","Soup","Oats","Popcorn","Candy","Chocolate","Namkeen","Cookies","Snacks"};

System.out.println("0:"+essentials[0]);
System.out.println("1:"+essentials[1]);
System.out.println("2:"+essentials[2]);
System.out.println("3:"+essentials[3]);
System.out.println("4:"+essentials[4]);
System.out.println("5:"+essentials[5]);
System.out.println("6:"+essentials[6]);
System.out.println("7:"+essentials[7]);
System.out.println("8:"+essentials[8]);
System.out.println("9:"+essentials[9]);
System.out.println("10:"+essentials[10]);
System.out.println("11:"+essentials[11]);
System.out.println("12:"+essentials[12]);
System.out.println("13:"+essentials[13]);
System.out.println("14:"+essentials[14]);

for(int i=0;i<fashion.length;i++){
System.out.println(fashion[i]);
}
for(String x:gadgets){
System.out.println(x);
}
for(int i=0;i<beauty.length;i++){
System.out.println(beauty[i]);
}

for(String y:snacks){
System.out.println(y);
}

}
}