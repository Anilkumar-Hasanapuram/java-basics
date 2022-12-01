import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextFloat();
        Area1 a1=new Area1();
        a1.ak(a,b,c,d);
    }
}
class Area1
{
    void ak(int a,int b,int c,float d)
    {
        System.out.println(a*a);
         System.out.println(b*c);
      
          System.out.printf("%.2f",3.141*d*d);;
    }
}
