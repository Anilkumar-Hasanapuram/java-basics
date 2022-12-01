import java.util.Scanner;
class Stu{
	public static int name(int s1,int s2)
	{
	     
	     System.out.println("Subject 1:"+s1);
	     System.out.println("Subject 2:"+s2);
	     int sum=s1+s2;
			return sum;
	}

}
public class Student1 extends Stu
{
public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	   int r,s1,s2;
	   r=sc.nextInt();
	   s1=sc.nextInt();
	   s2=sc.nextInt();
	   System.out.println("Roll Number Is:");
	   System.out.println(r);
		System.out.print("Total:"+name(s1,s2));
	}
}
