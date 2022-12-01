import java.util.Scanner;
public class Same
{
    public static void main(String[] args)
    {
        //Write your code
        int t,t1,count=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        t1=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
         arr[i]=sc.nextInt();   
        }
        int arr1[]=new int[t1];
        for(int i=0;i<t1;i++)
        {
         arr1[i]=sc.nextInt();   
        }
        for(int i=0;i<t;i++)
        {if(arr[i]==arr1[i])
      {
          System.out.println("Same");
          break;
      }
      else
      {
          System.out.println("Not Same");
          break;
      }
            
        }
    }
}
