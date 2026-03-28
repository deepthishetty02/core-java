class WashingMachine{

static boolean isWashingMachineOnOrOffButton = false;
static int maxSpeed = 10;
static int minSpeed = 0;
static int currentSpeed;

static void checkWashingMachineIsOnOrOff(){

if(isWashingMachineOnOrOffButton == false){
System.out.println("checking : WASHING MACHINE IS OFF");
}else{
System.out.println("checking : WASHING MACHINE IS ON");
}

}

static void turnOnWashingMachine(){
System.out.println("Turning On the WASHING MACHINE");
isWashingMachineOnOrOffButton = true;
}

static int getCurrentSpeed(){
return currentSpeed;
}

static int increaseSpeed(){

if(isWashingMachineOnOrOffButton == true){

System.out.println("yes Washing Machine is on I am ready to increase speed");

if(currentSpeed < 10){
currentSpeed = currentSpeed + 1;
}else{
System.out.println("Machine already in MAX speed");
}

}else{
System.out.println("Machine is OFF");
}

return currentSpeed;
}

static int decreaseSpeed(){

if(isWashingMachineOnOrOffButton == true){

System.out.println("yes Washing Machine is on I am ready to decrease speed");

if(currentSpeed > 0){
currentSpeed = currentSpeed - 1;
}else{
System.out.println("Machine already in MIN speed");
}

}else{
System.out.println("Machine is OFF");
}

return currentSpeed;
}

}