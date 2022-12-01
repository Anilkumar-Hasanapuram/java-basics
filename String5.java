import java.util.Scanner;
class String5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,str1;
        str=sc.nextLine();
        str1=sc.nextLine();
        if(str.equals(str1))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are not same");
        }
       
    }
}//Code here
