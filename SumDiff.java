import java.util.Scanner;
public class SumDiff
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Program p=new Program();
        System.out.println(p.add(a,b));
        System.out.println(p.sub(a,b));
    }
}
class Program
{
    public static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int sub(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
}
