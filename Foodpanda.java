class Foodpanda {
  static int checkDish(String dish) {
        int price=0;
    if("FriedRice"==dish){
            System.out.println("Dish ordered : "+dish);
            price=150;
            return price;
        }
       else if("Manchurian"==dish){
            System.out.println("Dish ordered : "+dish);
            price=130;
            return price;
        }
            else if("Roll"==dish){
            System.out.println("Dish ordered : "+dish);
            price=90;
            return price;
        }
       else if("Soup"==dish){
            System.out.println("Dish ordered : "+dish);
            price=110;
            return price;
        }
        else if("Momos"==dish){
            System.out.println("Dish ordered : "+dish);
            price=100;
            return price;
        }
             else if("Cake"==dish){
            System.out.println("Dish ordered : "+dish);
            price=200;
            return price;
        }
        else{
            System.out.println("Dish unavailable");
            return 0;  }
}
    static int checkDish(String dish,int price,int qty){
        int totalPrice=0;

        if("FriedRice"==dish){
            totalPrice=price*qty;
            return totalPrice;
        }
          else if("Manchurian"==dish){
            totalPrice=price*qty;
            return totalPrice;
        }
      else if("Roll"==dish){
            totalPrice=price*qty;
            return totalPrice;
        }
          else if("Soup"==dish){
            totalPrice=price*qty;
            return totalPrice;
        }
      else if("Momos"==dish){
            totalPrice=price*qty;
            return totalPrice;
        }
      else if("Cake"==dish){
            totalPrice=price*qty;
            return totalPrice;
        }
        else{
         return 0;
   }
 }
}