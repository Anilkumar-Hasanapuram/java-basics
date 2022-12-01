import java.util.*;
public class Day {

    public static String getDay(int n) {
        //write your logic here
        String s="";
            if(n==1)
            {
                s="Sunday";
            }
            else if(n==2)
            {
                s="Monday";
            }
            else if(n==3)
            {
                s="Tuesday";
            }
            else if(n==4)
            {
                s="Wednesday";
            }
            else if(n==5)
            {
                s="Thursday";
            }
            else if(n==6)
            {
                s="Saturday";
            }
            else if(n>=7)
            {
                s="Wrong, please enter a number between 1 and 7";
            }
            return s;
 }
  

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(getDay(a));
}}
