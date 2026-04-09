class Zara {
   public static void main(String[] args) {

        String[] clothing={"Shirt","Pant","Tshirt","Jeans","Kurti","Saree","Jacket","Shorts","Skirt","Blazer","Sweater","Top","Leggings","Dress","Dupatta"};
        String[] accessories={"Watch","Belt","Cap","Bag","Wallet","Sunglass","Scarf","HairBand","Clip","Chain","Bracelet","Ring","Earring","Pendant","Band"};
        String[] footwear={"Shoes","Sandals","Slippers","Heels","Boots","Loafers","Sneakers","Flipflops","SportsShoes","FormalShoes","CasualShoes","Ethnic","Canvas","PartyWear","Running"};
        String[] beauty={"Soap","Shampoo","FaceWash","Cream","Lotion","Perfume","Powder","Lipstick","Kajal","Serum","Sunscreen","FacePack","Deo","Gel","Oil"};
        String[] bags={"Handbag","Backpack","Clutch","Wallet","Sling","LaptopBag","TravelBag","Tote","Pouch","GymBag","SideBag","OfficeBag","MiniBag","ShoulderBag","Duffel"};

        System.out.println("0:"+clothing[0]);
        System.out.println("1:"+clothing[1]);
        System.out.println("2:"+clothing[2]);
        System.out.println("3:"+clothing[3]);
        System.out.println("4:"+clothing[4]);
        System.out.println("5:"+clothing[5]);
        System.out.println("6:"+clothing[6]);
        System.out.println("7:"+clothing[7]);
        System.out.println("8:"+clothing[8]);
        System.out.println("9:"+clothing[9]);
        System.out.println("10:"+clothing[10]);
        System.out.println("11:"+clothing[11]);
        System.out.println("12:"+clothing[12]);
        System.out.println("13:"+clothing[13]);
        System.out.println("14:"+clothing[14]);

        for(int i=0;i<accessories.length;i++){
            System.out.println(accessories[i]);
        }
        for(String a:footwear){
            System.out.println(a);
        }
        for(int i=0;i<beauty.length;i++){
            System.out.println(beauty[i]);
        }

        for(String b:bags){
            System.out.println(b);
      }

}
}