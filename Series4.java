import java.util.Scanner;
public class Series4
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
         int n;
         n=sc.nextInt();
         double a=0.5;
         System.out.print(a+" ");
         for(int i=1;i<n;i++)
         {
             a=a*3;
             System.out.print(a+" ");
         }
    }
}
