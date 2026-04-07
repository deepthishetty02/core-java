class Animals{
static void sound()
{
System.out.println("Animal sound");
checkName("Dog");
}
static void checkName(String name){
System.out.println("Name: "+name);
int age=getAge();
System.out.println("Age: "+age);
   }
 static int getAge(){
return 5;
}
}
