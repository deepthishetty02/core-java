class Refrigerator{

static boolean isRefrigeratorOnOrOffButton = false;
static int maxCool = 10;
static int minCool = -10;
static int currentCool;

static void checkRefrigeratorIsOnOrOff(){

if(isRefrigeratorOnOrOffButton == false){
System.out.println("checking : REFRIGERATOR IS OFF");
}else{
System.out.println("checking : REFRIGERATOR IS ON");
}

}

static void turnOnRefrigerator(){
System.out.println("Turning On the REFRIGERATOR");
isRefrigeratorOnOrOffButton = true;
}

static int getCurrentCool(){
return currentCool;
}

static int increaseCool(){

if(isRefrigeratorOnOrOffButton == true){

System.out.println("yes Refrigerator is on I am ready to increase cooling");

if(currentCool < 10){
currentCool = currentCool + 1;
}else{
System.out.println("Refrigerator already in MAX cooling");
}

}else{
System.out.println("Refrigerator is OFF");
}

return currentCool;
}

static int decreaseCool(){

if(isRefrigeratorOnOrOffButton == true){

System.out.println("yes Refrigerator is on I am ready to decrease cooling");

if(currentCool > -10){
currentCool = currentCool - 1;
}else{
System.out.println("Refrigerator already in MIN cooling");
}

}else{
System.out.println("Refrigerator is OFF");
}

return currentCool;
}

}