import java.util.Scanner;
class Stu{
	public static void name1(int s1,int s2,int s3)
	{
	  int total=s1-(s2+s3);
       System.out.println("To pay the rent amount they need to arrange :"+total+"Rs");
	}


}
public class RENT extends Stu
{
public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	   int s1,s2,s3;
        System.out.println("The total amount of the rent : ");
        s1=sc.nextInt();
       System.out.println("Remaining money from Ram's salary: ");
        s2=sc.nextInt();
       System.out.println("Remaining money from Sathish's salary: ");
        s3=sc.nextInt();
	   
	}
}
