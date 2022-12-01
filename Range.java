import java.util.Scanner;
public class Range
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a,b,i,j;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                 break;
                }
            }
        
        if(i==j)
        {
            System.out.println(i);
        }
        }
    }
}
