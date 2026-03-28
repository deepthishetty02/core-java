class HeadPhones {
    static void name() {
        System.out.println("HeadPhones Shop");
    }

    static void booking(String customerName) {
        System.out.println("Customer Name: " + customerName);
    }

    static int getPrice() {
        return 205;
    }

    static int totalBill(int a,int b) {
		int price=a+b;
        return price ;
    }

    public static void main(String[] args) {

        HeadPhones.name();

        HeadPhones.booking("Varshini");

        int price = HeadPhones.getPrice();
        System.out.println("Price: " + price);

        int total = HeadPhones.totalBill(50,80);
        System.out.println("Total Bill: " + total);
		
	
    }

   
}

