class HotelService{

static void hotelName(){
System.out.println("AMARAVATHI");
}

static void roomBooking(String customerName , String roomType){
System.out.println("Customer Name : " + customerName + " Room Type : " + roomType);
}

static int getRoomNumber(){
int roomNo = 205;
return roomNo;
}

static int totalBill(int foodBill , int roomBill){
int totalAmount = foodBill + roomBill;
return totalAmount;
}

}