import java.util.Scanner;
public class Print
{
    public static void main(String[] args)
    {
        //Write your code
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(arr[i]);
            
        }
        
        
    }
}
