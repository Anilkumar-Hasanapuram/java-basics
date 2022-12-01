//Code here
//Code here
import java.util.Scanner;
public class factors
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
            
        }
    }
}
