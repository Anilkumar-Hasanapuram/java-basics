import java.util.Scanner;
public class Microwave
{
    public static void main(String args[])
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        float a,b,total;
        System.out.println("Enter the number of items");
        a=sc.nextFloat();
        System.out.println("Enter the single item heating time");
        b=sc.nextFloat();
        if(a<3)
        {
            total=b/2;
            System.out.printf("The recommended heating time is %.2f",(total+b));
        }
        else
        {
            System.out.println("Number of items is more");
        }
        
    }
}
