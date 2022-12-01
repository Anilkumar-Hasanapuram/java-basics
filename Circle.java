import java.util.Scanner;
public class Circle
{
    public static void main(String args[])
    {
        //Write your code
        int x1,x2,y1,y2,r1,r2;
        Scanner Sc=new Scanner(System.in);
        x1=Sc.nextInt();
         x2=Sc.nextInt();
          y1=Sc.nextInt();
           y2=Sc.nextInt();
            r1=Sc.nextInt();
             r2=Sc.nextInt();
             double c=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
            if(c==r1+r2)
            {
                System.out.println("The circles are tangential");
            }
            else if(c<=r1+r2)
            {
                System.out.println("The circles overlap");
            }
            else
            {
                System.out.println("The circles do not overlap");
            }
             
        
    }
}
