class HotelDetails{

    static String hotelName = "Royal Stay";
    static int totalRooms = 120;
    static String city = "Mangalore";

    public static void main(String[] args){

        String guestName;
        int roomNumber;
        double billAmount;

        guestName = "Sneha";
        roomNumber = 305;
        billAmount = 8750.50;

        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("City: " + city);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Bill Amount: " + billAmount);
    }
}