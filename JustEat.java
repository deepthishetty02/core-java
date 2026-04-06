class JustEat{

static int chooseMeal(String meal){
int cost=0;
if("Dosa"==meal){
System.out.println("Meal selected : "+meal);
cost=80;
return cost;}
else if("Idli"==meal){
System.out.println("Meal selected : "+meal);
cost=50;
return cost;}
else if("Vada"==meal){
System.out.println("Meal selected : "+meal);
cost=60;
return cost;}
else if("Upma"==meal){
System.out.println("Meal selected : "+meal);
cost=70;
return cost;}
else if("Pongal"==meal){
System.out.println("Meal selected : "+meal);
cost=90;
return cost;}
else if("Poori"==meal){
System.out.println("Meal selected : "+meal);
cost=85;return cost;}
else{System.out.println("Meal not available");
return 0;}
}

static int chooseMeal(String meal,int cost,int qty){
int totalCost=0;
if("Dosa"==meal){totalCost=cost*qty;
return totalCost;}
else if("Idli"==meal){totalCost=cost*qty;
return totalCost;}
else if("Vada"==meal){totalCost=cost*qty;
return totalCost;}
else if("Upma"==meal){totalCost=cost*qty;
return totalCost;}
else if("Pongal"==meal){totalCost=cost*qty;
return totalCost;}
else if("Poori"==meal){totalCost=cost*qty;
return totalCost;}
else{return 0;}
}

}