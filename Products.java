class Products{

public static void main(String[] args){

int gymResult = Gym.checkWorkout("Rahul",3);
System.out.println(gymResult);

String lipstickResult = LipLipstick.checkLipstick("Lakme",450);
System.out.println(lipstickResult);

long serumResult = SkinSerum.checkSerumStock("VitaminC",60);
System.out.println(serumResult);

int fridgeResult = Refrigerator.checkTemperature("LG",4);
System.out.println(fridgeResult);

String chocolateResult = Chocolate.checkChocolate("Kitkat",80);
System.out.println(chocolateResult);

}

}