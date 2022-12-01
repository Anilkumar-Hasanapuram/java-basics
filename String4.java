//Code here
import java.util.Scanner;
class String4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        String a="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            a=ch+a;
        }
        System.out.println(a);
    }
}
