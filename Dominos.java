class Dominos{

static int orderFood(String item){
int cost=0;

if("Veg Pizza"==item)
{
System.out.println("Ordered item : "+item);
cost=250;
return cost;
}
else if("Cheese Burst"==item)
{
System.out.println("Ordered item : "+item);
cost=300;
return cost;
}
else if("Garlic Bread"==item)
{
System.out.println("Ordered item : "+item);
cost=120;
return cost;
}
else if("Pasta"==item)
{
System.out.println("Ordered item : "+item);
cost=150;
return cost;
}
else if("Pepsi"==item)
{
System.out.println("Ordered item : "+item);
cost=60;
return cost;
}
else if("Brownie"==item)
{
System.out.println("Ordered item : "+item);
cost=90;
return cost;
}
else
{
System.out.println("Item not found");
return 0;
}
}

static int orderFood(String item,int cost,int quantity){
int total=0;

if("Veg Pizza"==item)
{
total=cost*quantity;
return total;
}
else if("Cheese Burst"==item)
{
total=cost*quantity;
return total;
}
else if("Garlic Bread"==item)
{
total=cost*quantity;
return total;
}
else if("Pasta"==item)
{
total=cost*quantity;
return total;
}
else if("Pepsi"==item)
{
total=cost*quantity;
return total;
}
else if("Brownie"==item)
{
total=cost*quantity;
return total;
}
else
{
return 0;
}
}

}