class KTM {
   static void ignite() {
        System.out.println("Bike started");
     checkEngine(390L);
 }
 static void checkEngine(long cc) {
     System.out.println("Engine CC: " + cc);
      int gear = getGear();
        System.out.println("Gear: " + gear);
  }

  static int getGear() {
        return 6;
 }

}


