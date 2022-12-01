//Code here
import java.util.Scanner;
public class square
{
    public static void main(String args[])
    {
        
     int a;
     int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        do
        {
            a=sc.nextInt();
            if(a>1)
            {
                 for(int i=0;i<100;i++)
                 {
                     arr[i]=a*a;
                 }
            }
            else
            {
                System.out.println("invalid input");
            }
        }while(a!=-1);
        
        for(int i=0;i<100;i++)
        {
            System.out.println(arr[i]);
            break;
        }
        
    }
}
