class Student{

public static void main(String[] args){

String[] studentName={"Ravi","Arjun","Meena","Kiran","Sita","mia","Anu","Vikram","Divya","Naveen"};
int[] studentMarks={78,85,90,66,72,88,91,69,74,80};
double[] studentPercentage={78.5,85.2,90.4,66.7,72.1,88.3,91.6,69.5,74.8,80.0};

System.out.println("******** values at index 0 ********");
System.out.println(studentName[0]);
System.out.println(studentMarks[0]);
System.out.println(studentPercentage[0]);

System.out.println("******** values at index 1 ********");
System.out.println(studentName[1]);
System.out.println(studentMarks[1]);
System.out.println(studentPercentage[1]);

System.out.println("******** values at index 2 ********");
System.out.println(studentName[2]);
System.out.println(studentMarks[2]);
System.out.println(studentPercentage[2]);

System.out.println("******** values at index 3 ********");
System.out.println(studentName[3]);
System.out.println(studentMarks[3]);
System.out.println(studentPercentage[3]);

System.out.println("******** values at index 4 ********");
System.out.println(studentName[4]);
System.out.println(studentMarks[4]);
System.out.println(studentPercentage[4]);

System.out.println("******** values at index 5 ********");
System.out.println(studentName[5]);
System.out.println(studentMarks[5]);
System.out.println(studentPercentage[5]);

System.out.println("******** values at index 6 ********");
System.out.println(studentName[6]);
System.out.println(studentMarks[6]);
System.out.println(studentPercentage[6]);

System.out.println("******** values at index 7 ********");
System.out.println(studentName[7]);
System.out.println(studentMarks[7]);
System.out.println(studentPercentage[7]);

System.out.println("******** values at index 8 ********");
System.out.println(studentName[8]);
System.out.println(studentMarks[8]);
System.out.println(studentPercentage[8]);

System.out.println("******** values at index 9 ********");
System.out.println(studentName[9]);
System.out.println(studentMarks[9]);
System.out.println(studentPercentage[9]);

for(String name:studentName){
System.out.println(name);
}

for(int marks:studentMarks){
System.out.println(marks);
}

for(double percentage:studentPercentage){
System.out.println(percentage);
}
}
}