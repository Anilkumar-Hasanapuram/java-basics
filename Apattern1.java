//Proove your drawing skill here
import java.util.Scanner;
public class Apattern1
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
                if(i==1 && j!=5 || j==2 ||j==4 || i==2 && j==2 || j==3)
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
