class BazarNow{

static int checkProduct(String productName)
{
    int rate=0;

    if("Soap"==productName)
    {
        System.out.println("Product chosen : "+productName);
        rate=35;
        return rate;
    }

      else if("Shampoo"==productName)
    {
    System.out.println("Product chosen : "+productName);
        rate=120;
        return rate;
    }

    else if("Toothpaste"==productName)
    {
        System.out.println("Product chosen : "+productName);
    rate=85;
        return rate;
    }

    else if("Brush"==productName)
      {
        System.out.println("Product chosen : "+productName);
        rate=40;
        return rate;
    }
  else if("Detergent"==productName)
    {
    System.out.println("Product chosen : "+productName);
        rate=200;
        return rate;
    }

    else if("Lotion"==productName)
    {
        System.out.println("Product chosen : "+productName);
        rate=150;
        return rate;
    }
      else
    {
        System.out.println("Product not available");
        return 0;
 }

}

static int checkProduct(String productName,int rate,int count)
{
    int totalRate=0;

    if("Soap"==productName)
    {
        totalRate=rate*count;
        return totalRate;
    }
  else if("Shampoo"==productName)
    {
        totalRate=rate*count;
        return totalRate;
    }
       else if("Toothpaste"==productName)
    {
        totalRate=rate*count;
        return totalRate;
    }
      else if("Brush"==productName)
       {
        totalRate=rate*count;
         return totalRate;
    }
       else if("Detergent"==productName)
    {
        totalRate=rate*count;
        return totalRate;
    }
  else if("Lotion"==productName)
    {
        totalRate=rate*count;
        return totalRate;
    }
      else
    {
        return 0;
 }
}

}