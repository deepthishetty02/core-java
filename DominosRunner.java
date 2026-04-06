class DominosRunner {

    public static void main(String[] args) {

        int cost = 0;
        cost = Dominos.orderFood("Veg Pizza");
        System.out.println("Cost of one item : " + cost);
        int total = Dominos.orderFood("Veg Pizza", cost, 2);
        System.out.println("Final amount : " + total);
    }
}