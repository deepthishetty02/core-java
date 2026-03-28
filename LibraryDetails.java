class LibraryDetails{

    static String libraryName = "Central Library";
    static int totalBooks = 5000;
    static String city = "Bangalore";

    public static void main(String[] args){

        String memberName;
        int memberId;
        double fineAmount;

        memberName = "Kiran";
        memberId = 210;
        fineAmount = 120.75;

        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("City: " + city);
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Fine Amount: " + fineAmount);
    }
}