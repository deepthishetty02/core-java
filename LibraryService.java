class LibraryService{

static void libraryEntry(){
System.out.println("Welcome to Library");
}

static void issueBook(String studentName,String bookName){
System.out.println(studentName+" issued "+bookName);
}

static int rackLocation(){
int rack = 8;
return rack;
}

static int countBooks(int bookOne,int bookTwo){
int totalBooks = bookOne + bookTwo;
return totalBooks;
}

}