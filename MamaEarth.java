class MamaEarth {
static void useProduct() {
     System.out.println("Using product");
    checkType("FaceWash");
 }
static void checkType(String type) {
      System.out.println("Type: " + type);
        int cost = getCost();
        System.out.println("Cost: " + cost);
}
 static int getCost() {
      return 299;
 }

}
