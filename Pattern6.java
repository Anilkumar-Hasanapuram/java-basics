import java.util.Scanner;
public class Pattern6
{
    public static void main(String[] args)
    {
        //Write your code
      Scanner sc=new Scanner(System.in);
      int n;
      n=sc.nextInt();
      int i=n,j;
      while(i>0)
      {
          j=0;
          while(j++<n-i)
          {
              System.out.print(" ");
          }
          j=0;
          while(j++<(i*2)-1)
          {
              System.out.print("*");
          }
          System.out.println();
          i--;
      }
    }
}
