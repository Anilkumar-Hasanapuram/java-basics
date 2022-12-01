import java.util.Scanner;
public class Series7
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double p=1,q=2;
        System.out.printf("%.0f %.1f ",p,q);
        for(int i=1;i<a-1;i++)
        {
            if(i%2==1)
            {
                p=p*3;
                System.out.printf("%.1f ",p);
            }
            else
            {
                q=q*3;
                System.out.printf("%.1f ",q);
            }
        }
    }
}
