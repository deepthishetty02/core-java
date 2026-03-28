class RestaurantService{

static void restaurantGreeting(){
System.out.println("Welcome to Restaurant");
}

static void placeOrder(String customerName,String foodItem){
System.out.println(customerName+" ordered "+foodItem);
}

static int tableAllocation(){
int table = 6;
return table;
}

static int calculateFoodBill(int dishOnePrice,int dishTwoPrice){
int foodBill = dishOnePrice + dishTwoPrice;
return foodBill;
}

}