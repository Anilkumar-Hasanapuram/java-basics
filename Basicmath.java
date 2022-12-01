//Code here
import java.util.Scanner;
public class Basicmath
{
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        int n;
        n=sc.nextInt();
        double sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        double total;
        total=sum/n;
        System.out.println(total);
    }
}
