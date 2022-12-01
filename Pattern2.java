import java.util.Scanner;
public class Pattern2
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int row;
        row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print(i);
            }
             System.out.println();
        }
        
    }
}
