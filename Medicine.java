class Medicine {

    String medicineName;
    String dosage;
    int price;

    public Medicine() {
    }

    public Medicine(String medicineName, String dosage, int price) {
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.price = price;
    }

    public void display() {
        System.out.println(medicineName);
        System.out.println(dosage);
        System.out.println(price);
        System.out.println("-------------------");
    }
}