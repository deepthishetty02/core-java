class BookMyShow {

    String movieName;
    String theatre;
    int seats;

    public BookMyShow() {
    }

    public BookMyShow(String movieName, String theatre, int seats) {
        this.movieName = movieName;
        this.theatre = theatre;
        this.seats = seats;
    }

    public void display() {
        System.out.println(movieName);
        System.out.println(theatre);
        System.out.println(seats);
        System.out.println("-------------------");
    }
}