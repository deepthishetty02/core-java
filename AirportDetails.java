class AirportDetails{

    static String airportName = "Kempegowda International Airport";
    static int totalGates = 40;
    static String city = "Bangalore";

    public static void main(String[] args){

        String passengerName;
        int flightNumber;
        double baggageWeight;

        passengerName = "Varun";
        flightNumber = 6021;
        baggageWeight = 18.75;

        System.out.println("Airport Name: " + airportName);
        System.out.println("Total Gates: " + totalGates);
        System.out.println("City: " + city);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Baggage Weight: " + baggageWeight);
    }
}