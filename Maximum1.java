import java.util.Scanner;
public class Maximum1
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
            int max=a[0][i];
            for(int j=0;j<a[i].length;j++)
            {
                if(a[j][i]>max)
                {
                    max=a[j][i];
                }
            }
            System.out.println(max);
        }
    }
}
