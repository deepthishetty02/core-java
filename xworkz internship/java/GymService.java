class GymService{

static void gymEntry(){
System.out.println("Welcome to Gym");
}

static void joinMembership(String memberName,String planType){
System.out.println(memberName+" joined "+planType+" plan");
}

static int trainerId(){
int trainer = 7;
return trainer;
}

static int totalWorkoutDays(int dayOne,int dayTwo){
int workoutDays = dayOne + dayTwo;
return workoutDays;
}

}