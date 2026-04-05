class IronBox{

static boolean isIronOnOrOffButton = false;
static int maxTemp = 200;
static int minTemp = 50;
static int currentTemp;

static void checkIronIsOnOrOff(){

if(isIronOnOrOffButton == false){
System.out.println("checking : IRON BOX IS OFF");
}else{
System.out.println("checking : IRON BOX IS ON");
}

}

static void turnOnIron(){
System.out.println("Turning On the IRON BOX");
isIronOnOrOffButton = true;
}

static int getCurrentTemp(){
return currentTemp;
}

static int increaseTemp(){

if(isIronOnOrOffButton == true){

System.out.println("yes Iron is on I am ready to increase temp");

if(currentTemp < 200){
currentTemp = currentTemp + 1;
}else{
System.out.println("Iron already in MAX temp");
}

}else{
System.out.println("Iron is OFF");
}

return currentTemp;
}

static int decreaseTemp(){

if(isIronOnOrOffButton == true){

System.out.println("yes Iron is on I am ready to decrease temp");

if(currentTemp > 50){
currentTemp = currentTemp - 1;
}else{
System.out.println("Iron already in MIN temp");
}

}else{
System.out.println("Iron is OFF");
}

return currentTemp;
}

}