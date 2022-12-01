import java.util.Scanner;
public class Agedetect
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Year of Birth");
        a=sc.nextInt();
        System.out.println("Enter Current year");
        b=sc.nextInt();
        if(b>a)
        System.out.println("Your age is "+( b-a));
        else if(b<a)
        System.out.println("Your age is "+(((2000+b)-(1900+a))));
        
        
    }
}
