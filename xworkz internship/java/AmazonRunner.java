class AmazonRunner {
    public static void main(String[] args) {

        Amazon obj1 = new Amazon("Laptop", "Electronics", 2, 1111000011L, true);
        obj1.display();

        Amazon obj2 = new Amazon("Shoes", "Fashion", 1, 2222000022L, false);
        obj2.display();

        Amazon obj3 = new Amazon("Book", "Education", 3, 3333000033L, true);
        obj3.display();

        Amazon obj4 = new Amazon("Watch", "Accessories", 1, 4444000044L, false);
        obj4.display();

        Amazon obj5 = new Amazon("Bag", "Travel", 2, 5555000055L, true);
        obj5.display();

        Amazon obj6 = new Amazon("Phone", "Electronics", 1, 6666000066L, true);
        obj6.display();

        Amazon obj7 = new Amazon("Bottle", "Home", 4, 7777000077L, false);
        obj7.display();
    }
}