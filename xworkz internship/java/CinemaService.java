class CinemaService{

static void showGreeting(){
System.out.println("Welcome to Cinema");
}

static void ticketBooking(String viewerName,String movieTitle){
System.out.println(viewerName+" booked ticket for "+movieTitle);
}

static int screenNumber(){
int screen = 2;
return screen;
}

static int calculateTicketCost(int costOne,int costTwo){
int totalCost = costOne + costTwo;
return totalCost;
}

}