import java.util.Scanner;
public class Friendly1
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Friend f=new Friend();
        f.Friendu(a,b);
    }
}
class Friend
{
    public static void Friendu(int a,int b)
    {
        int c=0,c1=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+i;
            }
        }
         for(int j=1;j<b;j++)
        {
            if(b%j==0)
            {
                c1=c1+j;
            }
        }
       
        if((c/a)==(c1/b))
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not Friendly Pair");
        }
        
       
    }
}
