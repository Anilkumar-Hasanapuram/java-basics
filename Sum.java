import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a,temp,digit,rev=0;
        a=sc.nextInt();
        temp=a;
        while(a>0)
        {
            digit=a%10;
            rev=rev+digit;
            a=a/10;
        }
        System.out.println(rev);
    }
}
