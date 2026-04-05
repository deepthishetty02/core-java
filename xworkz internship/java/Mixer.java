class Mixer{

static boolean isMixerOnOrOffButton = false;
static int maxSpeed = 5;
static int minSpeed = 0;
static int currentSpeed;

static void checkMixerIsOnOrOff(){

if(isMixerOnOrOffButton == false){
System.out.println("checking : MIXER IS OFF");
}else{
System.out.println("checking : MIXER IS ON");
}

}

static void turnOnMixer(){
System.out.println("Turning On the MIXER");
isMixerOnOrOffButton = true;
}

static int getCurrentSpeed(){
return currentSpeed;
}

static int increaseSpeed(){

if(isMixerOnOrOffButton == true){

System.out.println("yes Mixer is on I am ready to increase speed");

if(currentSpeed < 5){
currentSpeed = currentSpeed + 1;
}else{
System.out.println("Mixer already in MAX speed");
}

}else{
System.out.println("Mixer is OFF");
}

return currentSpeed;
}

static int decreaseSpeed(){

if(isMixerOnOrOffButton == true){

System.out.println("yes Mixer is on I am ready to decrease speed");

if(currentSpeed > 0){
currentSpeed = currentSpeed - 1;
}else{
System.out.println("Mixer already in MIN speed");
}

}else{
System.out.println("Mixer is OFF");
}

return currentSpeed;
}

}