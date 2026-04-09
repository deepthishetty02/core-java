class VishalMart{

public static void main(String[] args){

String[] food={"Rice","Dal","Oil","Salt","Sugar","Tea","Coffee"
,"Milk","Curd","Butter","Cheese","Flour","Spices","Honey","Ghee"};

String[] clothes={"Shirt","Pant","Tshirt","Jeans","Kurti","Saree"
,"Jacket","Shorts","Skirt","Blazer","Sweater","Top","Leggings","Dress","Dupatta"};

String[] cosmetics={"Soap","Shampoo","FaceWash","Cream","Lotion",
"Perfume","Powder","Lipstick","Kajal","Serum","Sunscreen","FacePack","Deo","Gel","Oil"};

String[] footwear={"Shoes","Sandals","Slippers","Heels","Boots","Loafers","Sneakers",
"Flipflops","SportsShoes","FormalShoes","CasualShoes","Ethnic","Canvas","PartyWear","Running"};

String[] electronics={"TV","Mobile","Laptop","Fan","Iron","Mixer","Grinder","AC","Fridge"
,"Washer","Speaker","Mouse","Keyboard","Charger","Light"};

System.out.println("0:"+food[0]);
System.out.println("1:"+food[1]);
System.out.println("2:"+food[2]);
System.out.println("3:"+food[3]);
System.out.println("4:"+food[4]);
System.out.println("5:"+food[5]);
System.out.println("6:"+food[6]);
System.out.println("7:"+food[7]);
System.out.println("8:"+food[8]);
System.out.println("9:"+food[9]);
System.out.println("10:"+food[10]);
System.out.println("11:"+food[11]);
System.out.println("12:"+food[12]);
System.out.println("13:"+food[13]);
System.out.println("14:"+food[14]);

for(int i=0;i<clothes.length;i++){
System.out.println(clothes[i]);
}

for(String x:cosmetics){
System.out.println(x);
}

for(int i=0;i<footwear.length;i++){
System.out.println(footwear[i]);
}
for(String y:electronics){
System.out.println(y);
}

}
}