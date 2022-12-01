import java.util.Scanner;
public class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double units,bill=0;
        units=sc.nextInt();
        if(units<100)
        {
            bill=units*1.20;
        }
        else if(units>=100 && units<=300)
        {
            bill=100*1.20+(units-100)*2;
        }
        else if(units>300)
        {
            bill=100*1.20+200*2+(units-300)*3;
        }
        System.out.println(bill);
    }
}
