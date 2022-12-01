import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
        //Write your code
        int a;
        int pr=6,di=5;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            
            System.out.print(pr+" ");
            pr=pr+di;
            di=di+5;
        }
    }
}
