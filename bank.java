import java.util.Scanner;
public class bank
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int a=0,a1=0;
        char ch;
         int d=0;
         int n=4;
       // ch=sc.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            ch=sc.next().charAt(0);
        
       /* switch(ch)
        {
            case 'D':a=sc.nextInt();
                      d=d+a;
                      
                     break;
            case 'W':a1=sc.nextInt();
                      d=d-a1;
                     break;
        }*/
        
        if(ch=='D')
        {
            a=sc.nextInt();
            d=d+a;
            //System.out.println(d);
        }
        if(ch=='W')
        {
            a1=sc.nextInt();
            d=d-a1;
           // System.out.println(d);
        }
        
   
        
        }
         System.out.println(d);
        
    }
}
