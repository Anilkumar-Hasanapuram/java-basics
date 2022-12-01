import java.util.Scanner;
public class Series10
{
    public static void main(String[] args)
    {
        //Write your code
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double s=95.0;
        System.out.printf("%.1f ",s);
        for(int i=1;i<n;i++)
        {
            s=s+20.5;
            System.out.printf("%.1f ",s);
            s=s+2.0*i;
        }
    }
}
