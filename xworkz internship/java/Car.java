class Car{

public static void main(String[] args){

String[] carBrand={"Toyota","Honda","BMW","Audi","Kia","Hyundai","Ford","Nissan","Skoda","Mahindra"};
int[] carPrice={900000,850000,4500000,4200000,1100000,1000000,950000,880000,1200000,1300000};
double[] carMileage={18.5,19.2,14.0,15.5,20.0,21.2,17.5,18.0,19.0,16.8};

System.out.println("******** values at index 0 ********");
System.out.println(carBrand[0]);
System.out.println(carPrice[0]);
System.out.println(carMileage[0]);

System.out.println("******** values at index 1 ********");
System.out.println(carBrand[1]);
System.out.println(carPrice[1]);
System.out.println(carMileage[1]);

System.out.println("******** values at index 2 ********");
System.out.println(carBrand[2]);
System.out.println(carPrice[2]);
System.out.println(carMileage[2]);

System.out.println("******** values at index 3 ********");
System.out.println(carBrand[3]);
System.out.println(carPrice[3]);
System.out.println(carMileage[3]);

System.out.println("******** values at index 4 ********");
System.out.println(carBrand[4]);
System.out.println(carPrice[4]);
System.out.println(carMileage[4]);

System.out.println("******** values at index 5 ********");
System.out.println(carBrand[5]);
System.out.println(carPrice[5]);
System.out.println(carMileage[5]);

System.out.println("******** values at index 6 ********");
System.out.println(carBrand[6]);
System.out.println(carPrice[6]);
System.out.println(carMileage[6]);

System.out.println("******** values at index 7 ********");
System.out.println(carBrand[7]);
System.out.println(carPrice[7]);
System.out.println(carMileage[7]);

System.out.println("******** values at index 8 ********");
System.out.println(carBrand[8]);
System.out.println(carPrice[8]);
System.out.println(carMileage[8]);

System.out.println("******** values at index 9 ********");
System.out.println(carBrand[9]);
System.out.println(carPrice[9]);
System.out.println(carMileage[9]);

for(String brand:carBrand){
System.out.println(brand);
}

for(int price:carPrice){
System.out.println(price);
}

for(double mileage:carMileage){
System.out.println(mileage);
}

}
}