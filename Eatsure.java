class Eatsure
{
 static int chooseFood(String food)
 {
  int costValue=0;

  if("PaneerWrap"==food)
   {
    System.out.println("Food chosen : "+food);
     costValue=170;
    return costValue;
   }
  else if("ChickenBowl"==food)
 {
    System.out.println("Food chosen : "+food);
   costValue=220;
    return costValue;
 }
  else if("VegSalad"==food)
   {
    System.out.println("Food chosen : "+food);
   costValue=130;
    return costValue;
   }
 else if("RiceCombo"==food)
    {
     System.out.println("Food chosen : "+food);
    costValue=190;
     return costValue;
    }
  else if("SoupMeal"==food)
 {
   System.out.println("Food chosen : "+food);
    costValue=110;
   return costValue;
 }
  else if("DessertBox"==food)
   {
    System.out.println("Food chosen : "+food);
     costValue=150;
    return costValue;
   }
  else
   {
    System.out.println("Food option not available");
     return 0;
   }
 }

 static int chooseFood(String food,int costValue,int quantity)
 {
  int totalCostValue=0;

  if("PaneerWrap"==food)
   { totalCostValue=costValue*quantity;
return totalCostValue; }

  else if("ChickenBowl"==food)
 { totalCostValue=costValue*quantity; 
return totalCostValue; }

  else if("VegSalad"==food)
   { totalCostValue=costValue*quantity; 
return totalCostValue; }

 else if("RiceCombo"==food)
    { totalCostValue=costValue*quantity; 
return totalCostValue; }

  else if("SoupMeal"==food)
 { totalCostValue=costValue*quantity;
return totalCostValue; }

  else if("DessertBox"==food)
   { totalCostValue=costValue*quantity; 
return totalCostValue; }

  else
   { return 0; }
 }

}