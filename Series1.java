import java.util.Scanner;
public class Series1
{
    public static void main(String[] args)
    {
        //Write your code
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            System.out.print(i*i+" ");
        }
    }
}
