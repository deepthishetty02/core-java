class HospitalsData{
public static void main(String[]args){
String hospitalNames;
int totalDoctors;
double totalRevenue;
char blockCode;
boolean isEmergencyAvailable;
hospitalNames="CityCare,LifeLine";
totalDoctors=85;
totalRevenue=2500000.75;
blockCode='C';
isEmergencyAvailable=true;
System.out.println("Hospitals: "+hospitalNames);
System.out.println("Total Doctors: "+totalDoctors);
System.out.println("Total Revenue: "+totalRevenue);
System.out.println("Block Code: "+blockCode);
System.out.println("Emergency Available: "+isEmergencyAvailable);
hospitalNames="MetroHealth,Sunrise";
totalDoctors=95;
totalRevenue=3000000.50;
blockCode='D';
isEmergencyAvailable=false;
System.out.println("----After Change----");
System.out.println("Hospitals: "+hospitalNames);
System.out.println("Total Doctors: "+totalDoctors);
System.out.println("Total Revenue: "+totalRevenue);
System.out.println("Block Code: "+blockCode);
System.out.println("Emergency Available: "+isEmergencyAvailable);
}
}