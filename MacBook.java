class MacBook
{
static void powerOn(){
     System.out.println("MacBook ON");
     checkChip("M2");
 }
static void checkChip(String chip) {
        System.out.println("Chip: "+chip);
        int ram=getRam();
        System.out.println("RAM: "+ram);
}
static int getRam(){
      return 16;
}
}
