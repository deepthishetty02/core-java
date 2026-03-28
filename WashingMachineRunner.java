class WashingMachineRunner{

public static void main(String[] args){

WashingMachine.checkWashingMachineIsOnOrOff();
WashingMachine.turnOnWashingMachine();
WashingMachine.checkWashingMachineIsOnOrOff();

int currentSpeed = WashingMachine.getCurrentSpeed();
System.out.println("Current Speed : " + currentSpeed);

System.out.println("*****" + WashingMachine.increaseSpeed());
System.out.println("*****" + WashingMachine.increaseSpeed());
System.out.println("*****" + WashingMachine.increaseSpeed());

System.out.println("-----" + WashingMachine.decreaseSpeed());
System.out.println("-----" + WashingMachine.decreaseSpeed());

}
}