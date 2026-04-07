class Mouse{

static void click(){
System.out.println("Mouse clicked");

showType("Wireless");
}
static void showType(String type){
System.out.println("Type: " + type);

int code = getId();
System.out.println("Mouse Id: " + code);
}
static int getId(){
return 111;
}

}
