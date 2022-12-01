import java.util.Scanner;
public class Sort
{
    public static void main(String[] args)
    {
        ///Write your code
        Scanner sc=new Scanner (System.in);
        int t,temp=0;
        t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<t;i++)
        {
           for(int j=0;j<t;j++)
           {
               if(arr[i]<arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
