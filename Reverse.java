import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a,temp,digit,sum=0;
        a=sc.nextInt();
        temp=a;
        while(a>0)
        {
            digit=a%10;
            sum=sum*10+digit;
            a=a/10;
        }
        System.out.println(sum);
    }
}
