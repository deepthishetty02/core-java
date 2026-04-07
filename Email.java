class Email
{
static void send(){
System.out.println("Mail sent");
checkTo("user@gmail.com");
 }
static void checkTo(String to){
System.out.println("To: "+to);
int size=getSize();
System.out.println("Size: "+size);
}
  static int getSize(){
return 2;
}
}
