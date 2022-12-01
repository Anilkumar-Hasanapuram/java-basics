import java.util.Scanner;
public class Lights
{
    public static void main(String args[])
    {
        //Write your code
        float d,s,time,t;
        Scanner sc=new Scanner(System.in);
        s=sc.nextFloat();
        d=sc.nextFloat();
        t=sc.nextFloat();
        if((s/d)>t)
        {
            System.out.println("yes");
        }
        if((s/d)<t)
        {
         System.out.println("no");

        }
    }
}
