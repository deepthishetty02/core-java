class Light{

static boolean isLightOnOrOffButton = false;
static int maxBrightness = 10;
static int minBrightness = 0;
static int currentBrightness;

static void checkLightIsOnOrOff(){

if(isLightOnOrOffButton == false){
System.out.println("checking : LIGHT IS OFF");
}else{
System.out.println("checking : LIGHT IS ON");
}

}

static void turnOnLight(){
System.out.println("Turning On the LIGHT");
isLightOnOrOffButton = true;
}

static int getCurrentBrightness(){
return currentBrightness;
}

static int increaseBrightness(){

if(isLightOnOrOffButton == true){

System.out.println("yes Light is on I am ready to increase brightness");

if(currentBrightness < 10){
currentBrightness = currentBrightness + 1;
}else{
System.out.println("Light already in MAX brightness");
}

}else{
System.out.println("Light is OFF");
}

return currentBrightness;
}

static int decreaseBrightness(){

if(isLightOnOrOffButton == true){

System.out.println("yes Light is on I am ready to decrease brightness");

if(currentBrightness > 0){
currentBrightness = currentBrightness - 1;
}else{
System.out.println("Light already in MIN brightness");
}

}else{
System.out.println("Light is OFF");
}

return currentBrightness;
}

}