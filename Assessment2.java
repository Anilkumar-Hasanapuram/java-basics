import java.util.Scanner;
public class Assessment2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        float total,rate,amount,in;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        System.out.println(t+".00");
        total=(r*t)+p;
        in=(p*t*r)/100;
        rate=(2*in)/100;
        amount=total-rate;
         System.out.printf("%.2f\n",total);
          System.out.printf("%.2f\n",rate);
           System.out.printf("%.2f\n",amount);
        
        
        
    }
}
