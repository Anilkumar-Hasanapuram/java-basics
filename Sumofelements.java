import java.util.Scanner;
public class Sumofelements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        int s=0;
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        int sum[][]=new int[r][c];
        for( i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for( i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                s=a[i][j]+s;
            }
            System.out.println(s);
            s=0;
        }
        
    }
}
