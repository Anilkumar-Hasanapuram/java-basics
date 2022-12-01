import java.util.Scanner;
public class Maximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            int max=a[i][0];
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
