class EasyBuy 
{
  public static void main(String[] args) {

        String[] fashion={"Shirt","Pant","Tshirt","Jeans","Kurti","Saree","Jacket","Shorts","Skirt"
		,"Blazer","Sweater","Top","Leggings","Dress","Dupatta"};
        String[] accessories={"Watch","Belt","Cap","Bag","Wallet","Sunglass","Scarf","HairBand",
		"Clip","Chain","Bracelet","Ring","Earring","Pendant","Band"};
        String[] beauty={"Soap","Shampoo","FaceWash","Cream","Lotion","Perfume","Powder","Lipstick","Kajal",
		"Serum","Sunscreen","FacePack","Deo","Gel","Oil"};
        String[] footwear={"Shoes","Sandals","Slippers","Heels","Boots","Loafers","Sneakers","Flipflops",
		"SportsShoes","FormalShoes","CasualShoes","Ethnic","Canvas","PartyWear","Running"};
        String[] home={"Chair","Table","Bed","Sofa","Mat","Curtain","Pillow","Blanket","Cover","Stand",
		"Shelf","Lamp","Clock","Mirror","Bucket"};

        System.out.println("0:"+fashion[0]);
        System.out.println("1:"+fashion[1]);
        System.out.println("2:"+fashion[2]);
        System.out.println("3:"+fashion[3]);
        System.out.println("4:"+fashion[4]);
        System.out.println("5:"+fashion[5]);
        System.out.println("6:"+fashion[6]);
        System.out.println("7:"+fashion[7]);
        System.out.println("8:"+fashion[8]);
        System.out.println("9:"+fashion[9]);
        System.out.println("10:"+fashion[10]);
        System.out.println("11:"+fashion[11]);
        System.out.println("12:"+fashion[12]);
        System.out.println("13:"+fashion[13]);
        System.out.println("14:"+fashion[14]);

        for(int i=0;i<accessories.length;i++){
            System.out.println(accessories[i]);
      }
        for(String a:beauty){
            System.out.println(a);
          }
        for(int i=0;i<footwear.length;i++){
            System.out.println(footwear[i]);
          }
        for(String b:home){
            System.out.println(b);
      }

  }
}