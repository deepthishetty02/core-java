class Ac{
 static void getName() {
        System.out.println("Godrej");
        getPrice(50000);
 }
	static void getPrice(int price) {
        System.out.println("Price: " + price);
        int code = getCode();
        System.out.println("Code of ac: " + code);
}
   static int getCode() {
        return 001;
    }
}