class Book{

public static void main(String[] args){

String[] bookTitle={"Java","Python","C++","HTML","CSS","SQL","DSA","Spring","Hibernate","React"};
int[] bookPrice={400,350,300,200,250,280,500,450,420,380};
double[] bookRating={4.5,4.4,4.2,4.0,4.1,4.3,4.7,4.6,4.4,4.5};

System.out.println("******** values at index 0 ********");
System.out.println(bookTitle[0]);
System.out.println(bookPrice[0]);
System.out.println(bookRating[0]);

System.out.println("******** values at index 1 ********");
System.out.println(bookTitle[1]);
System.out.println(bookPrice[1]);
System.out.println(bookRating[1]);

System.out.println("******** values at index 2 ********");
System.out.println(bookTitle[2]);
System.out.println(bookPrice[2]);
System.out.println(bookRating[2]);

System.out.println("******** values at index 3 ********");
System.out.println(bookTitle[3]);
System.out.println(bookPrice[3]);
System.out.println(bookRating[3]);

System.out.println("******** values at index 4 ********");
System.out.println(bookTitle[4]);
System.out.println(bookPrice[4]);
System.out.println(bookRating[4]);

System.out.println("******** values at index 5 ********");
System.out.println(bookTitle[5]);
System.out.println(bookPrice[5]);
System.out.println(bookRating[5]);

System.out.println("******** values at index 6 ********");
System.out.println(bookTitle[6]);
System.out.println(bookPrice[6]);
System.out.println(bookRating[6]);

System.out.println("******** values at index 7 ********");
System.out.println(bookTitle[7]);
System.out.println(bookPrice[7]);
System.out.println(bookRating[7]);

System.out.println("******** values at index 8 ********");
System.out.println(bookTitle[8]);
System.out.println(bookPrice[8]);
System.out.println(bookRating[8]);

System.out.println("******** values at index 9 ********");
System.out.println(bookTitle[9]);
System.out.println(bookPrice[9]);
System.out.println(bookRating[9]);

for(String title:bookTitle){
System.out.println(title);
}

for(int price:bookPrice){
System.out.println(price);
}

for(double rating:bookRating){
System.out.println(rating);
}

}
}