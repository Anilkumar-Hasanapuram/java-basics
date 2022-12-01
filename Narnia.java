import java.util.Scanner;
public class Narnia
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int temp=a,digit=0,sum=0;
        if(a<100)
        {
        while(a>0)
        {
            digit=a%10;
            sum=sum+digit;
            a=a/10;
        }
        System.out.println(sum);
        }
        if(a>100)
        {
            digit=a%10;
            a=a/10;
        System.out.println(a+digit);
        }
    }
}
