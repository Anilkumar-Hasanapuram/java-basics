import java.util.Scanner;
public class Grade
{
    public static void main(String args[])
    {
        //write your code
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
        if(m>100)
        {
            System.out.println("Invalid Input");
        }
        else if(m==100)
        {
            System.out.println("S");
        }
        else if(m>=90 && m<100)
        {
            System.out.println("A");
        }
        else if(m>=80 && m<90)
        {
            System.out.println("B");
        }
        else if(m>=70 && m<80)
        {
            System.out.println("C");
        }
        else if(m>=60 && m<70)
        {
            System.out.println("D");
        }
        else if(m>=50 && m<60)
        {
            System.out.println("E");
        }
        else if(m<50)
        {
            System.out.println("F");
        }
        
        
    }
}
