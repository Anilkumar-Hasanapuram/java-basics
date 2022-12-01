import java.util.Scanner;
public class letters
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     String str=new String();
     str=sc.nextLine();
     int dcount=0,wcount=0;
     for(int i=0;i<str.length();i++)
     {
         char ch=str.charAt(i);
         if(Character.isDigit(ch))
         {
             dcount=dcount+1;
         }
         if(Character.isLetter(ch))
         {
             wcount=wcount+1;
         }
     }
     System.out.println("LETTERS "+wcount);
     System.out.println("DIGITS "+dcount);
 }
}
