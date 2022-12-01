import java.util.Scanner;
public class Strong
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        int temp=n,r;
        while(n>0) {
            int fact=1;
              r=n%10;
            for(int i=1;i<=r;i++) {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
       if(temp==sum)
       {
           System.out.println("Strong Number");
       }
       else
       {
           System.out.println("Not a Strong Number");
       }
    }
}
