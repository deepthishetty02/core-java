class KFCRunner {
public static void main(String[] args) {

        int value = 0;
       value = KFC.getOrder("Zinger");
        System.out.println("Price of item : " + value);

        int total = KFC.getOrder("Zinger", value, 2);
        System.out.println("Total payable : " + total);
    }
}