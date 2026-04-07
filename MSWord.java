class MSWord {
static void createDoc() {
     System.out.println("Document created");
    setFont("default");
}
static void setFont(String font) {
      System.out.println("Font: " + font);

        int pages = getPages();
        System.out.println("Pages: " + pages);
}
 static int getPages() {
        return 10;
}
}

