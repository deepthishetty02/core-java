class BazarNowRunner{
public static void main(String args[])
{

int rate=0;
rate=BazarNow.checkProduct("Soap");
System.out.println("Single product price : "+rate);

int totalRate=BazarNow.checkProduct("Soap",rate,6);
System.out.println("Overall price : "+totalRate);

}
}