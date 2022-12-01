import java.util.Scanner;
public class Search
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int t,i;
        t=sc.nextInt();
        int arr[]=new int[t];
        for(i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        for(i=0;i<t;i++)
        {
            if(arr[i]==pos)
            {
                System.out.println(pos+" is present in the array");
                break;
            }
        }
        
        if(i==t)
        {
            System.out.println(pos+" is not present in the array");
        }
    }
}
