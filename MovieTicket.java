class MovieTicket {

    String movieName;
    int seats;
    double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public MovieTicket(String movieName, int seats) {
        this.movieName = movieName;
        this.seats = seats;
    }

    public MovieTicket(String movieName, int seats, double price) {
        this.movieName = movieName;
        this.seats = seats;
        this.price = price;
    }

    public void display() {
        System.out.println(movieName);
        System.out.println(seats);
        System.out.println(price);
        System.out.println("-----------");
    }
} 
