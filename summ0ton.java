import java.util.*;
public class summ0ton
{
  public static String summp(int number)
  {
    //Write your code here
    int sum=0;
    if(number==0)
    {
       System.out.println("0=0");
    }
    else if(number<0)
    {
        System.out.println(number+"<0");
    }
    else
    {
    for(int i=0;i<=number;i++)
    {
        sum=sum+i;
        System.out.print(i+"+");
    }
    System.out.print("="+sum);
    }
    
    
    return "";
    
    //
  }


public static void main(String[] args)
    
    {
        Scanner input=new Scanner(System.in);
        
        int number=input.nextInt();
        System.out.println(summp(number));
       
    }
}    
