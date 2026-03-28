class Table {

    public static void main(String[] args) {

        System.out.println("Welcome to Furniture Store");
        getTable();

        int studyTable = 2000;
        int diningTable = 3500;
        String status = "TOTAL TABLE PRICE";
        calculatePrice(studyTable, diningTable, status);
		
        float weight =getWeight();
        System.out.println(weight);
		
		int height= 25;
		int meter=getHeight(height);
		System.out.println(meter);
		
    }

    static void getTable() {
        System.out.println("This is Furniture Store");
    }

    static void calculatePrice(int studyTable, int diningTable, String status) {
        int total = studyTable + diningTable;
        System.out.println(total);
        System.out.println(status);
    }

    static float getWeight() {
        float weight = 25.5f;
        return weight;
    }
	static  int getHeight(int height){
		System.out.println("height of the table");
		return height;
	}
}