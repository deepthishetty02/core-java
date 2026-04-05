class GucchiRunner{
public static void main(String[]args){

Gucchi.getOwner();
Gucchi.getProduct("Handbag");
int amount=Gucchi.getPrice(400);
System.out.println(amount);
int amt=Gucchi.getAmt(200,300);
System.out.println(amt);
}}