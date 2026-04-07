class Airport{

static void checkIn(){
System.out.println("Passenger checked in");
verifyFlight("AI202");
}
static void verifyFlight(String flight){
System.out.println("Flight: " + flight);

int gate = getGate();
System.out.println("Gate No: " + gate);
}
static int getGate(){
return 5;
}

}
