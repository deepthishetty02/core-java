class Whatsapp {
static void sendMsg(){
System.out.println("Message sent");
checkContact("Deepu");
    }
static void checkContact(String name){
System.out.println("Contact: "+name);
int count=getCount();
System.out.println("Messages: "+count);
     }
static int getCount(){
return 25;
    }
}
