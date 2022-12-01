import java.util.*;
public class Abbreviate {

  public static String abbrevName(String name)
   {
      String nstr="";
    for(int i=0;i<name.length();i++)
    {
    char ch=name.charAt(0);
    if(ch.equals(" "))
    {
        char ch1=ch+1;
    }
    System.out.println(ch);
    System.out.println(ch1);
 return nstr;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
System.out.println(abbrevName(a));
}}
