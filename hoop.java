import java.util.*;
public class hoop{
  public static String hoopCount(int n){
   //write your logic here
   String nstr="";
   if(n>=10)
   {
       nstr="Great, now move on to tricks";
   }
   else if(n<10)
   {
       nstr="Keep at it until you get it";
   }
   return nstr;
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
System.out.println(hoopCount(b));
}}
