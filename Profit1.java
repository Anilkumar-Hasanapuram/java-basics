import java.util.Scanner;
public class Profit1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Float a,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        Profitloss pl=new Profitloss();
        pl.loss(a,b);
    }
}
class Profitloss
{
    void loss(float a,float b)
    {
        float p=a/12;
        float total;
        if(p>b)
        {
            total=(p-b)*12;
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("Loss : Rs.%.2f",total);
        }
        else if(p==b)
        { 
             total=(p-b)*12;
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("No profit nor loss");
            
        }
        else
        {
             total=(b-p)*12;
            System.out.println("Enter the price of a dozen mangoes");
            System.out.println("Enter the price at which 1 mango is being sold");
            System.out.printf("Profit : Rs.%.2f",total);
            
        }
        
    }
}
