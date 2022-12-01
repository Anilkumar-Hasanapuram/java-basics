import java.util.Scanner;
public class Apattern2
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
                if(i==1||i==t||j==1||j==t|| j==2||j==4)
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
