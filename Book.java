public class Book //class
{
	//fields
 String bookName;
 short noOfPages;
 String author;
 int price;
 short publishedYear;
 String publisher;
 String type;


public void printBookDetails() //Method
{

System.out.println("--------------------------------------------------------------------------------------");
System.out.println("Book Name: "+this.bookName);
System.out.println("Nuber of pages: "+this.noOfPages);
System.out.println("Author Name: "+this.author);
System.out.println("Year of published: "+this.publishedYear);
System.out.println("Publisher: "+this.publisher);
System.out.println("Book Type is: "+this.type);

}

Book (String bookName,short noOfPages,String author,int price,short publishedYear,String publisher,String type)  // parameter is a declaration of variables within the method braces
{
	    this.bookName=bookName; 
		this.noOfPages=noOfPages;
		this.author=author;
		this.price=price;
		this.publishedYear=publishedYear;
		this.publisher=publisher;
		this.type=type;
		
}

public static void main(String [] arguments)
{
	                                 System.out.println("                           ***Book Details***");
      Book obj=new Book("Believe in yourself",(short)80,"Dr.Joseph Murphy",105,(short)1955,"Penguin Random House and JMW Group","Inspiring and aascinating book on the power of self-confidence and positive thinking");
		obj.printBookDetails();
	  Book obj1=new Book("The Girl On The Train",(short)144,"Ruskin Bond ",199,(short)2022,"Rupa Publication india pvt Ltd.","Essays and short stories");
		obj1.printBookDetails();
	  Book obj2=new Book("Think and Grow rich",(short)144,"Nepoleon Hill ",199,(short)1937,"The ralston society","Personal development. ");
        obj2.printBookDetails();
	  Book obj3=new Book("Energise your mind. ",(short)100,"Gaur gopal Das.  ",224,(short)2023. ,"Rupa Publication india pvt Ltd","Self help book.  ");
		obj3.printBookDetails();
	  Book obj4=new Book("You only live once. ",(short)240,"Stuti changle. ",170,(short)2021 ,"Rupa Publication india pvt Ltd","Fictional story.  ");
      	obj4.printBookDetails();
	  Book obj5=new Book("Something I never told you.  ",(short)98,"Shravya Bhinder ",224,(short)2019 ,"Rupa Publication india pvt Ltd","Romance novel,Fiction, Contemporary Romance.   ");
		obj5.printBookDetails();
	 Book obj6=new Book(" The art of letting go. ",(short)100,"Sahita Baruan  ",164,(short)2018. ,"Originally published. ","The Art of letting Go helps you understand why, how, and when you should let someone go so you can move on and never look back. ");
		obj6.printBookDetails();
}
}