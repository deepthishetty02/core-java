class MovieDetails{

    static String theatreName = "PVR Cinemas";
    static int totalScreens = 8;
    static String city = "Bangalore";

    public static void main(String[] args){

        String movieName;
        int showTime;
        double ticketPrice;

        movieName = "Leo";
        showTime = 7;
        ticketPrice = 250.50;

        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("City: " + city);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Show Time: " + showTime + " PM");
        System.out.println("Ticket Price: " + ticketPrice);
    }
}