class Zomato{

static int findFood(String foodName){
int amount=0;

if("Biryani"==foodName)
{
System.out.println("Selected dish : "+foodName);
amount=220;
return amount;
}
else if("Pizza"==foodName)
{
System.out.println("Selected dish : "+foodName);
amount=180;
return amount;
}
else if("Burger"==foodName)
{
System.out.println("Selected dish : "+foodName);
amount=120;
return amount;
}
else if("Pasta"==foodName)
{
System.out.println("Selected dish : "+foodName);
amount=160;
return amount;
}
else if("Sandwich"==foodName)
{
System.out.println("Selected dish : "+foodName);
amount=90;
return amount;
}
else if("Noodles"==foodName)
{
System.out.println("Selected dish : "+foodName);
amount=140;
return amount;
}
else
{
System.out.println("Food not available");
return 0;
}
}

static int findFood(String foodName,int amount,int count){
int finalAmount=0;

if("Biryani"==foodName)
{
finalAmount=amount*count;
return finalAmount;
}
else if("Pizza"==foodName)
{
finalAmount=amount*count;
return finalAmount;
}
else if("Burger"==foodName)
{
finalAmount=amount*count;
return finalAmount;
}
else if("Pasta"==foodName)
{
finalAmount=amount*count;
return finalAmount;
}
else if("Sandwich"==foodName)
{
finalAmount=amount*count;
return finalAmount;
}
else if("Noodles"==foodName)
{
finalAmount=amount*count;
return finalAmount;
}
else
{
return 0;
}
}

}