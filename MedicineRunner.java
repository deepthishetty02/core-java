class MedicineRunner {
    public static void main(String[] args) {

        Medicine obj1 = new Medicine("Paracetamol", "500mg", 20);
        obj1.display();

        Medicine obj2 = new Medicine("Dolo", "650mg", 30);
        obj2.display();

        Medicine obj3 = new Medicine("Crocin", "500mg", 25);
        obj3.display();

        Medicine obj4 = new Medicine("Azithromycin", "250mg", 80);
        obj4.display();

        Medicine obj5 = new Medicine("Ibuprofen", "400mg", 40);
        obj5.display();

        Medicine obj6 = new Medicine("Cetrizine", "10mg", 15);
        obj6.display();

        Medicine obj7 = new Medicine("Amoxicillin", "500mg", 90);
        obj7.display();
    }
}