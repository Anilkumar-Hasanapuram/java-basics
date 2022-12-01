import java.util.Scanner;
public class Series9
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      long a=2,s;
        System.out.print(a+" ");
        for(int i=1;i<t;i++)
        {
            a=((a*a)-1);
            System.out.print(a+" ");
           //s;
        }
    }
}
