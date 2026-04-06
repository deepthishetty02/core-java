class JustEatRunner {

    public static void main(String[] args) {
   int cost = 0;
   cost = JustEat.chooseMeal("Dosa");
        System.out.println("Single meal price : " + cost);
   int totalCost = JustEat.chooseMeal("Dosa", cost, 3);
        System.out.println("Total meal cost : " + totalCost);
}
}