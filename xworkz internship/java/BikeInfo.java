class BikeInfo{
public static void main(String[]args){
boolean isElectric;
int modelYear;
String brand;
double price;
char rating;

isElectric=false;
modelYear=2022;
brand="Honda";
price=95000.75;
rating='A';

System.out.println("Brand: "+brand);
System.out.println("Model Year: "+modelYear);
System.out.println("Price: "+price);
System.out.println("Electric: "+isElectric);
System.out.println("Rating: "+rating);

isElectric=true;
modelYear=2024;
brand="Ola";
price=125000.50;
rating='B';

System.out.println("----After Change----");
System.out.println("Brand: "+brand);
System.out.println("Model Year: "+modelYear);
System.out.println("Price: "+price);
System.out.println("Electric: "+isElectric);
System.out.println("Rating: "+rating);
}
}