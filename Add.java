import java.util.Scanner;
public class Add
{
    public static void main(String[] args)
    {
             Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //int t1=sc.nextInt();
        int a[]=new int[t];
        int c[]=new int[t];
        int b[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<t;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(int i=0;i<t;i++)
        {
            
        
        System.out.print(c[i]+" ");
        }
        
    }
    
}
