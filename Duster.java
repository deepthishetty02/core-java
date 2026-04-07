class Duster {
	static void drive() {
    System.out.println("Car running");
    showFuel("Diesel");
}
static void showFuel(String fuel) {
    System.out.println("Fuel: " + fuel);
       int speed = getSpeed();
        System.out.println("Speed: " + speed);
 }
static int getSpeed() {
     return 180;
}
}

