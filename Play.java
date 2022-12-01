import java.util.Scanner;
public class Play
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d;
        double total;
         a=sc.nextDouble();
         b=sc.nextDouble();
         c=sc.nextDouble();
         d=sc.nextDouble();
         total=Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d)));
         System.out.println(total);
        
    }
    
}
