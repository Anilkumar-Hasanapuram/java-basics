import java.util.Scanner;
class Reverses
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String a="";
      for(int i=0;i<s.length();i++)
      {
         char ch=s.charAt(i);
          a=ch+a;
      }
      
     System.out.println(a);
      
   }
}
