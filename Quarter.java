import java.util.*;
public class Quarter{
    public static int quarterOf(int month) 
    {
        //write your logic here
        int result=0;
        if(month>1 && month<=3)
        {
            result=1;
        }
        else if(month>3 && month<=6)
        {
            result=2;
        }
        else if(month>6 && month<=9)
        {
            result=3;
        }
        else if(month>9 && month<=12)
        {
            result=4;
        }
        return result;
        
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(quarterOf(a));
}}
