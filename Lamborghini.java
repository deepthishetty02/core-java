class Lamborghini{

 static void startCar(){
System.out.println("Car started");

showModel("Aventador");
}
 static void showModel(String model){
System.out.println("Model: " + model);
int speed = getSpeed();
System.out.println("Top Speed: " + speed);
}
   static int getSpeed(){
return 350;
}

}
