import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a;
        int flag=0;
        a=sc.nextInt();
        int m=a/2;
        if(a<=1)
        {
            System.out.println("Not a Prime");
        }
        for(int i=2;i<m;i++)
        {
            if(a%i==0)
            {
                System.out.println("Not a Prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        
    }
}
