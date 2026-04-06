class McDonaldsRunner {
public static void main(String[] args) {
     int value = 0;

        value = McDonalds.getMenu("Fries");
        System.out.println("Price of item : " + value);
        int totalValue = McDonalds.getMenu("Fries", value, 4);
        System.out.println("Total cost : " + totalValue);
    }
}