//Start your code here
import java.util.Scanner;
public class Apattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i = 1;i<=n;i++)
        
        {
            if(i > 1)
            {
                 System.out.print(" ");
            }
           
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("\n");
            
        }
        for(int i =n ;i>=1;i--)
        {
            if(i > 1)
            {
                 System.out.print(" ");
            }
            for(int j=i-1;j<=n;j++)
            {
                if(j != 0)
                {
                    System.out.print(j+" ");  
                }
                else
                {
                  break;
                }
                
            }
            System.out.println("\n");
        }
    }
}
