class Keyboard {
 static void getKey() {
        System.out.println("Key pressed");
       displayModel("Mechanical");
    }
static void displayModel(String model) {
        System.out.println("Model: " + model);
        int value = generateCode();
        System.out.println("Keyboard Code: " + value);
  }
static int generateCode() {
        return 222;
    }

}


