class Clock {
 static void showTime() {
    System.out.println("Time showing");
     setZone("IST");
}
     static void setZone(String zone) {
        System.out.println("Zone: " + zone);
		  int hour = getHour();
          System.out.println("Hour: " + hour);
      }
 static int getHour() {
        return 10;
 }
}
