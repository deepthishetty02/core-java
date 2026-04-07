class Ipad
{

static void open(){
System.out.println("iPad opened");
showVersion("iOS17");
}
static void showVersion(String v){
System.out.println("Version: "+v);
int price=getPrice();
System.out.println("Price: "+price);
}
static int getPrice(){
return 50000;
}
}
