import java.util.Scanner;
public class Furniture
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int y=sc.nextInt();
        int ad,temp;
	    temp=a;
	    for(int i=0;i<y;i++)
	    temp=((100-d)*temp)/100;
	 System.out.println(temp);
    }
}
