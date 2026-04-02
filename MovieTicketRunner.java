class MovieTicketRunner {

    public static void main(String[] args) {

        MovieTicket t1 = new MovieTicket("Leo");
        t1.display();

        MovieTicket t2 = new MovieTicket("KGF", 2);
        t2.display();

        MovieTicket t3 = new MovieTicket("RRR", 3, 750.0);
        t3.display();

    }
}