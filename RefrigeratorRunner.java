class RefrigeratorRunner{

public static void main(String[] args){

Refrigerator.checkRefrigeratorIsOnOrOff();
Refrigerator.turnOnRefrigerator();
Refrigerator.checkRefrigeratorIsOnOrOff();

int currentCool = Refrigerator.getCurrentCool();
System.out.println("Current Cooling : " + currentCool);

System.out.println("*****" + Refrigerator.increaseCool());
System.out.println("*****" + Refrigerator.increaseCool());
System.out.println("*****" + Refrigerator.increaseCool());

System.out.println("-----" + Refrigerator.decreaseCool());
System.out.println("-----" + Refrigerator.decreaseCool());

}
}