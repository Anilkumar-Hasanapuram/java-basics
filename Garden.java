import java.util.Scanner;

public class Garden
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((c<=1 && c>a)|| b%c==0 || c%b==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
