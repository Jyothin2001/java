public class College1
{
String collegeName;
int fee;
int noOfStaff;
String universityName;
int foundationYear;
int noofAuditorium;


College1(String collegeName,int fee,int noOfStaff,String universityName,int foundationYear,int noofAuditorium)
{
	this.collegeName=collegeName;
	this.fee=fee;
	this.noOfStaff=noOfStaff;
	this.universityName=universityName;
	this.foundationYear=foundationYear;
	this.noofAuditorium=noofAuditorium;
}

void display1()
{
	System.out.println("college Name : "+collegeName);
	System.out.println("fee: "+fee);
	System.out.println("no Of Staff: "+noOfStaff);
	System.out.println("university Name : "+universityName);
	System.out.println("foundation Year: "+foundationYear);
	System.out.println("noofAuditorium: "+noofAuditorium);
}


void development()
{
	System.out.println("personel development");
}

void opportunities()
{
	System.out.println("increased job opportunities");
}

void connection()
{
	System.out.println("create connection");
}
}