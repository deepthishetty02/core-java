class Microwave{

static boolean isMicrowaveOnOrOffButton = false;
static int maxTimer = 60;
static int minTimer = 0;
static int currentTimer;

static void checkMicrowaveIsOnOrOff(){

if(isMicrowaveOnOrOffButton == false){
System.out.println("checking : MICROWAVE IS OFF");
}else{
System.out.println("checking : MICROWAVE IS ON");
}

}

static void turnOnMicrowave(){
System.out.println("Turning On the MICROWAVE");
isMicrowaveOnOrOffButton = true;
}

static int getCurrentTimer(){
return currentTimer;
}

static int increaseTimer(){

if(isMicrowaveOnOrOffButton == true){

System.out.println("yes Microwave is on I am ready to increase timer");

if(currentTimer < 60){
currentTimer = currentTimer + 1;
}else{
System.out.println("Microwave already in MAX timer");
}

}else{
System.out.println("Microwave is OFF");
}

return currentTimer;
}

static int decreaseTimer(){

if(isMicrowaveOnOrOffButton == true){

System.out.println("yes Microwave is on I am ready to decrease timer");

if(currentTimer > 0){
currentTimer = currentTimer - 1;
}else{
System.out.println("Microwave already in MIN timer");
}

}else{
System.out.println("Microwave is OFF");
}

return currentTimer;
}

}