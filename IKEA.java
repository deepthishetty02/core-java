class IKEA{
public static void main(String[] args)
        {
                String[] furniture={"Chair","Table","Bed","Sofa","Cupboard","Shelf","Drawer","Desk","Stool",
				"Bench","Rack","Wardrobe","Cabinet","Stand","Cot"};
                String[] kitchenItems={"Plate","Spoon","Fork","Knife","Pan","Cooker","Bottle","Glass","Bowl"
				,"Tray","Jar","Box","Tiffin","Container","Lid"};
                String[] decor={"Lamp","Clock","Mirror","Frame","Vase","Plant","Carpet","Mat","Curtain","Cushion",
				"Cover","Light","Stand","Art","Showpiece"};
                String[] storage={"Box","Basket","Organizer","Bin","Rack","Shelf","Drawer","Case","Bag","Holder"
				,"Stand","Container","Cabinet","Tray","Folder"};
                String[] tools={"Hammer","Screwdriver","Drill","Wrench","Cutter","Pliers","Saw","Tape","Level",
				"Clamp","Knife","Blade","Spanner","ToolKit","Nails"};

                System.out.println("0:"+furniture[0]);
                System.out.println("1:"+furniture[1]);
                System.out.println("2:"+furniture[2]);
                System.out.println("3:"+furniture[3]);
                System.out.println("4:"+furniture[4]);
                System.out.println("5:"+furniture[5]);
                System.out.println("6:"+furniture[6]);
                System.out.println("7:"+furniture[7]);
                System.out.println("8:"+furniture[8]);
                System.out.println("9:"+furniture[9]);
                System.out.println("10:"+furniture[10]);
                System.out.println("11:"+furniture[11]);
                System.out.println("12:"+furniture[12]);
                System.out.println("13:"+furniture[13]);
                System.out.println("14:"+furniture[14]);

                for(int i=0;i<kitchenItems.length;i++)
                {
                        System.out.println(kitchenItems[i]);
                }

                for(String x:decor)
                {
                        System.out.println(x);
                }

                for(int i=0;i<storage.length;i++)
                {
                        System.out.println(storage[i]);
                }
                for(String y:tools)
                {
                        System.out.println(y);
           }
  }
}