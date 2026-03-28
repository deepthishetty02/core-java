class BusService{

static void busGreeting(){
System.out.println("Welcome to bus");
}

static void passengerCheckIn(String passengerName,String busNumber){
System.out.println(passengerName+" checked in for bus "+busNumber);
}

static int gateNo(){
int gate = 5;
return gate;
}

static int calculateBagWeight(int bagOne,int bagTwo){
int totalWeight = bagOne + bagTwo;
return totalWeight;
}

}