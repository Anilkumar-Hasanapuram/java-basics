import java.util.Scanner;
public class Pos
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int t,sum=0;
        t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            if(i%2==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
