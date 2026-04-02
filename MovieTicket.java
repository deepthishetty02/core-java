class MovieTicket {

    String movieName;
    int seats;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    MovieTicket(String movieName, int seats) {
        this.movieName = movieName;
        this.seats = seats;
    }

    MovieTicket(String movieName, int seats, double price) {
        this.movieName = movieName;
        this.seats = seats;
        this.price = price;
    }

    void display() {
        System.out.println(movieName);
        System.out.println(seats);
        System.out.println(price);
        System.out.println("-----------");
    }
}