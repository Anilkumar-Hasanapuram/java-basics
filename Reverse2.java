import java.util.*;
public class Reverse{

  public static String solution(String str) {
    //write your logic here
    String nstr="";
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        nstr=ch+nstr;
    }
    return nstr;
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String b=sc.next();
System.out.println(solution(b));
}}
