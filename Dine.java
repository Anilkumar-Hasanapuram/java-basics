import java.util.Scanner;
public class Dine
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int a;
        String s;
     
        s=sc.nextLine();
        a=sc.nextInt();
        if(s.equals("front"))
        {
            if(a==1)
            {
                System.out.print("Left Handed");
            }
            else
            {
                System.out.println("Right Handed");
            }
        }
        else  if(s.equals("rear"))
        {
            if(a==2)
            {
                System.out.println("Left Handed");
            }
            else
            {
                System.out.println("Right Handed");
            }
        }
        
    }
}
