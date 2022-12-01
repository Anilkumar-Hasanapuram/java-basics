import java.util.Scanner;
public class Type
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int t,even=0,odd=0;
        t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
           if(arr[i]%2==0)
           {
               even=even+1;
           }
           else
           {
               odd=odd+1;
           }
        }
        if(even==t)
        {
            System.out.println("Even");
        }
        else if(odd==t)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}
