class HeadPhonesRunner {

    public static void main(String[] args) {

        HeadPhones.name();

        HeadPhones.booking("Varshini");

        int price = HeadPhones.getPrice();
        System.out.println("Price: " + price);

        int total = HeadPhones.totalBill(price);
        System.out.println("Total Bill: " + total);
		
	
    }
}