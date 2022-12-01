import java.util.*;
public class Maximum
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int t;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(a[i]>a[j])
              {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t;
              }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(b[i]>b[j])
              {
                  t=b[i];
                  b[i]=b[j];
                  b[j]=t;
              }
            }
        }
        int s=0;
        for(int i=0;i<n;i++)
            s+=a[i]*b[i];
            System.out.println(s);
}
}
