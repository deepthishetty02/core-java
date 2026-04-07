class Splendor
{
static void start(){
System.out.println("Bike started");
checkMileage(60L);
}
static void checkMileage(long mileage){
System.out.println("Mileage: "+mileage);
int id=getId();
System.out.println("Id: "+id);
}
static int getId(){
return 101;
}
}
