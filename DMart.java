class DMart {
public static void main(String[] args) {

        String[] groceries = {"Rice","Wheat","Sugar","Salt","Oil","Dal","Tea",
		"Coffee","Milk","Butter","Cheese","Curd","Spices","Flour","Honey"};

        String[] snacks = {"Chips","Biscuits","Cookies",
		"Namkeen","Popcorn","Chocolates","Candy","Cake","Muffin","Bread","Rusk","Noodles","Pasta","Soup","Oats"};

        String[] cosmetics = {"Soap","Shampoo","Conditioner"
		,"FaceWash","Cream","Lotion","Perfume","Deo","Powder","Lipstick","Kajol","NailPolish","Serum","Sunscreen","FacePack"};

        String[] stationery = {"Pen","Pencil","Eraser","Sharpener"
		,"Scale","Notebook","Marker","Sketch","Crayons","Glue","Tape","File","Folder","Paper","Stapler"};

        String[] electronics = {"TV","Mobile","Laptop","Charger","Headphones","Speaker",
		"Mouse","Keyboard","Fan","IronBox","Mixer","Grinder","AC","Fridge","WashingMachine"};

        System.out.println("0: " + groceries[0]);
        System.out.println("1: " + groceries[1]);
        System.out.println("2: " + groceries[2]);
        System.out.println("3: " + groceries[3]);
        System.out.println("4: " + groceries[4]);
        System.out.println("5: " + groceries[5]);
        System.out.println("6: " + groceries[6]);
        System.out.println("7: " + groceries[7]);
        System.out.println("8: " + groceries[8]);
        System.out.println("9: " + groceries[9]);
        System.out.println("10: " + groceries[10]);
        System.out.println("11: " + groceries[11]);
        System.out.println("12: " + groceries[12]);
        System.out.println("13: " + groceries[13]);
        System.out.println("14: " + groceries[14]);

       for(int i=0; i<snacks.length; i++){
            System.out.println(snacks[i]);
     }

         for(String item : cosmetics){
            System.out.println(item);
    }

        for(int i=0; i<stationery.length; i++){
            System.out.println(stationery[i]);
    }
        for(String item : electronics){
            System.out.println(item);
   }

}
}