import java.util.*;
public class Traffic {

     public static String updateLight(String current) {
    //write your logic here
    String nstr="";
    if(current.equals("red"))
    {
        nstr="green";
    }
    else if(current.equals("green"))
    {
        nstr="yellow";
    }
    else if(current.equals("yellow"))
    {
        nstr="red";
    }
    return nstr;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String current=sc.nextLine();
System.out.println(updateLight(current));
}}
