import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        
         int sum=1;
        for (int i=2;i<n;i++) {
            
            if(n%i==0)
            {
                sum += i;
            }
            
        }
        if(sum==n)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
           
    }
    }
