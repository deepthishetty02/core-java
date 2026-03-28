class WaterHeaterRunner{

public static void main(String[] args){

WaterHeater.checkWaterHeaterIsOnOrOff();
WaterHeater.turnOnWaterHeater();
WaterHeater.checkWaterHeaterIsOnOrOff();

int currentTemp = WaterHeater.getCurrentTemp();
System.out.println("Current Temp : " + currentTemp);

System.out.println("*****" + WaterHeater.increaseTemp());
System.out.println("*****" + WaterHeater.increaseTemp());
System.out.println("*****" + WaterHeater.increaseTemp());

System.out.println("-----" + WaterHeater.decreaseTemp());
System.out.println("-----" + WaterHeater.decreaseTemp());

}
}