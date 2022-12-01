import java.util.Scanner;
public class Friendly
{
    public static void main(String[] args)
    {
        //Write your code
        int a,b;
        Scanner sc=new Scanner(System.in);
        int c=0,c1=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+1;
            }
        }
         for(int j=1;j<b;j++)
        {
            if(b%j==0)
            {
                c1=c1+1;
            }
        }
        if(a>b)
        {
        if((c/a)==(c1/b))
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not Friendly Pair");
        }
        }
        else
        
        {
            System.out.println("Not Friendly Pair");
        }
        
    }
}
