class CollegeService{

static void collegeIntro(){
System.out.println("Welcome to College");
}

static void registerStudent(String studentName,String course){
System.out.println(studentName+" joined "+course);
}

static int classroomNumber(){
int room = 101;
return room;
}

static int calculateMarks(int markOne,int markTwo){
int totalMarks = markOne + markTwo;
return totalMarks;
}

}