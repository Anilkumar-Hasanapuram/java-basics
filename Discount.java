import java.util.Scanner;
public class Discount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,total;
        p=sc.nextDouble();
        r=sc.nextDouble();
        total=p*(r/100);
        double discount=p-total;
        System.out.println(discount);
    }
}
