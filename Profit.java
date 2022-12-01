import java.util.Scanner;
public class Profit
{
    public static void main(String args[])
    {
        //write your code
        float a,b,p,total,sum;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        p=a/12;
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
