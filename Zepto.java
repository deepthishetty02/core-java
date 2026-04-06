class Zepto { 

static int checkItem(String itemName) {
       int price = 0;
       if("Milk" == itemName) {
            System.out.println("Item is : " + itemName);
             price = 50;
              return price;
        } else if("Bread" == itemName) {
            System.out.println("Item is : " + itemName);
             price = 40;
             return price;
       } else if("Eggs" == itemName) {
            System.out.println("Item is : " + itemName);
            price = 120;
             return price;
          } else if("Rice" == itemName) {
            System.out.println("Item is : " + itemName);
              price = 70;
             return price;
           } else if("Sugar" == itemName) {
            System.out.println("Item is : " + itemName);
            price = 45;
             return price;
       } else if("Oil" == itemName) {
            System.out.println("Item is : " + itemName);
            price = 150;
            return price;
        } else {
            System.out.println("No Items found");
           return 0;
  }
 }

static int checkItem(String itemName, int price, int noItems) {
  int totalPrice = 0;

     if("Milk" == itemName) {
         totalPrice = price * noItems;
            return totalPrice;
      } else if("Bread" == itemName) {
          totalPrice = price * noItems;
            return totalPrice;
        } else if("Eggs" == itemName) {
            totalPrice = price * noItems;
             return totalPrice;
         } else if("Rice" == itemName) {
             totalPrice = price * noItems;
            return totalPrice;
       } else if("Sugar" == itemName) {
            totalPrice = price * noItems;
              return totalPrice;
        } else if("Oil" == itemName) {
              totalPrice = price * noItems;
            return totalPrice;
        } 
		else {
            return 0;
    }
}
}