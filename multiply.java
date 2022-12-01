import java.util.*;
public class multiply{
    public static int simpleMultiplication(int n)
    {
        //write your logic here
        int sum=1;
        if(n%2==0)
        {
            sum=n*8;
        }
        else
        {
            sum=n*9;
        }
        return sum;
    }
    
    

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(simpleMultiplication(a));
}}
