class PicsartRunner {
    public static void main(String[] args) {

        Picsart obj1 = new Picsart("Crop", "Basic", 5000);
        obj1.display();

        Picsart obj2 = new Picsart("Blur", "Effect", 4200);
        obj2.display();

        Picsart obj3 = new Picsart("Sticker", "Creative", 6100);
        obj3.display();

        Picsart obj4 = new Picsart("Filter", "Color", 7200);
        obj4.display();

        Picsart obj5 = new Picsart("Text", "Design", 3800);
        obj5.display();

        Picsart obj6 = new Picsart("Sketch", "Art", 2900);
        obj6.display();

        Picsart obj7 = new Picsart("Background", "Edit", 4500);
        obj7.display();

    }
}