class MagicPinRunner {

public static void main(String[] args) {

        int discount = 0;
		discount = MagicPin.selectOffer("Cashback");
        System.out.println("Discount value : " + discount);
        int totalDiscount = MagicPin.selectOffer("Cashback", discount, 2);
        System.out.println("Total discount : " + totalDiscount);
		}
}