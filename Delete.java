import java.util.Scanner;
public class Delete
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a!=arr[i])
            {
                count++;
            }
           
        }
        if(count==n)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for(int l=0;l<n;l++)
            if(a!=arr[l])
            {
                System.out.println(arr[l]);
            }
        }
       
    }
}
