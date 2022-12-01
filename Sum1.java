import java.util.Scanner;
public class Sum1
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       Sumofdigit s=new Sumofdigit();
       s.sum(n);
       //s.sum(n);
    }
}
class Sumofdigit
{
    public static void sum(int n)
    {
        int temp=n,sum1=0,digit=0;
        while(n>0)
        {
            digit=n%10;
            sum1=sum1+digit;
            n=n/10;
        }
      System.out.println(sum1);
    }
}
