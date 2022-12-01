import java.util.Scanner;
public class Reverse1
{
    public static void main(String[] args)
    {
        //Write your code
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
           arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
