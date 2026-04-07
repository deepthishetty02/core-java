class Plants {
   static void growPlant() {
        System.out.println("Plant is growing");
        showType("Indoor");
    }
static void showType(String type) {
        System.out.println("Type: " + type);
       int height = getHeight();
        System.out.println("Height: " + height);
}
static int getHeight() {
        return 25;
}

}
