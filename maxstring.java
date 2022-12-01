import java.util.Scanner;
public class maxstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String a1,a2;
        a1=sc.nextLine();
        a2=sc.nextLine();
        int l1,l2;
        l1=a1.length();
        l2=a2.length();
        if(l1>l2)
        {
            System.out.println(a1);
        }
        else
        {
            System.out.println(a2);
        }
    }
}
