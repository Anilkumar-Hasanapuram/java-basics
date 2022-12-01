import java.util.*;
public class remove{
    public static String remove(String str) {
        //write your logic here
        String nstr="";
        for(int i=1;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            nstr=nstr+ch;
        }
        return nstr;
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.next();
System.out.println(remove(a));
}}
