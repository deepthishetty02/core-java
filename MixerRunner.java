class MixerRunner{

public static void main(String[] args){

Mixer.checkMixerIsOnOrOff();
Mixer.turnOnMixer();
Mixer.checkMixerIsOnOrOff();

int currentSpeed = Mixer.getCurrentSpeed();
System.out.println("Current Speed : " + currentSpeed);

System.out.println("*****" + Mixer.increaseSpeed());
System.out.println("*****" + Mixer.increaseSpeed());
System.out.println("*****" + Mixer.increaseSpeed());

System.out.println("-----" + Mixer.decreaseSpeed());
System.out.println("-----" + Mixer.decreaseSpeed());

}
}