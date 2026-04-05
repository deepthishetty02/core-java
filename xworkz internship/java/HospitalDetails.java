class HospitalDetails{

    static String hospitalName = "CityCare";
    static int totalDoctors = 45;
    static String location = "Mysore";

    public static void main(String[] args){

        String patientName;
        int patientId;
        double billAmount;

        patientName = "Ananya";
        patientId = 301;
        billAmount = 15000.50;

        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Total Doctors: " + totalDoctors);
        System.out.println("Location: " + location);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Bill Amount: " + billAmount);
    }
}