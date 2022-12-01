import java.util.Scanner;
public class Countdistinct
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
         if(arr[i]==arr[j])
                {
                    count=count+1;
                }
            
            }
        }
        if(count>=1)
        {
            System.out.println(n-count);
            count=0;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                count=count+1;
            }
            System.out.println(count);
        }
    }
}
