import java.util.Scanner;
public class formt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n;
        n=sc.nextDouble();
        System.out.println(Math.round(n*100)/100);
    }
}
