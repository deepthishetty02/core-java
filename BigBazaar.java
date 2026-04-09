class BigBazaar {
public static void main(String[] args) {

        String[] groceries={"Rice","Dal","Oil","Salt","Sugar","Tea","Coffee","Milk","Curd",
		"Butter","Cheese","Flour","Spices","Honey","Ghee"};
        String[] garments={"Shirt","Pant","Tshirt","Jeans","Kurti","Saree","Jacket","Shorts","Skirt"
		,"Blazer","Sweater","Top","Leggings","Dress","Dupatta"};
        String[] beauty={"Soap","Shampoo","FaceWash","Cream","Lotion","Perfume","Powder"
		,"Lipstick","Kajal","Serum","Sunscreen","FacePack","Deo","Gel","Oil"};
        String[] kitchen={"Plate","Spoon","Fork","Knife","Pan","Cooker","Bottle","Glass","Bowl","Tray","Jar",
		"Box","Tiffin","Container","Lid"};
        String[] appliances={"TV","Mobile","Laptop","Fan","Iron","Mixer","Grinder","AC","Fridge","Washer",
		"Speaker","Mouse","Keyboard","Charger","Light"};

        System.out.println("0:"+groceries[0]);
        System.out.println("1:"+groceries[1]);
        System.out.println("2:"+groceries[2]);
        System.out.println("3:"+groceries[3]);
        System.out.println("4:"+groceries[4]);
        System.out.println("5:"+groceries[5]);
        System.out.println("6:"+groceries[6]);
        System.out.println("7:"+groceries[7]);
        System.out.println("8:"+groceries[8]);
        System.out.println("9:"+groceries[9]);
        System.out.println("10:"+groceries[10]);
        System.out.println("11:"+groceries[11]);
        System.out.println("12:"+groceries[12]);
        System.out.println("13:"+groceries[13]);
        System.out.println("14:"+groceries[14]);

        for(int i=0;i<garments.length;i++){
            System.out.println(garments[i]);
       }
        for(String a:beauty){
            System.out.println(a);
     }
       for(int i=0;i<kitchen.length;i++){
            System.out.println(kitchen[i]);
      }
        for(String b:appliances){
            System.out.println(b);
    }

}
}