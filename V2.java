class V2{
public static void main(String[] args)
   {
		String[] foodItems={"Rice","Dal","Oil","Salt","Sugar","Tea","Coffee","Milk","Curd","Butter"
			,"Cheese","Flour","Spices","Honey","Ghee"};
         String[] dresses={"Shirt","Pant","Tshirt","Jeans","Kurti","Saree","Jacket","Shorts","Skirt",
		  "Blazer","Sweater","Top","Leggings","Dress","Dupatta"};
          String[] skinCare={"Soap","Shampoo","FaceWash","Cream","Lotion","Perfume","Powder","Lipstick",
			"Kajal","Serum","Sunscreen","FacePack","Deo","Gel","Oil"};
          String[] shoes={"Shoes","Sandals","Slippers","Heels","Boots","Loafers","Sneakers","Flipflops",
			"SportsShoes","FormalShoes","CasualShoes","Ethnic","Canvas","PartyWear","Running"};
          String[] gadgets={"TV","Mobile","Laptop","Fan","Iron","Mixer","Grinder","AC","Fridge","Washer",
			 "Speaker","Mouse","Keyboard","Charger","Light"};

                System.out.println("0:"+foodItems[0]);
                System.out.println("1:"+foodItems[1]);
                System.out.println("2:"+foodItems[2]);
                System.out.println("3:"+foodItems[3]);
                System.out.println("4:"+foodItems[4]);
                System.out.println("5:"+foodItems[5]);
                System.out.println("6:"+foodItems[6]);
                System.out.println("7:"+foodItems[7]);
                System.out.println("8:"+foodItems[8]);
                System.out.println("9:"+foodItems[9]);
                System.out.println("10:"+foodItems[10]);
                System.out.println("11:"+foodItems[11]);
                System.out.println("12:"+foodItems[12]);
                System.out.println("13:"+foodItems[13]);
                System.out.println("14:"+foodItems[14]);

            for(int i=0;i<dresses.length;i++){
                    System.out.println(dresses[i]);
                }
            for(String x:skinCare){
                   System.out.println(x);
                }

             for(int i=0;i<shoes.length;i++){
			     System.out.println(shoes[i]);
			 }
              for(String y:gadgets){
                     System.out.println(y);
   }
 }
}