class HospitalService{

static void hospitalWelcome(){
System.out.println("Welcome to Hospital");
}

static void patientRegistration(String patientName,String doctorName){
System.out.println(patientName+" consulting "+doctorName);
}

static int roomAllocation(){
int room = 12;
return room;
}

static int calculateMedicalBill(int testCost,int medicineCost){
int medicalBill = testCost + medicineCost;
return medicalBill;
}

}