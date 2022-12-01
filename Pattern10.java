import java.util.Scanner;
public class Pattern10
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for( i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for( k=1;k<=(i*2)-1;k++)
            {
            System.out.print("*");
            }
        
        System.out.println("");
        }
       for( i=n-1;i>=1;i--)
        {
            for(j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for( k=1;k<=(i*2)-1;k++)
            {
            System.out.print("*");
            }
        
        System.out.println("");  
    }
}
}
