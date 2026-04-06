class ZomatoRunner{

public static void main(String[] args){
int amount=0;

amount=Zomato.findFood("Pizza");
System.out.println("Single item cost : "+amount);

int finalAmount=Zomato.findFood("Pizza",amount,3);
System.out.println("Total bill : "+finalAmount);

}
}