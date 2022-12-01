import java.util.Scanner;
public class upper1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int lower=0,upper=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upper=upper+1;
            }
            if(Character.isLowerCase(ch))
            {
                lower=lower+1;
            }
        }
        System.out.println("UPPER CASE "+upper);
        System.out.println("LOWER CASE "+lower);
    }
}
