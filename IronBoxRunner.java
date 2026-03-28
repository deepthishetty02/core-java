class IronBoxRunner{

public static void main(String[] args){

IronBox.checkIronIsOnOrOff();
IronBox.turnOnIron();
IronBox.checkIronIsOnOrOff();

int currentTemp = IronBox.getCurrentTemp();
System.out.println("Current Temp : " + currentTemp);

System.out.println("*****" + IronBox.increaseTemp());
System.out.println("*****" + IronBox.increaseTemp());
System.out.println("*****" + IronBox.increaseTemp());

System.out.println("-----" + IronBox.decreaseTemp());
System.out.println("-----" + IronBox.decreaseTemp());

}
}