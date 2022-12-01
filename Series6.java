import java.util.Scanner;
public class Series6
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                s=((int)Math.pow(i,2)-2);
                System.out.print(s+" ");
            }
            else
            {
                s=((int)Math.pow(i,2)-1);
                System.out.print(s+" ");
            }
        }
    }
}
