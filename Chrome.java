class Chrome
{
static void openBrowser(){
System.out.println("Browser opened");
search("Java");
}

static void search(String text){
System.out.println("Search: "+text);
int tabs=getTabs();
System.out.println("Tabs: "+tabs);
}
static int getTabs(){
return 4;
    }
}
