class TVRunner{

public static void main(String[] args){

TV.checkTVIsOnOrOff();
TV.turnOnTV();
TV.checkTVIsOnOrOff();

int currentVolume = TV.getCurrentVolume();
System.out.println("Current Volume : " + currentVolume);

System.out.println("*****" + TV.increaseVolume());
System.out.println("*****" + TV.increaseVolume());
System.out.println("*****" + TV.increaseVolume());

System.out.println("-----" + TV.decreaseVolume());
System.out.println("-----" + TV.decreaseVolume());

}
}