class WaterHeater{

static boolean isWaterHeaterOnOrOffButton = false;
static int maxTemp = 90;
static int minTemp = 30;
static int currentTemp;

static void checkWaterHeaterIsOnOrOff(){

if(isWaterHeaterOnOrOffButton == false){
System.out.println("checking : WATER HEATER IS OFF");
}else{
System.out.println("checking : WATER HEATER IS ON");
}

}

static void turnOnWaterHeater(){
System.out.println("Turning On the WATER HEATER");
isWaterHeaterOnOrOffButton = true;
}

static int getCurrentTemp(){
return currentTemp;
}

static int increaseTemp(){

if(isWaterHeaterOnOrOffButton == true){

System.out.println("yes Water Heater is on I am ready to increase temp");

if(currentTemp < 90){
currentTemp = currentTemp + 1;
}else{
System.out.println("Water Heater already in MAX temp");
}

}else{
System.out.println("Water Heater is OFF");
}

return currentTemp;
}

static int decreaseTemp(){

if(isWaterHeaterOnOrOffButton == true){

System.out.println("yes Water Heater is on I am ready to decrease temp");

if(currentTemp > 30){
currentTemp = currentTemp - 1;
}else{
System.out.println("Water Heater already in MIN temp");
}

}else{
System.out.println("Water Heater is OFF");
}

return currentTemp;
}

}