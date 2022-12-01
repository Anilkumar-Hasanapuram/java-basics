import java.util.*;
public class Transport{
  public static int rentalCarCost(int d)
  {
     //write your logic here
     int total=0;
     if(d==1 ||d==2)
     {
       total=d*40;
     }
     else if(d>2 && d<7)
     {
        int  amount=d*40;
         total=amount-20;
     }
      else if(d>=7)
     {
        int  amount=d*40;
         total=amount-50;
     }
     return total;
   }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(rentalCarCost(a));
}}
