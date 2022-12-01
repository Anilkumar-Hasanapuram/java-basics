import java.util.Scanner;
public class Factorial1
{
  
    public static void main(String[] args)
    {
        //Write your code
          
        Scanner sc=new Scanner(System.in);
         Factor f=new Factor();
         int n=sc.nextInt();
         f.facto(n);
         
        
}
}
class Factor
{
     public static void facto(int n)
    {
        int fact=1,x=1;
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
        
    
    //return fact;
    

}
