class HospitalInfo {

    
    static String hospitalName = "City Hospital";
    static int doctorCount = 25;
    static double rating = 4.5;
    static String location = "Bangalore";
    static String speciality = "Cardiology";

    public static void main(String[] args) {

       
        String hospitalName = "Apollo Hospital";
        int doctorCount = 40;
        double rating = 4.8;
        String location = "Mysore";
        String speciality = "Neurology";

        
        System.out.println("----- Static Variables -----");
        System.out.println("Hospital Name: " + HospitalInfo.hospitalName);
        System.out.println("Doctor Count: " + HospitalInfo.doctorCount);
        System.out.println("Rating: " + HospitalInfo.rating);
        System.out.println("Location: " + HospitalInfo.location);
        System.out.println("Speciality: " + HospitalInfo.speciality);

        
        System.out.println("----- Local Variables -----");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Doctor Count: " + doctorCount);
        System.out.println("Rating: " + rating);
        System.out.println("Location: " + location);
        System.out.println("Speciality: " + speciality);
    }
}