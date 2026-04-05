class Gym{

static int checkWorkout(String memberName, int hours){

System.out.println("Checking workout hours of the member");

if(hours > 2){
System.out.println("Member name : " + memberName);
System.out.println("Workout hours are good");
}

if(hours >= 1){
System.out.println("Member has completed minimum workout");
}
else{
System.out.println("Member workout is less");
}

return hours;

}

}