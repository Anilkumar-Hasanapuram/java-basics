import java.util.Scanner;
public class Arraymean
{
    public static float array_mean_cal(int n,int arr[])
    {
        //Write your logic
        float sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        float total=sum/n;
        //System.out.println(sum);
        //System.out.println(total);
        return total;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        //int x=array_mean_cal(n,arr);
    System.out.printf("%.1f",array_mean_cal(n,arr));
    }
}
