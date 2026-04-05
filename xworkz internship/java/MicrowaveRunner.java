class MicrowaveRunner{

public static void main(String[] args){

Microwave.checkMicrowaveIsOnOrOff();
Microwave.turnOnMicrowave();
Microwave.checkMicrowaveIsOnOrOff();

int currentTimer = Microwave.getCurrentTimer();
System.out.println("Current Timer : " + currentTimer);

System.out.println("*****" + Microwave.increaseTimer());
System.out.println("*****" + Microwave.increaseTimer());
System.out.println("*****" + Microwave.increaseTimer());

System.out.println("-----" + Microwave.decreaseTimer());
System.out.println("-----" + Microwave.decreaseTimer());

}
}