import java.util.Scanner;
public class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n>=1 && m<=5000)
        {
        for(int i=n;i<m;i++)
        {
            if(i%2==0)
            {
                int digit=i;
                int t=digit%10;
                int r=digit/10;
                if(r%2==0 && t%2==0)
                {
                    System.out.print(i);
                }
            }
        }
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
