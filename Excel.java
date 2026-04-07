class Excel {
static void openSheet() {
      System.out.println("Sheet opened");
          enterData("Marks");
}
 static void enterData(String data) {
     System.out.println("Data: " + data);
       int rows = getRows();
        System.out.println("Rows: " + rows);
}
static int getRows() {
        return 50;
}

}

