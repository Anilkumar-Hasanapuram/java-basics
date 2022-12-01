//code here
import java.util.Scanner;
public class Assessment1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,weight;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        weight=b*75+c*50;
        if(weight<=a)
        {
            System.out.println("Boat is stable");
        }
        else
        {
            System.out.println("Boat is unstable");
        }
    }
}
