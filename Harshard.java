import java.util.Scanner;
public class Harshard
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a,t,rev=0,digit=0;
        a=sc.nextInt();
        t=a;
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
