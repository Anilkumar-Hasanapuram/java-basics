import java.util.Scanner;
public class divisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        int count=0;
        number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
