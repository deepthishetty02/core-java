class StudentDetails {

    
    static String name = "Anjali";
    static int rollNo = 101;
    static double percentage = 85.5;
    static String course = "BCA";
    static String college = "ABC College";

    public static void main(String[] args) {

        
        String name = "Deepthi";
        int rollNo = 200;
        double percentage = 99.5;
        String course = "BCA Final Year";
        String college = "Mandavya College";

       
        System.out.println("----- Static Variables -----");
        System.out.println("Name: " + StudentDetails.name);
        System.out.println("Roll No: " + StudentDetails.rollNo);
        System.out.println("Percentage: " + StudentDetails.percentage);
        System.out.println("Course: " + StudentDetails.course);
        System.out.println("College: " + StudentDetails.college);

       
        System.out.println("----- Local Variables -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage);
        System.out.println("Course: " + course);
        System.out.println("College: " + college);
    }
}