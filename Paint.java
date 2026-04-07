class Paint{
  static void draw(){
System.out.println("Drawing");
selectColor("Blue");
}
 static void selectColor(String color){
System.out.println("Color: "+color);
int size=getSize();
System.out.println("Size: "+size);
}
  static int getSize(){
return 20;
}
}
