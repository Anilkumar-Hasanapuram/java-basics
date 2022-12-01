import java.util.Scanner;
public class Series8
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=4;
        for(int i=0;i<n;i++)
        {
            a=a+(i*i);
            System.out.print(a+" ");
        }
    }
}
