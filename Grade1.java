import java.util.Scanner;
class Stu{
	public static void name1(String name ,int s1,String g,int s2,String grade)
	{
	   System.out.println("Name: "+name);
	   System.out.println("Age: "+s1);
	   System.out.println("Gender: "+g);
	    System.out.println("Total Marks: "+s2); 
	    int per=(s2*100)/500;
	    System.out.println("Percentage: "+per);
	    System.out.println("Grade: "+grade);
	}


}
public class Grade1 extends Stu
{
public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	   int s1,s2;
	   String g,name,grade;
	   System.out.println("Enter student's basic information:");
	   System.out.println("Name: ");
	   name=sc.nextLine();
	   System.out.println("Age: ");
	   s1=sc.nextInt();
	   System.out.println("Gender: ");
	   g=sc.next();
		System.out.println("Enter student's result information:");
		System.out.println("Total Marks :");
		s2=sc.nextInt(); 
		System.out.print("Grade:");
		grade=sc.next();
	    name1(name,s1,g,s2,grade);
	}
}
