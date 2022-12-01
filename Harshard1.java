import java.util.Scanner;
public class Harshard1
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       Hack h=new Hack();
       h.sum(a);
        
    }
}
class Hack
{
    public static void sum(int a)
    {
        int digit=0,rev=0;
        int t=a;
        while(a>0)
        {
            digit=a%10;
            
            a=a/10;
            rev=rev+digit;
        
        // System.out.println(rev);
        }//System.out.println(a+""+rev);
        if(t%rev==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}
