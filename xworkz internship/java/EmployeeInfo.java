class EmployeeInfo {

    static String companyName = "Infosys";
    static int employeeId = 5001;
    static double salary = 45000.0;
    static String department = "HR";
    static String location = "Bangalore";

    public static void main(String[] args) {

        
        String companyName = "TCS";
        int employeeId = 7002;
        double salary = 60000.0;
        String department = "Development";
        String location = "Mysore";

        System.out.println("----- Static Variables -----");
        System.out.println("Company Name: " + EmployeeInfo.companyName);
        System.out.println("Employee ID: " + EmployeeInfo.employeeId);
        System.out.println("Salary: " + EmployeeInfo.salary);
        System.out.println("Department: " + EmployeeInfo.department);
        System.out.println("Location: " + EmployeeInfo.location);

        
        System.out.println("----- Local Variables -----");
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Location: " + location);
    }
}