class Library{

static String libraryName = "MANDYA LIBRARY";

static String[] bookNames = {"Java","Python","C++","HTML","CSS","SQL","Spring","Hibernate","React","Angular"};

static String[] authorNames = {"James","Dennis","Bine","Tim","Hon","Codd","Rod","Gin","Joan","MiA"};


static void getBookNames(){
System.out.println("BOOK NAMES");
for(String book : bookNames){
System.out.println(book);
}
}

static String[] getAuthors(){
return authorNames;
}

}