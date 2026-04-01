class PerfumeInfo{
    String brandName;
    int id;
    String ownerName;
    boolean isAvailable;
    double price;
	
	public PerfumeInfo(String p1,int p2,String p3,boolean p4,double p5){
	 brandName=p1;
	 id=p2;
	 ownerName=p3;
	 isAvailable=p4;
	 price=p5;
	 
	 }

public void display(){
	System.out.println(brandName);
	System.out.println(id);
	System.out.println(ownerName);
	System.out.println(isAvailable);
	System.out.println(price);
	
}
}