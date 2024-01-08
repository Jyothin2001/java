public class Book1 //class
{
	//fields
 String bookName;
 short noOfPages;
 String author;
 int price;
 short publishedYear;
 String publisher;
 String type;
 
 Book1 (String bookName,short noOfPages,String author,int price,short publishedYear,String publisher,String type)  // parameter is a declaration of variables within the method braces
{
	    this.bookName=bookName; 
		this.noOfPages=noOfPages;
		this.author=author;
		this.price=price;
		this.publishedYear=publishedYear;
		this.publisher=publisher;
		this.type=type;
		
}



public void printBookDetails() //Method
{
System.out.println("Book Name is: "+this.bookName);
System.out.println("Nuber of pages: "+this.noOfPages);
System.out.println("Author Name: "+this.author);
System.out.println("Year of published: "+this.publishedYear);
System.out.println("Publisher: "+this.publisher);
System.out.println("Book Type is: "+this.type);

}
void intelligent()
{
	System.out.println("books make student intelligent");
}
void memory()
{
	System.out.println("books improves the vocabulary");
}
void vocabulary()
{
	System.out.println("books improves the vocabulary");
}

}


      