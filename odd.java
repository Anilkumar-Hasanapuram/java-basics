import java.util.Scanner;
public class odd
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a;
         a=sc.nextInt();
         for(int i=0;i<=a;i++)
         {
             if(i%2==1)
             {
                 System.out.print(i+" ");
             }
         }
     }
}
