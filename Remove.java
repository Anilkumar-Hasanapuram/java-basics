       import java.util.Scanner;
public class Remove
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int c=0;
        int arr[]=new int[t];
        for(int j=0;j<t;j++)
        {
            arr[j]=sc.nextInt();
        }
       
        for(int i=0;i<t;i++)
        {
            for(int j=i+1;j<t;j++)
            {
                if(arr[i]==arr[j])
                {
                    c=c+1;
                }
            }
             if(c==0)
        {
            System.out.print(arr[i] +" ");
        }
          c=0;
            
        }
}
}
