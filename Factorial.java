import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        //Write your c
        int n,fact=1,x=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(fact<n)
        {
            x=x+1;
            fact=fact*x;
        }
        if(fact==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
 }  
    }
