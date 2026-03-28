class Hospital{

public static void main(String[] args){

String[] patientName={"Ravi","Anu","Kiran","Meena","Arjun","Sita","liaa","Divya","Naveen","Vikram"};
int[] patientAge={30,25,40,35,28,32,45,29,50,38};
double[] billAmount={5000,3200,7000,4500,3800,4200,6500,3000,7200,4800};

System.out.println("******** values at index 0 ********");
System.out.println(patientName[0]);
System.out.println(patientAge[0]);
System.out.println(billAmount[0]);

System.out.println("******** values at index 1 ********");
System.out.println(patientName[1]);
System.out.println(patientAge[1]);
System.out.println(billAmount[1]);

System.out.println("******** values at index 2 ********");
System.out.println(patientName[2]);
System.out.println(patientAge[2]);
System.out.println(billAmount[2]);

System.out.println("******** values at index 3 ********");
System.out.println(patientName[3]);
System.out.println(patientAge[3]);
System.out.println(billAmount[3]);

System.out.println("******** values at index 4 ********");
System.out.println(patientName[4]);
System.out.println(patientAge[4]);
System.out.println(billAmount[4]);

System.out.println("******** values at index 5 ********");
System.out.println(patientName[5]);
System.out.println(patientAge[5]);
System.out.println(billAmount[5]);

System.out.println("******** values at index 6 ********");
System.out.println(patientName[6]);
System.out.println(patientAge[6]);
System.out.println(billAmount[6]);

System.out.println("******** values at index 7 ********");
System.out.println(patientName[7]);
System.out.println(patientAge[7]);
System.out.println(billAmount[7]);

System.out.println("******** values at index 8 ********");
System.out.println(patientName[8]);
System.out.println(patientAge[8]);
System.out.println(billAmount[8]);

System.out.println("******** values at index 9 ********");
System.out.println(patientName[9]);
System.out.println(patientAge[9]);
System.out.println(billAmount[9]);

for(String name:patientName){
System.out.println(name);
}

for(int age:patientAge){
System.out.println(age);
}

for(double bill:billAmount){
System.out.println(bill);
}

}
}