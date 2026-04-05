class PrinterRunner {
    public static void main(String[] args) {

        Printer obj1 = new Printer("HP", "Laser", 12000);
        obj1.display();

        Printer obj2 = new Printer("Canon", "Inkjet", 8000);
        obj2.display();

        Printer obj3 = new Printer("Epson", "InkTank", 15000);
        obj3.display();

        Printer obj4 = new Printer("Brother", "Laser", 14000);
        obj4.display();

        Printer obj5 = new Printer("Samsung", "Laser", 11000);
        obj5.display();

        Printer obj6 = new Printer("Ricoh", "Inkjet", 9000);
        obj6.display();

        Printer obj7 = new Printer("Xerox", "Laser", 16000);
        obj7.display();
    }
}