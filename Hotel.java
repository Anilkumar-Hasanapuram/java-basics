import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner (System.in);
        int a,b,c,total,rent;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>12)
        {
            System.out.println("Invalid Input");
        }
        else if(a==4||a==6||a==11||a==12)
        {
            total=(20*b)/100;
            rent=(total*c)+(b*c);
            System.out.printf("Hotel Tariff: Rs."+rent+".00");
        }
        else
        {
            rent=b*c;
            System.out.println("Hotel Tariff: Rs."+rent+".00");
        }
    }
}
