class KFC{

static int getOrder(String item)
 {
     int value = 0;
         if("Zinger" == item)
        {
            System.out.println("Order item : " + item);
            value = 180;
            return value;
        }
     else if("Bucket" == item)
        {
            System.out.println("Order item : " + item);
            value = 450;
            return value;
        }

      else if("Wings" == item)
        {
            System.out.println("Order item : " + item);
            value = 220;
            return value;
        }

          else if("Popcorn" == item)
        {
            System.out.println("Order item : " + item);
            value = 150;
            return value;
        }

      else if("Krusher" == item)
        {
            System.out.println("Order item : " + item);
            value = 120;
            return value;
        }

        else if("Fries" == item)
        {
            System.out.println("Order item : " + item);
            value = 100;
            return value;
        }
		else
        {
            System.out.println("Item not available");
            return 0;
        }

    }

    static int getOrder(String item, int value, int qty)
    {

        int total = 0;

        if("Zinger" == item)
        {
            total = value * qty;
            return total;
        }

        else if("Bucket" == item)
        {
            total = value * qty;
            return total;
        }

        else if("Wings" == item)
        {
            total = value * qty;
            return total;
        }

        else if("Popcorn" == item)
        {
            total = value * qty;
            return total;
        }

        else if("Krusher" == item)
        {
            total = value * qty;
            return total;
        }

        else if("Fries" == item)
        {
            total = value * qty;
            return total;
        }
        else
        {
            return 0;
 }

 }

}