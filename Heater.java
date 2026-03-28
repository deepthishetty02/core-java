class Heater{

static boolean isHeaterOnOrOffButton = false;
static int maxTemp = 100;
static int minTemp = 20;
static int currentTemp;

static void checkHeaterIsOnOrOff(){

if(isHeaterOnOrOffButton == false){
System.out.println("checking : HEATER IS OFF");
}else{
System.out.println("checking : HEATER IS ON");
}

}

static void turnOnHeater(){
System.out.println("Turning On the HEATER");
isHeaterOnOrOffButton = true;
}

static int getCurrentTemp(){
return currentTemp;
}

static int increaseTemp(){

if(isHeaterOnOrOffButton == true){

System.out.println("yes Heater is on I am ready to increase temp");

if(currentTemp < 100){
currentTemp = currentTemp + 1;
}else{
System.out.println("Heater already in MAX temp");
}

}else{
System.out.println("Heater is OFF");
}

return currentTemp;
}

static int decreaseTemp(){

if(isHeaterOnOrOffButton == true){

System.out.println("yes Heater is on I am ready to decrease temp");

if(currentTemp > 20){
currentTemp = currentTemp - 1;
}else{
System.out.println("Heater already in MIN temp");
}

}else{
System.out.println("Heater is OFF");
}

return currentTemp;
}

}