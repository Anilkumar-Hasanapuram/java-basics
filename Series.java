//Type your code here
import java.util.Scanner;
class Series
{
    public static void main(String args[])
  {
      
      Scanner sc=new Scanner(System.in);
      int a;
      a=sc.nextInt();
      for(int i=1;i<=a;i++)
      {
          if(i%2==0)
          {
              System.out.print(((i*i)-2)+" ");
          }
          else
          {
               System.out.print(((i*i)+2)+" ");
          }
      }
  }


}
