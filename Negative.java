import java.util.*;
public class Negative{
public static int makeNegative(final int x) {
    //write your logic here
     int num=0;
     if(x==0)
     {
         num=0;
     }
     else if(x>0)
     {
         num=x*(-1);
        
     }
     else if(x<0)
     {
         num=x;
        
     }
    return num;
     }
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println(makeNegative(x));
}}
