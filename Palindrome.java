import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        //Write your code
        int a,temp,rev=0,digit;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        temp=a;
        while(a>0)
        {
            digit=a%10;
            rev=rev*10+digit;
            a=a/10;
            
        }
        if(rev==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
