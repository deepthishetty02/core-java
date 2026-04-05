class LibraryRunner{

public static void main(String[] args){

Library.getBookNames();

System.out.println("AUTHOR NAMES");

String[] authors = Library.getAuthors();
for(String name : authors){
System.out.println(name);
}

}

}