class HeaterRunner{

public static void main(String[] args){

Heater.checkHeaterIsOnOrOff();
Heater.turnOnHeater();
Heater.checkHeaterIsOnOrOff();

int currentTemp = Heater.getCurrentTemp();
System.out.println("Current Temp : " + currentTemp);

System.out.println("*****" + Heater.increaseTemp());
System.out.println("*****" + Heater.increaseTemp());
System.out.println("*****" + Heater.increaseTemp());

System.out.println("-----" + Heater.decreaseTemp());
System.out.println("-----" + Heater.decreaseTemp());

}
}