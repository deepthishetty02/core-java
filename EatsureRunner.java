class EatsureRunner
{
 public static void main(String[] args)
  {
   int costValue=0;

    costValue=Eatsure.chooseFood("PaneerWrap");
   System.out.println("Cost per item : "+costValue);

     int totalCostValue=Eatsure.chooseFood("PaneerWrap",costValue,4);
    System.out.println("Total payable amount : "+totalCostValue);
  }
}