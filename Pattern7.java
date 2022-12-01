import java.util.Scanner;
public class Pattern7
{
    public static void main(String[] args)
    {
        //Write your code
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            for(int j=1;j<=t;j++)
            {
                if(i==1||i==t||j==1||j==t)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
