class McDonalds
{
static int getMenu(String product)
    {
      int value=0;

        if("McBurger"==product){
            System.out.println("You selected : "+product);
            value=130;
            return value;
            }

       else if("Fries"==product){
            System.out.println("You selected : "+product);
            value=90;
            return value;
    }
          else if("McChicken"==product){
            System.out.println("You selected : "+product);
            value=180;
            return value;
        }

        else if("Coke"==product){
            System.out.println("You selected : "+product);
            value=70;
            return value;
            }

          else if("Wrap"==product){
            System.out.println("You selected : "+product);
            value=150;
            return value;
        }

        else if("IceCream"==product){
            System.out.println("You selected : "+product);
            value=60;
            return value
	}

        else{
            System.out.println("Product unavailable");
            return 0;
     }
}
  static int getMenu(String product,int value,int qty)
    { int totalValue=0;

        if("McBurger"==product){ totalValue=value*qty; 
		return totalValue; }

        else if("Fries"==product){ totalValue=value*qty; 
		return totalValue; }

        else if("McChicken"==product){ totalValue=value*qty; 
		return totalValue; }

        else if("Coke"==product){ totalValue=value*qty; 
		return totalValue; }

        else if("Wrap"==product){ totalValue=value*qty; 
		return totalValue; }

        else if("IceCream"==product){ totalValue=value*qty; 
		return totalValue; }

     else{ return 0; }
}
}