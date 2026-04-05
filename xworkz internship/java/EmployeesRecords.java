class EmployeesRecords{
public static void main(String[]args){
String employeeNames;
int totalEmployees;
double averageSalary;
char departmentCode;
boolean isHiring;

employeeNames="Rohit,Anita";
totalEmployees=120;
averageSalary=45000.75;
departmentCode='H';
isHiring=true;

System.out.println("Employees: "+employeeNames);
System.out.println("Total: "+totalEmployees);
System.out.println("Average Salary: "+averageSalary);
System.out.println("Dept Code: "+departmentCode);
System.out.println("Hiring: "+isHiring);

employeeNames="Kavya,Arjun";
totalEmployees=135;
averageSalary=48000.50;
departmentCode='F';
isHiring=false;

System.out.println("----After Change----");
System.out.println("Employees: "+employeeNames);
System.out.println("Total: "+totalEmployees);
System.out.println("Average Salary: "+averageSalary);
System.out.println("Dept Code: "+departmentCode);
System.out.println("Hiring: "+isHiring);
}
}