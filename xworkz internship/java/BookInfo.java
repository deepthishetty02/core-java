class BookInfo{

    public static void main(String[] args) {

        String bookName;
        int pages;
        double price;
        char rating;
        boolean isAvailable;
        bookName = "Wings of Fire";
        pages = 250;
        price = 299.50;
        rating = 'A';
        isAvailable = true;

        System.out.println("Book Name: " + bookName);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
        bookName = "Ignited Minds";
        pages = 300;
        price = 350.75;
        rating = 'B';
        isAvailable = false;

        System.out.println("After Changing ");

        System.out.println("Book Name: " + bookName);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
    }
}