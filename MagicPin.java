class MagicPin {
  static int selectOffer(String offer) {
        int discount = 0;
    if("Cashback" == offer) {
            System.out.println("Offer applied : " + offer);
             discount = 50;
              return discount;
          }   else if("Coupon" == offer) {
            System.out.println("Offer applied : " + offer);
            discount = 30;
            return discount;}
			
    	else if("Voucher" == offer) {
            System.out.println("Offer applied : " + offer);
            discount = 70;
            return discount;
    }     else if("Deal" == offer) {
            System.out.println("Offer applied : " + offer);
             discount = 40;
            return discount;
      }       else if("Promo" == offer) {
            System.out.println("Offer applied : " + offer);
            discount = 60;
              return discount;
        }  else if("Reward" == offer) {
            System.out.println("Offer applied : " + offer);
               discount = 80;
               return discount;
        }else {
            System.out.println("Offer not valid");
         return 0;
     }
    }
 static int selectOffer(String offer, int discount, int times) {
        int totalDiscount = 0;

        if("Cashback" == offer) {
            totalDiscount = discount * times;
            return totalDiscount;
            } else if("Coupon" == offer) {
               totalDiscount = discount * times;
             return totalDiscount;
      } else if("Voucher" == offer) {
            totalDiscount = discount * times;
            return totalDiscount;
        } else if("Deal" == offer) {
            totalDiscount = discount * times;
              return totalDiscount;
    } else if("Promo" == offer) {
            totalDiscount = discount * times;
            return totalDiscount;
        } else if("Reward" == offer) {
            totalDiscount = discount * times;
              return totalDiscount;
             } else {
                 return 0;
    }
	}
}