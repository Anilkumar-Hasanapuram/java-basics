import java.util.Scanner;
public class Swap
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Sum s=new Sum();
        s.sample(a,b);
    }
}
class Sum
{
    void sample(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
