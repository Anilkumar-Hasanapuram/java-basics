import java.util.Scanner;
public class Pattern1
{
    public static void main(String[] args)
    {
        //Write your code
        int row;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print ("*");
            }
            System.out.println();
        }
    }
}
