//Code here
import java.util.Scanner;
public class ndivision
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        //System.out.print("7");
        for(int i=a;i<b;i++)
        {
            if(i%7==0 && i%5!=0)
            {
                System.out.print(i+" ");
            }
            
        }
    }
}
