import java.util.Scanner;
public class Amoeba1
  
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the number of Months :");
        a=sc.nextInt();
        Anil ak=new Anil();
        ak.Amoeb(a);
        //System.out.println("The amoeba size is "+sum);
        
    }
}
class Anil
{
    public static void Amoeb(int a)
    {
        int n[]={0,1,1,2,3,5,8,13,21,34,55,89};
       System.out.println("The amoeba size is "+n[a-1]);
        
    }
    
}
