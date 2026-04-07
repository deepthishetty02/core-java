class Calculator
  {
static void start(){
System.out.println("Calculator ON");
checkMode("Scientific");
   }
static void checkMode(String mode){
System.out.println("Mode: "+mode);
int result=getResult();
System.out.println("Result: "+result);
}
static int getResult(){
return 999;
   }
}
