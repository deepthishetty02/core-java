class HotelService{

static void hotelGreeting(){
System.out.println("Welcome to Hotel");
}

static void roomBooking(String guestName,String roomType){
System.out.println(guestName+" booked "+roomType+" room");
}

static int roomNumber(){
int room = 203;
return room;
}

static int calculateStayCost(int dayOneCost,int dayTwoCost){
int stayCost = dayOneCost + dayTwoCost;
return stayCost;
}

}