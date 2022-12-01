import java.util.Scanner;
public class Sumofnum
{
    public static void main(String[] args)
    {
        //Write your code
        int a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
